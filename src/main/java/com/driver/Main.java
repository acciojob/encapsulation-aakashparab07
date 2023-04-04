package com.driver;

public class Main {
    public static void main(String []args)
    {
        RWOnly obj = new RWOnly();
        //obj.name="Swabhiman";  //Will give an error

        obj.setName("Swabhiman");
        String name=obj.getName();

        System.out.println(name);
    }

}