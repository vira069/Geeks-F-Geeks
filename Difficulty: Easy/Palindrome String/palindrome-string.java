//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String S) {
        // Create a StringBuilder to construct the reversed string
        StringBuilder str = new StringBuilder();
        int n = S.length();

        for(int i = n - 1; i >= 0; i--){
            str.append(S.charAt(i));
        }
        if(S.equals(str.toString())) {
            return 1;
        }
        return 0;
    }
}
