//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.evenlyDivides(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    static int evenlyDivides(int N){
        // code here
        String n = String.valueOf(N);
        int count =0;
        for(int i=0;i<n.length();i++ ){
            if(n.charAt(i) == '0'){
                continue;
            }
            else if(N % (n.charAt(i) -'0') == 0){
                count +=1;
            }
        }
        return count;
    }
}