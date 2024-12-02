package com.test.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Optional;

public abstract class GenericDAO<T>{

    Connection dbConnection;

    String url = "jdbc:oracle:thin:@localhost:3306:Test";
    String username = "root";
    String password = "123456";

    public GenericDAO() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        dbConnection = DriverManager.getConnection(url,username,password);
    }

    public abstract Optional<T> insert(T object);
    public abstract T update(T object);
    public abstract void delete(Long id);

}
