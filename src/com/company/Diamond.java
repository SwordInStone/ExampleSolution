package com.company;

import java.util.Arrays;

class Diamond {
    public static String print(int n) {
        if (n<0||n%2==0){
            return null;
        }
        char[] diamond = new char[n];
        Arrays.fill(diamond,'*');
        StringBuilder[] space = new StringBuilder[(n+1)/2];
        for(int i=0;i<(n+1)/2;i++){
            space[i]=new StringBuilder("");
            for(int j=0;j<i;j++)
            space[i].append(" ");
        }
        String ShineGem = new String(diamond);
        StringBuilder result = new StringBuilder();
        char newLine = '\n';
        boolean discriminant = false;
        for(int i = 1;i>0;){
            String line = space[(n-i)/2]+ShineGem.substring(0,i);
            result.append(line);
            System.out.println();
            if (discriminant||i==n){
                discriminant=true;
                i-=2;
            }
            else {
                i+=2;
            }

            result.append(newLine);

        }
        return result.toString();

    }
    public static void main(String[] args){
        System.out.println(print(5));
    }
}