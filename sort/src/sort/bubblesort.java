package sort;
import java.io.*;
import java.util.*;

public class bubblesort {
	 void BubbleSort(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (arr[j] > arr[j+1])
	                {
	                    // swap temp and arr[i]
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
	            // Returns index of x if it is present in arr[l..
	            // r], else return -1
	            int binarySearch(int arr[], int l, int r, int x)
	            {
	                if (r>=l)
	                {
	                    int mid = l + (r - l)/2;
	         
	                    // If the element is present at the 
	                    // middle itself
	                    if (arr[mid] == x)
	                       return mid;
	         
	                    // If element is smaller than mid, then 
	                    // it can only be present in left subarray
	                    if (arr[mid] > x)
	                       return binarySearch(arr, l, mid-1, x);
	         
	                    // Else the element can only be present
	                    // in right subarray
	                    return binarySearch(arr, mid+1, r, x);
	                }
	            }
	            }
