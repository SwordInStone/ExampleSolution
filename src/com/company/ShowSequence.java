package com.company;

public class ShowSequence {

    public static void main(String args[]){
        System.out.println(showSequence(7));
    }
    public static String showSequence(int value){
        if(value<0)return "value < 0";
        Integer result=0;
        if(value%2==1){
            result+=value;
            value-=1;
        }
        int HalfNumber=value/2;
        result+=HalfNumber*value;
        result+=HalfNumber;
        return result.toString();
    }
    //LoL

}
