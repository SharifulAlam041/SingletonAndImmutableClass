package org.example;
//Bill Pugh Solution
public class DbConnection5 {
    private DbConnection5() {

    }
    private static class DbConnectionHelper {
        private static final DbConnection5 instanceObj = new DbConnection5();
    }
    public static DbConnection5 getInstance(){
        return DbConnectionHelper.instanceObj;
    }

}