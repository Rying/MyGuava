package com.thoughtworks.ns.env;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.List;

import static com.google.common.collect.Collections2.filter;
import static com.google.common.collect.Lists.transform;

public class HelloWorld {


    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static List OddReturn(ImmutableList<Integer> immutableList) {
//        List<Integer> list = new ArrayList<Integer>();
//
//        for (Integer listElement : immutableList)
//        {
//            if(listElement % 2 == 1)
//                list.add(listElement);
//        }
        List<Integer>list = new ArrayList(filter(immutableList,new Predicate<Integer>() {
            public boolean apply(Integer input) {
                return input % 2 == 1;  //To change body of implemented methods use File | Settings | File Templates.
            }
        }));
        return list;
    }

    public static List EvenMultiplyTwo(ImmutableList<Integer> immutableList) {
        List<Integer> list = new ArrayList<Integer>(transform(immutableList,new Function<Integer, Integer>() {
            public Integer apply(Integer input) {
                if(input % 2 ==0)
                    return input*2;
                else
                    return input;
            }
        }));
//        List<Integer> list = new ArrayList<Integer>();
//        for (Integer listElement : immutableList)
//        {
//            if (listElement % 2 == 0)
//            {
//                list.add(listElement*2);
//            }
//            else
//            {
//                list.add(listElement);
//            }
//        }
        return list;
    }



    public static String Find(ImmutableList<Integer> immutableList, Integer i) {
//        for(Integer listElement : immutableList)
//        {
//            if(listElement.equals(i))
//            {
//                return "Hello, "+i;
//            }
//        }
//        return "Not found";
        if(immutableList.indexOf(i)>=0)
            return "Hello, "+i;
        else
            return "Not found";
    }

    public static int sum(int... toSums) {
        int total = 0;
        for (int i : toSums) {
            total += i;
        }

        return total;
    }
}

