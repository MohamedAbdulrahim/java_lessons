
package lec14v1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Lec14v1 {

    public static Connection getConnection() throws SQLException{
        String username = "scott";
        String password = "tiger";
        String thinconn ="jdbc:oracle:thin:@localhost:1521:ORCL"; // url
  //      DriverManager.registerDriver(new OracleDriver()); // to make connection ,, add from library  ,, this line like setup driver
        Connection conn = DriverManager.getConnection(thinconn,username,password); // to make connection with database 
                                                            // throws if given error ,, Connection is interface
        conn.setAutoCommit(false); // false : no autoCommit , true : make commit with every statement
        return conn;
    }
    public static void main(String[] args) {
        
        // JDBC : java database connectivity
                  // after jdbc : hyperNet , toplink
        
        
        //database navigator in JDeveloperto connect database >> ide connection > new connection
        
        // hostName : if on the same machine > localhost ,, on another machine/server > write ip address
        
        // SID : Service ID
        
        // Driver : to make java connect to database(specific on vendor) 
        
        // open sqlWorkSheet in jdeveloper if i need to make sql command ,, the most used thing driver of Oracle
        
        // jdbc connection url(uniform resource loactor) : to connect database
                // oracle format url :  "jdbc:orcl:thin:@localhost:1521:orcl"
        
        // Generic jdbc : used when jdeveloper don't know what is database vendor
        
        // any driver : has driver class (like the main method)
        
        /////////////////////
        
        //1.open Connection DB (object)
        //2.execute SQL statement
        
        ;
        try {
            Connection c = getConnection();
            System.out.println(c); //
            
            c.prepareStatement(""); // write sql statement ,, performance is better
            //OR
            c.createStatement();// write sql statement
            
            PreparedStatement ps = c.prepareStatement("INSERT INTO emp(empno,ename,depto) VALUES (?,?,?)"); // not write ; in sql statement
            // prepareStatement making like compile for sql statement if OK return Object has Interface
            // PreparedStatement Interface
            ps.setInt(1, 32); // values #1 
            ps.setString(2, "ali");
            ps.setInt(3, 10);
            //I can add more times >> prepareStatment
            ps.setInt(1, 32);
            ps.setString(2, "ali");
            ps.setInt(3, 10);
            int r = ps.executeUpdate(); // for insert , update , delete >> DML  ,,,, r is number of rows
            System.out.println(r+" rows inserted");
            
            c.commit();// to save
            
            PreparedStatement pss = c.prepareStatement("SELECT empno,ename,sal FROM employee");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int empno = rs.getInt("empno");
                String ename = rs.getString("ename");
                int sal = rs.getInt("sal");
            }
            rs.getMetaData(); // information
            
            c.close(); // close for connection ,  make commit 
                    } catch (SQLException ex) {
            System.out.println("Connection Error "+ex.getMessage());
            System.out.println(""+ex.getErrorCode()); // return int ,, so we can switch it for errors
        }
              
        
        // meta Data in java
                 
    }
    
}
