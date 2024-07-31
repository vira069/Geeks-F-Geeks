//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        
        Arrays.sort(arr);
        String str1=arr[0];
        String str2=arr[arr.length-1];
        int index = 0;
        
        while(index<str1.length()){
            if(str1.charAt(index)==str2.charAt(index)){
                index++;
            }
            else{
                break;
            }
        }
        return index==0?"-1":str1.substring(0,index);
    }
}