//{ Driver Code Starts
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// } Driver Code Ends

class Solution {
    public List<Integer> rearrange(List<Integer> arr) {
        // Code here
          // Initialize a list with default value -1
        ArrayList<Integer> arrangedArr = new ArrayList<>(arr.size());
        for (int i = 0; i < arr.size(); i++) {
            arrangedArr.add(-1); // Fill arrangedArr with -1
        }
         // Place elements at their corresponding indeces
        for (int i = 0; i < arr.size(); i++) {
            int value = arr.get(i);
            // Only place the value if it is a valid index
            if (value >= 0 && value < arr.size()) {
                arrangedArr.set(value, value);
            }
        }

        return arrangedArr;
    }
}

//{ Driver Code Starts.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Solution solution = new Solution();

        while (t-- > 0) {
            String input = scanner.nextLine();
            String[] inputArr = input.split("\\s+");
            List<Integer> arr = new ArrayList<>();
            for (String s : inputArr) {
                arr.add(Integer.parseInt(s));
            }

            List<Integer> ans = solution.rearrange(arr);

            for (int num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
// } Driver Code Ends