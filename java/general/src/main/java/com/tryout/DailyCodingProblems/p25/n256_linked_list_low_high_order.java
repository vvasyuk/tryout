package com.tryout.DailyCodingProblems.p25;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class n256_linked_list_low_high_order {
    public static void main(String[] args) {
        LinkedList<Integer> in = new LinkedList<Integer>();
        in.add(1);in.add(2);in.add(3);in.add(4);in.add(5);

        rearrange(in);
        in.forEach(System.out::println);
    }

    private static void rearrange(LinkedList<Integer> in) {
        boolean even = true;

        ListIterator<Integer> it = in.listIterator();

        while(it.hasNext()){
            Integer curr = it.next();

            System.out.println(curr + " idx: " + it.previousIndex() );

            if(it.hasNext()){
                if ( curr>in.get(it.nextIndex()) && even){
                    Collections.swap(in, it.previousIndex(), it.nextIndex());
                }

                if ( curr<in.get(it.nextIndex()) && !even){
                    Collections.swap(in, it.previousIndex(), it.nextIndex());
                }
            }
            even = !even;
        }
    }
}
