package com.company;

public class ShowSequence {

    public static void main(String args[]){
        System.out.println(showSequence(6));
    }
    public static String showSequence(int value){
        Integer result=0;
        int first=0;
        int second=value;
        while(first!=second){
            result+=first+second;
            first++;second--;
        }
        result+=first;
        return result.toString();
    }

}
