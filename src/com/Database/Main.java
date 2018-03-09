package com.Database;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String args []){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/Database/Beans.xml");

        MonsterJDBCTemplate monsterJDBCTemplate =
                (MonsterJDBCTemplate) context.getBean("monsterJdbcTemplate");



    }

}
