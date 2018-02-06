package com.pike96.ammozone.test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestAmmozone {
    public static void main(String args[]){
        //准备分类测试数据：

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (
                Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ammozone_ssm?useUnicode=true&characterEncoding=utf8",
                        "root", "admin");
                Statement s = c.createStatement();
        )
        {
            for (int i = 1; i <=7 ; i++) {
                String sqlFormat = "insert into category values (null, 'Test Category %d')";
                String sql = String.format(sqlFormat, i);
                s.execute(sql);
            }

            System.out.println("Successfully add 7 test categories");

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
