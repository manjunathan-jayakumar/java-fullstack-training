package com.programming.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class CheckedException {

    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            Reader reader = new InputStreamReader(System.in);
            br= new BufferedReader(reader);
            String str;
            do {
                System.out.println("Enter string, I will read it for you");
                str = br.readLine();
                System.out.println("Str is "+ str);
            } while(!str.equalsIgnoreCase("exit"));
        }catch(IOException e) {
            e.printStackTrace();
        }finally {
            if(br != null){
                try {
                    br.close();
                }
                catch(IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
