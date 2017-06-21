package com.constructors;

/**
 * Created by enilmaa on 2017-06-21.
 */
public class CakeInstance {
    public static void main(String args[]){
        Cake cake1 =new Cake();
        Cake cake2 = new Cake("pineapple",1.5,200);
        System.out.println("this prints default flavor mango ?? :"+cake1.flavor);
        System.out.println("this prints given flavor: "+cake2.flavor);
    }
}
