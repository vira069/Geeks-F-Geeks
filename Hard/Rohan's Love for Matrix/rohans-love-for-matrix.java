//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.firstElement(n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static int firstElement(int n) {
        // code here
        int mod = 1000000007;
         
         if(n<=2) return 1;
         
         int stepOne = 1;
         int stepTwo = 1;
         int sum = 0;
         for(int i=3;i<=n;i++){
             sum = (stepOne+stepTwo)%mod;
             stepOne = stepTwo;
             stepTwo = sum;
         }
         return sum;
    }
}