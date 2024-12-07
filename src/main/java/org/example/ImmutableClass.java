package org.example;

import java.util.ArrayList;
import java.util.List;

final class ImmutableClass {
    private final String name;
    private final List<Object> petNameList;
    ImmutableClass(String name,List<Object> petNameList) {
        this.name = name;
        this.petNameList = petNameList;
    }

    public String getName() {
        return this.name;
    }

    public List<Object> getPetNameList() {
        //this is required for making the list final
        //means you can now point it to new list, but still can add, delete values in it
        //so thats why we send the copy of it
        return new ArrayList<>(petNameList);
    }
}
