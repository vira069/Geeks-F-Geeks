//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for Java
 
class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int count_0 = 0;
        int count_1 = 0;
        int count_2 = 0;
        for(int i=0;i<n;i++){
            if(a[i]==0) count_0++;
            else if(a[i]==1) count_1++;
            else count_2++;
        }
            int k=0;
            while(count_0>0){ 
                a[k++] = 0;
                count_0--;
                
            }
            while(count_1>0){ 
                a[k++] = 1;
                count_1--;
            }
            
            while(count_2>0){ 
                a[k++] = 2;
                count_2--;
            }    
        
    }
}

//{ Driver Code Starts.

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}


// } Driver Code Ends