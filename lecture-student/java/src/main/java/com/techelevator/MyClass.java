package com.techelevator;

import java.util.HashMap;

public class MyClass<T, V> {

    T ob;
    V ob2;

    HashMap<T, V> map = new HashMap<>();

//    MyClass(T ob){
//        this.ob = ob;
//    }
    MyClass(T ob, V ob2){
        this.ob = ob;
        this.ob2 = ob2;
    }

    void showType(){
        System.out.println(ob.getClass().getName() + " | "+ob2.getClass().getName());
    }

}
