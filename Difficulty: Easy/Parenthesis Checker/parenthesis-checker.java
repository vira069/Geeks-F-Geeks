//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Reading total number of testcases
        int t= sc.nextInt();
        
        while(t-- >0)
        {
            //reading the string
            String st = sc.next();
            
            //calling ispar method of Paranthesis class 
            //and printing "balanced" if it returns true
            //else printing "not balanced"
            if(new Solution().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        
        }
    }
}
// } Driver Code Ends



class Solution {
    // Helper function to check if the pair of brackets match
    static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
    // Function to check if brackets are balanced or not.
    static boolean ispar(String x) {
        // Stack to store opening brackets
        Stack<Character> stack = new Stack<>();
        
        // Traverse through the string
        for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);
            
            // If the character is an opening bracket, push it to the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // If the character is a closing bracket
            else if (c == ')' || c == '}' || c == ']') {
                // Check if the stack is empty or top of the stack doesn't match the closing bracket
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
                    return false;
                }
            }
        }
        
        // If the stack is empty, then the brackets are balanced
        return stack.isEmpty();
    }
    
    
}