/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQLConection;
//Thêm thư viện hỗ trợ JDBC
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
     public static  Connection getConnection(){
         //Thực hiện kết nối tới SQL Server
        Connection connection = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433; databaseName=QLTV";
            String user = "sa";
            String pass = "123456@Ab";
            connection = DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
    //Thực hiện đóng kết nối
    public void closeConnection(Connection con){
        if (con != null){
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    //Kiểm tra kết nối
    public static void main(String[] args) {
        System.out.println(getConnection());
    }
}
