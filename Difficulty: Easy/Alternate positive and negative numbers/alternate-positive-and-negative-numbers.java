//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
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
        // Create separate lists for positive and negative numbers
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        
        // Populate the positive and negative lists
        for (int i = 0; i < arr.size(); i++) {
            int tempNum = arr.get(i);
            if (tempNum < 0) {
                negative.add(tempNum);
            } else {
                positive.add(tempNum);
            }
        }
        
        // Rearrange by alternating positive and negative numbers
        int pos = 0, neg = 0, i = 0;
        while (pos < positive.size() && neg < negative.size()) {
            arr.set(i++, positive.get(pos++)); // Set positive element
            arr.set(i++, negative.get(neg++)); // Set negative element
        }
        
        // If there are remaining positive numbers, add them
        while (pos < positive.size()) {
            arr.set(i++, positive.get(pos++));
        }
        
        // If there are remaining negative numbers, add them
        while (neg < negative.size()) {
            arr.set(i++, negative.get(neg++));
        }
    }
}
