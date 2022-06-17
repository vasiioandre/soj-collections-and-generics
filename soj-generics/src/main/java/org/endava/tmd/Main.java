package org.endava.tmd;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] integerArray = {1, 2, 3, 4};
        Character[] charArray = {'a', 'b', 'c', 'd', 'e'};
        Double[] doubleArray = {1.5, 2.6, 3.7, 4.8};
        exchangeElementsInArray(integerArray, 1, 3);
        exchangeElementsInArray(charArray, 3, 4);
        exchangeElementsInArray(doubleArray, 0, 3);

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(6);
        intList.add(-5);
        intList.add(11);
        intList.add(20);
        countNumberOfPrimeNumbers(intList);

        List<Object> mixedList = new ArrayList<Object>();
        mixedList.add("Hello");
        mixedList.add(2);
        mixedList.add(1l);
        mixedList.add(4);
        mixedList.add("World");
        mixedList.add(7);
        countNumberOfPrimeNumbers(mixedList);
        mixedList.add(15);
    }

    static <E> void exchangeElementsInArray(E[] anyArray, int firstElementPosition, int secondElementPosition) {
        E aux = anyArray[firstElementPosition];
        anyArray[firstElementPosition] = anyArray[secondElementPosition];
        anyArray[secondElementPosition] = aux;

        System.out.println("Exchange the positions of two different elements:");
        for (E e : anyArray) {
            System.out.println(e);
        }
    }

    static <E> void countNumberOfPrimeNumbers(List<E> anyList) {
        int count = 0;
        for (E i : anyList) {
            if (i instanceof Integer) {
                if ((int) i >= 2 && isPrime((int) i)) {
                    count += 1;
                }
            }
        }
        System.out.println("Number of prime numbers: " + count);
    }

    static boolean isPrime(int number) {
        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
                int j = number % i;
                return false;
            }
        }
        return true;
    }
}