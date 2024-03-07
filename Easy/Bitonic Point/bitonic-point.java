//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaximum(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    int findMaximum(int[] arr, int n) {
        // code here
       
       int maxElement = 0;
        if(arr.length >0) {
            int left = 0;
            int right = arr.length - 1; // 4
            if(arr[right - 1] < arr[right]) {
                maxElement =  arr[right];
            } 
            if(arr[left] > arr[left+1]) {
                maxElement = arr[left];
            }
            while(left <= right) {
                int mid = (left + right) / 2; 
                if(mid > 0 && arr[mid] > arr[mid-1] && (mid+1 <= (arr.length - 1) && arr[mid] > arr[mid+1])) { 
                    maxElement =  arr[mid];
                    break;
                } else if(mid+1 <= (arr.length - 1) && arr[mid] < arr[mid+1] )  { 
                    left = mid +1; 
                } else {
                    right = mid - 1;
                }
            }            
        }
        
        return maxElement;
        
        
    }
    }
