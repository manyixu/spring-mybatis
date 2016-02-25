package com.guang.util;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by admin on 2016/2/25.
 */
public class ExportUtil {

    public static HSSFWorkbook buildExcel(Map<String, String> thead, List<Map<String, String>> tbody){
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet();
        HSSFRow row = sheet.createRow(0);
        HSSFCell cell = null;
        //构建表头
        Set<String> ths = thead.keySet();
        List<String> list2 = new ArrayList<String>();
        int i = 0;
        for (String th : ths) {
            cell = row.createCell(i++);
            cell.setCellValue(thead.get(th));
            list2.add(th);
        }
        //构建表体
        for (i = 1; tbody.size() > i; i++) {
            row = sheet.createRow(i);
            Map<String, String> td = tbody.get(i);
            for (int j = 0; j < thead.size(); j++){
                System.out.println(list2.get(j) + list2.toString());
                cell = row.createCell(j);
                String tdstr = td.get(list2.get(j));
                cell.setCellValue(tdstr);
            }
        }

        return workbook;
    }

}
