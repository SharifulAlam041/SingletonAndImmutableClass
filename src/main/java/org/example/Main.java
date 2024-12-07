package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DbConnection dbConnection = DbConnection.getInstance();
        List<Object> petNames = new ArrayList<>();
        petNames.add("mimi");
        petNames.add("putu");
        ImmutableClass immutableClass = new ImmutableClass("myName",petNames);
        immutableClass.getPetNameList().add("Hello");
        System.out.println(immutableClass.getPetNameList());
    }
}