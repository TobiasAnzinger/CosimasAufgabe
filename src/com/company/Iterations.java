package com.company;

import java.util.ArrayList;

public class Iterations {

    int checkSumIteration2;
    int checksumIteration3;
    int checksumIteration4;
    int checksumIteration5;
    int checksumIteration6;

    /**
     * multiplication of all digits in odd places by 2
     */
    public ArrayList<Integer> iteration1(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i = i + 2) {
            int number = list.get(i);
            list.set(i, number * 2);
        }
        return list;
    }

    /**
     * checksum of all digits in odd places
     */
    public ArrayList<Integer> iteration2(ArrayList<Integer> list) {
        Converter converter = new Converter();
        for (int i = 0; i < list.size(); i = i + 2) {
            int number = list.get(i);
            ArrayList<Integer> digits = converter.convertToArrayList(number);
            int sum = 0;
            for (int k : digits) {
                sum = sum + k;
            }
            checkSumIteration2 = checkSumIteration2 + sum;
            list.set(i, sum);
        }
        System.out.println("checksum of iteration 2: " + checkSumIteration2);
        return list;
    }


    /**
     * add all even digits except "PZ"
     */
    public ArrayList<Integer> iteration3(ArrayList<Integer> list) {
        for (int i = 1; i < list.size() - 1; i = i + 2) {
            int number = list.get(i);
            checksumIteration3 = checksumIteration3 + number;
        }
        System.out.println("checksum of iteration 3: " + checksumIteration3);
        return list;
    }

    /**
     * add all even digits except "PZ"
     */
    public void iteration4() {
        checksumIteration4 = checkSumIteration2 + checksumIteration3;
        System.out.println("checksum of iteration 4: " + checksumIteration4);
    }

    /**
     * round to the next by 10 divisible number
     */
    public void iteration5() {
        checksumIteration5 = (checksumIteration4 + 10) / 10 * 10;
        System.out.println("checksum of iteration 5: " + checksumIteration5);
    }

    /**
     * checksumIteration5 - checksumIteration4
     */
    public void iteration6() {
        checksumIteration6 = checksumIteration5 - checksumIteration4;
        System.out.println("final checksum: " + checksumIteration6);
    }

    /**
     * checks if the calculated checksum is the same as the last element of the ArrayList
     * @param list the ArrayList from which the last digit is compared with checksumIteration6
     * @return boolean
     */
    boolean verification(ArrayList<Integer> list) {
        return checksumIteration6 == list.get(list.size() - 1);
    }

}
