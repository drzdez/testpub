/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.gopas.jprog1.filereadprocess;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Student
 */
public class LoadCSVIntoDB {    
    
    static final Logger logger = Logger.getLogger(LoadCSVIntoDB.class.getName());
    
    private static final String CSV_DIVIDER = ",";
    private static final int HEADER_ROWS = 1;
    private static final String JDBC_URL = "jdbc:h2:mem:test"; // "jdbc:h2:./nametest"
    private static final String SQL_CREATE_TABLE = "Create table tvary (ID int primary key, name varchar(15), size int, colorrgb int)";
    private static final String SQL_PSTMT_INSERT = "Insert into tvary (ID, name, size, colorrgb) values (?, ?, ?, ?)";
    private static final String SQL_STMT_SELECT = "select * from tvary";
    
      
    public static void main(String[] args) throws FileNotFoundException, SQLException {
       var fr = new FileReader("C:\\Users\\Student\\Documents\\NetBeansProjects\\FileReadProcess\\data-csv-graf-objekty.txt");
       var br = new BufferedReader(fr); 
       
       var connection = DriverManager.getConnection(JDBC_URL);      
       var statement = connection.createStatement();
       statement.execute(SQL_CREATE_TABLE);
       var pstmt = connection.prepareStatement(SQL_PSTMT_INSERT);

       br.lines()
                 .skip(HEADER_ROWS)
                 .forEach(lineIn -> {
                     
           try {
               var listVals = List.of(lineIn.split(CSV_DIVIDER));
               logger.log(Level.INFO, "write into db: {0}", lineIn);
               pstmt.setInt(1, Integer.decode(listVals.get(0)));
               pstmt.setString(2, listVals.get(1));
               pstmt.setInt(3, Integer.decode(listVals.get(2)));
               pstmt.setInt(4, Integer.decode(listVals.get(3)));
               pstmt.execute();
           } catch (SQLException ex) {
               logger.severe(ex.getMessage());
           }
                 });
       
       var resSet = statement.executeQuery(SQL_STMT_SELECT);      
       while(resSet.next()) {
           StringBuilder logMessage = new StringBuilder("read  from db: ");
           for(int i=1; i <= resSet.getMetaData().getColumnCount(); i++){
               logMessage.append(resSet.getString(i));
               logMessage.append(",");
           }
           logger.log(Level.INFO, "write into db: {0}", logMessage.toString());
       }  
        connection.close();    
    }
}
