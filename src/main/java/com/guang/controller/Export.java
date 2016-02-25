package com.guang.controller;

import com.guang.daomain.User;
import com.guang.service.UserService;
import com.guang.util.BeanToMapUtil;
import com.guang.util.ExportUtil;
import com.guang.util.UUIDUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.beans.IntrospectionException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by admin on 2016/2/25.
 */
@Controller
@RequestMapping("/export")
public class Export {

    @Resource
    private UserService userService;

    @RequestMapping("exportExcel")
    public void exportExcel(HttpServletRequest request, HttpServletResponse response) {
        HSSFWorkbook workbook = null;
        OutputStream out = null;
        try {
            //构建thead
            Map<String, String> thead = new TreeMap<String, String>();
            thead.put("phone", "手机号码");
            thead.put("userName", "姓名");
            thead.put("sex", "性别");
            thead.put("city", "所在城市");
            //生成tbody
            List<Map<String, String>> tbody = new ArrayList<Map<String, String>>();
            List<User> users = userService.getUsers();
            for (User user : users) {
                Map userMap = BeanToMapUtil.convertBean(user);
                tbody.add(userMap);
            }
            //生成数据
            workbook = ExportUtil.buildExcel(thead, tbody);

            //构建返回数据
            HttpSession session = request.getSession();
            session.setAttribute("state", null);
            response.setContentType("application/vnd.ms-excel");
            // 进行转码，使其支持中文文件名
            String codedFileName = java.net.URLEncoder.encode(UUIDUtil.buildUUID(), "UTF-8");
            System.out.println("codedFileName" + codedFileName);
            response.setHeader("content-disposition", "attachment;filename=" + codedFileName + ".xls");
            //将数据返回给前台
            out = response.getOutputStream();
            workbook.write(out);

        } catch (IntrospectionException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
                workbook.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("图片生成中");
    }

}
