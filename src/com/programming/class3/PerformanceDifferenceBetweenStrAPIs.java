package com.programming.class3;

public class PerformanceDifferenceBetweenStrAPIs {
    public static void main(String[] args){
        long t;
        {
            String str = new String("");
            t = System.currentTimeMillis();
            for (int i = 100_000_00; i >= 0; --i) {
                str.concat("");
            }
            System.out.println("String object API took " + (System.currentTimeMillis() - t) + " ms");
        }
        {
            String str = "";
            t = System.currentTimeMillis();
            for (int i = 100_000_00; i >= 0; --i) {
                str.concat("");
            }
            System.out.println("String literal API took " + (System.currentTimeMillis() - t) + " ms");
        }
        {
            StringBuffer sb = new StringBuffer("");
            t = System.currentTimeMillis();
            for (int i = 100_000_00; i >= 0; --i) {
                sb.append("");
            }
            System.out.println("StringBuffer API took " + (System.currentTimeMillis() - t) + " ms");
        }
        {
            StringBuilder sb = new StringBuilder("");
            t = System.currentTimeMillis();
            for (int i = 100_000_00; i >= 0; --i) {
                sb.append("");
            }
            System.out.println("StringBuilder API took " + (System.currentTimeMillis() - t) + " ms");
        }
    }
}
