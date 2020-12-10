package cn.rg.qmz;

import java.sql.Connection;
import java.sql.DriverManager;

public class Appclass {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/mysql?useUnicode=true&characterEncoding=UTF-8";
            Connection conn= DriverManager.getConnection(url,"root","123");
            System.out.println(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
