package com.guang.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by admin on 2016/2/22.
 */
public interface UserDAO {
    //@Select("SELECT LOG_PW FROM person WHERE LOG_NM = #{name}")
    //通过@Select注释也可以不用写xml直接进行数据库操作，但是在比较复杂的查询情况下还是需要xml的（官方的说法），所以这里还是使用xml的方法
    String getUsers();
    //@Param是一个注解，表示传进去的参数名字，在xml当中通过@Param括号里面的名字，可以获取到传进去的参数

}
