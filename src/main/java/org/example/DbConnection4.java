package org.example;
//Double check lock block
public class DbConnection4 {
    private static volatile DbConnection4 connObject;
    private DbConnection4() {

    }
    public static DbConnection4 getInstance(){
        if(connObject==null) {
            synchronized (DbConnection4.class){
                if(connObject==null) {
                    connObject = new DbConnection4();
                }
            }
        }
        return connObject;
    }

}