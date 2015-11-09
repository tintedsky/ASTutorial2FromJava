package com.example.xiaoqian_niu.astutorial2fromjava;
import java.lang.String;
/**
 * Created by xiaoqian-niu on 2015-11-08.
 */
public class Person {
    private String name;
    private int    height;

    Person(String n, int h){
        name = n;
        height = h;
    }

    String Walk(){
        return name+" is walking.";
    }

    int getHeight(){
        return height;
    }
}
