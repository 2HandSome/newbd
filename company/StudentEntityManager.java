package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentEntityManager {
    private static String database_url = "jdbc:mysql://localhost:3306/student?useSSL=false";
    private static String database_user = "user";
    private static String database_pass = "root";
    private static Connection db;
    private static Statement stmt;


    public static Connection connect(){
        try {
            db = DriverManager.getConnection(database_url, database_user, database_pass);
            String sql = "CREATE TABLE IF NOT EXISTS students(id int NOT NULL,firstname varchar(255),lastname varchar(255),year_of_birth varchar(255),average_mark varchar(255))";
            stmt.executeUpdate(sql);
            return db;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void exicute(Connection db, String sql){

        try {
            stmt = db.createStatement();
            stmt.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
    
    // +constructor()

    // метод который записывает в ДБ 1 студента
    public static void save(Student entity){
        Integer id = entity.getId();
        String firstname = entity.getFirstname();
        String lastname = entity.getLastname();
        Integer year_of_birth = entity.getYear_of_birth();
        Float average_mark = entity.getAverage_mark();
        String sql = "INSERT INTO students VALUE('"+id+"', '"+firstname+"','"+lastname+"'. '"+year_of_birth+", '"+average_mark+"')";
        Connection db = connect();
        exicute(db,sql);
    }

    // метод который удаляет студента
    public static void delete(Student entity){

    }

    // метод который возвращает список студентов
    /*public static ArrayList<Student> all(){
        return Student;
    }
    */
}
