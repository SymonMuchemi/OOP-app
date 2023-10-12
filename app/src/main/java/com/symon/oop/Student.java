package com.symon.oop;

public class Student {
    String name;
    String gender;
    int ID;

    // constructor
    public Student (int ID, String name, String gender){
        this.gender = gender;
        this.ID = ID;
        this.name = name;
    }


    public String Display(){
        return "DeKUT";
    }


}
