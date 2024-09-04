//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        if (tc == 1) {
            System.out.println(-1);
            return;
        }
        while (tc-- > 0) {
            String input = br.readLine();
            String[] inputArray = input.split("\\s+");
            ArrayList<Integer> arr = new ArrayList<>();

            for (String s : inputArray) {
                arr.add(Integer.parseInt(s));
            }

            new Solution().rearrange(arr);
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        
        // Separate the array into positive and negative lists
        for (int num : arr) {
            if (num >= 0) {
                positive.add(num);
            } else {
                negative.add(num);
            }
        }
        
        // Clear the original array to fill it with the rearranged elements
        arr.clear();
        
        int posIndex = 0, negIndex = 0;
        boolean turnPositive = true; // Start with a positive number
        
        // Merge the positive and negative lists alternately
        while (posIndex < positive.size() && negIndex < negative.size()) {
            if (turnPositive) {
                arr.add(positive.get(posIndex++));
            } else {
                arr.add(negative.get(negIndex++));
            }
            turnPositive = !turnPositive;
        }
        
        // If there are remaining positive numbers, add them to the list
        while (posIndex < positive.size()) {
            arr.add(positive.get(posIndex++));
        }
        
        // If there are remaining negative numbers, add them to the list
        while (negIndex < negative.size()) {
            arr.add(negative.get(negIndex++));
        }
    }
}
