package com.BasicSyntax;


public class NewArray {
public static void main(String args[]){
    String[] a=new String[2];
    a[0]="first";
    a[1]="second";
    //for each loop

    for(String s : a){
        System.out.println(s);
    }
}

}

/*output:

first
second

*/
