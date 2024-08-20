package com.programming.class5;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildcard {

    public static void main(String[] args) {

        List<Integer> listInt = new ArrayList<>();
        listInt.add(123);
        listInt.add(234);
        listInt.add(345);
        listInt.add(456);

        List<Number> listNum = new ArrayList<>();
        listNum.add(12.3f);
        listNum.add(23.4f);
        listNum.add(1234L);
        listNum.add(456);

        List<Double> listDo = new ArrayList<>();
        listDo.add(123.34D);

        System.out.println("Print Integer Data");
        showLowerBoundedWildcard(listInt);

        System.out.println("Print Number Data");
        showLowerBoundedWildcard(listNum);

//        System.out.println("Print Double Data");
//        showLowerBoundedWildcard(listDo);
    }

    // ? super - is how we set the lower limit to restrict the scope of data.
    static void showLowerBoundedWildcard(List<? super Integer> list) {  // change `Integer` to `Double` to enable Number and Double
        for(Object ob: list) {
            System.out.print(ob + " ");
        }
        System.out.println();
    }
}
