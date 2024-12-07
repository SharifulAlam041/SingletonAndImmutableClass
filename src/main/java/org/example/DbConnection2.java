package org.example;
//Lazy Initialization
public class DbConnection2 {
    private static DbConnection2 connObject;
    private DbConnection2() {

    }
    public static DbConnection2 getInstance(){
        if(connObject==null) {
            connObject = new DbConnection2();
        }
        return connObject;
    }

}