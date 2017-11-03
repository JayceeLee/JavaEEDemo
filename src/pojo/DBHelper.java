package pojo;

import java.sql.*;

/**
 * Created by Administrator on 2017/10/30.
 */
public class DBHelper {

    private Connection conn;    //数据库链接对象
    private Statement stmt;     //sql语句执行对象

    private static final String driverName ="com.mysql.jdbc.Driver";
    private static final String url ="jdbc:mysql://localhost:3306";
    private static final String sDropDB = "drop database if exists userdb";
    private static final String sCreateDB = "create database userdb";
    private static final String sUserDB = "use userdb";
    private static final String sDropTb = "drop table if exists user";
    private static final String sCreateTb = "create table user (account varchar(20),password varchar(20))";
    private static final String sInsert = "insert into user values('admin','123456')";



    public DBHelper(){
        try{
            //加载mysql 驱动器
            Class.forName(driverName);

            //与数据库建立链接
            conn = DriverManager.getConnection(url,"root","1234");
            //初始化sql对象
            stmt = conn.createStatement();
            stmt.execute(sDropDB);
            stmt.execute(sCreateDB);
            stmt.execute(sUserDB);
            stmt.execute(sDropTb);
            stmt.execute(sCreateTb);
            stmt.execute(sInsert);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Boolean Query(User user)throws SQLException{
        ResultSet rs = null;
        rs = stmt.executeQuery("select * from user where account = '"+user.getAccount()+"' and password = '"+user.getPassword()+"'");
        return rs.next();
    }

}
