/**
 * Java 1. Homework 3.
 *
 * @author Dmitry Morgachev
 * @version 12.04.2022
 */
package ru.gb.lesson3;

import java.util.Arrays;
import java.util.Random;
import java.lang.Math;

public class Homework3 {

    static Random random = new Random();

    public static void main(String[] args) {
        changeNum();
        emptyMassive();
        minSix();
        diagonal();
        int[] arr = scMassive(10, 5);
        System.out.println(Arrays.toString(arr));
        int[] arr1 = minmaxValue(100);
    }

    static void changeNum() {
        int[] arr = {0, 1, 0, 0, 0, 1, 0, 1, 1};
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                System.out.print(1 + " ");
            } else {
                System.out.print(0 + " ");
            }
        }
        System.out.println();
    }

    static void emptyMassive() {
        int[] arr = new int[100];
        for(int i = 1; i < arr.length; i++) {
            arr[i] = i;
            System.out.println("i = " + i);
        }

    }

    static void minSix() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 6) {
                System.out.print(arr[i] * 2 + " ");
            }
        } System.out.println();
    }

    static void diagonal() {
        int[][] table = {
                {0, 1, 1, 2},
                {1, 0, 2, 1},
                {1, 2, 0, 1},
                {2, 1, 1, 0}
        };
        for(int i = 0; i < table.length; i++) {
            System.out.println(Arrays.toString(table[i]));
        }
    }

    static int[] scMassive(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }

    static int[] minmaxValue(int buf) {
        int[] arr1 = new int[buf];
        for(int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt();
        }
        int min, max = min = arr1[0];
        for(int i : arr1) {
            min = Math.min(min, i);
            max = Math.max(max, 1);
        }
        System.out.println("Min: " + min + "; " + "Max: " + max + ".");
        return arr1;
    }
}