package org.example;
//Synchronization block
public class DbConnection3 {
    private static DbConnection3 connObject;
    private DbConnection3() {

    }
    synchronized public static DbConnection3 getInstance(){
        if(connObject==null) {
            connObject = new DbConnection3();
        }
        return connObject;
    }

}