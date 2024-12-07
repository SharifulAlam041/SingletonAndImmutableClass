package org.example;
//Eager Initialization
public class DbConnection {
    private static DbConnection connObject = new DbConnection();
    private DbConnection() {

    }
    public static DbConnection getInstance(){
        return connObject;
    }

}
