package com.epam.mjc.stage0;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        String [] seasonArr;
        seasonArr = new String[]{"winter", "spring", "summer", "autumn"};
        return seasonArr;

    }

    /**
     * Generate an int[] array of consecutive positive integers
     * starting at 1 of the given length (length parameter > 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1]
     * length = 3  -> [1, 2, 3]
     * length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int [] arr;
        arr = new int[length];
        for (int i=0; i<length; i++){
            arr [i] = i+1;
        }
        return arr;

    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9
     * arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int summa = 0;
        for (int i=0; i<arr.length; i++){
            summa = summa + arr[i];
        }
        return summa;

    }

    /**
     * Return the index of the first occurrence of number in the arr array.
     * If there is no such element in the array, return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2
     * arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        int index = -1;
        for (int i=0; i<arr.length; i++){
            if (arr[i] == number){
                index = i;
                break;
            }
        }
        return index;

    }

    /**
     * Return the new String[] array obtained from the arr array
     * by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"]
     * arr = ["pineapple", "apple", "pen"] -> ["pen", "apple", "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        String [] arr2;
        arr2 = new String[arr.length];
        for (int i=0; i<arr.length; i++){
            arr2[i] = arr[arr.length-1-i];
        }
        return arr2;


    }

    /**
     * Return new int[] array obtained from arr int[] array
     * by choosing positive numbers only.
     * P.S. 0 is not a positive number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3]
     * arr = [-1, -2, -3]   -> []
     * arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int [] arr2;
        int count=0;
        int len2=0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] > 0) {
                len2++;

            }

        }
        arr2 = new int[len2];
        for (int i=0; i<arr.length; i++){
            if (arr[i]>0){
                arr2[count]= arr[i];
                count++;

            }

        }
        return arr2;

    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules:
     * Incoming one-dimensional arrays must be arranged in ascending order of their length;
     * numbers in all one-dimensional arrays must be in ascending order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]]
     * arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1].length < arr[j].length) {
                    int[] swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }

        }
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length-1; j++){
                for (int k = 0; k < arr[i].length-1-i; k++){
                    if (arr[i][k+1]<arr[i][k]){
                        int swap = arr[i][k];
                        arr[i][k] = arr[i][k+1];
                        arr [i][k+1] = swap;
                    }
                }

            }

        }
        return arr;

    }
}




 //public static void main (String[]args){
        //int[][] unsorted = {{1,2,3},{1,2},{5,4,6,7},{1,5,4}, {7,8,9}};
        //int[][] sorted = sortRaggedArray(unsorted);





