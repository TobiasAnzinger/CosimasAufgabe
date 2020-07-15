package com.company;

import java.util.ArrayList;

public class Converter {

    /**
     * converts a string with numbers to an ArrayList<Integer> with one digit in each element
     * @param aString the string which will be converted
     * @return an ArrayList with one digit in each element
     */
    ArrayList<Integer> convertToArrayList(String aString){
        char[] array = aString.toCharArray();
        return getArrayList(array);
    }

    /**
     * converts an int to an ArrayList<Integer> with one digit in each element
     * @param number the int which will be converted
     * @return an ArrayList with one digit in each element
     */
    ArrayList<Integer> convertToArrayList(int number){
        char[] array = ("" + number).toCharArray();
        return getArrayList(array);
    }

    private ArrayList<Integer> getArrayList(char[] array) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (char i: array) {
            try {
                arrayList.add(Integer.parseInt(String.valueOf(i)));
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        return arrayList;
    }
}
