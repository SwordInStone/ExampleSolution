package com.company;
import java.util.Date;
public class Main {


        static char massive[][] = new char[5][5];

        public static void main(String[] args) throws Exception {
            fill(massive);

        }

        private static char[][] fill(char massive[][]){
            for(int x=0;x<5;x++){
                for(int y=0;y<5;y++){
                    if(random(x,y))massive[x][y]='.';
                    else massive[x][y]='#';
                    System.out.print(massive[x][y]+" ");
                }


            }
            return massive;
        }
        private static boolean random(int x,int y){
            long random=25*(new Date().getTime()%4);
            try {
                Thread.sleep(1);
            }
            catch(Exception e){
            }
            while(y>0){
                if(massive[x][y]=='#')
                    random+=33;
                else if(massive[x][y]=='.')random-=66;
                y--;
            }
            boolean result=true;
            if(random<75)return false;

            return result;
        }

}
