package com.ifpackage;


public class IfelseifCondition {

    public static void main(String args[]){
        int a=10;
        int b=10;
        if(a>b){
           System.out.println(a+" is greater than "+b);
        }
        else if(a==b){
            System.out.println(a+" is equal to "+b);
        }else{
            System.out.println(a+" is less than "+b);
        }
    }
}
/* output

10 is equal to 10
*/
