//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().majorityElement(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int majorityElement(int arr[]) {
        // Optimise approach -> Sorting -> Moore Voting Algorithm
        int n = arr.length;
        int freq = 0, ans = 0;
        for(int i=0 ;i<n;i++){
            if(freq == 0){
             ans = arr[i];
            }
            if(ans == arr[i]){
                freq++;
            }
            else{
                freq--;
            }
        }
         freq = 0;
        for (int num : arr) {
            if (num == ans) {
                freq++;
            }
        }

        if (freq > n / 2) {
            return ans;
        } else {
            return -1;
        }
    }
}
