package com.josh.jdbc;
import java.util.*;

public class A1 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(4);
        list.add(8);
        list.add(10);
        list.add(19);
        list.add(20);
        int count=0;
        int add=0;
        for(int i=0;i<list.size();i++){
            add=add+list.get(i);
            count++;
        }
        System.out.println("Length of list :"+count);
        System.out.println("Sum of list :"+add);
        list.stream().filter(x ->x%2!=0).forEach(num -> System.out.print(num+" "));
    }
}
