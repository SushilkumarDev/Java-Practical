
// Problem Statement
// Given a sorted array and a value x, the floor of x is the largest element in array smaller than or equal to x. Write efficient functions to find floor of x. Input :  arr= {1, 2, 8, 10, 10, 12, 19}, x = 5 Output : 2


import java.io.*;
import java.util.*;
import java.lang.*;
class Floorinasortedarray {
        static int floorSearch(int arr[], int n, int x){
          if (x >= arr[n - 1])
            return n - 1;
          if (x < arr[0])
            return -1;
          for (int i = 1; i < n; i++)
            if (arr[i] > x)
                return (i - 1);
          return -1;
        }
       public static void main(String[] args){
        int arr[] = { 1, 2, 4, 6, 10, 12, 14 };
        int n = arr.length;
        int x = 7;
        int index = floorSearch(arr, n - 1, x);
        if (index == -1)
            System.out.print("Floor of " + x + " doesn't exist in array ");
        else
            System.out.print("Floor of " + x + " is "+ arr[index]);
      }
}