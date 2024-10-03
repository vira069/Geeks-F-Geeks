//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String s = sc.nextLine();
            String[] parts = s.split(" ");
            List<Integer> nums = new ArrayList<>();
            for (String part : parts) {
                nums.add(Integer.parseInt(part));
            }
            Solution ob = new Solution();
            List<Integer> ans = ob.findMajority(nums);
            for (int num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
// } Driver Code Ends


class Solution {
    // Function to find the majority elements in the array
 public List<Integer> findMajority(List<Integer> nums) {
    int one_third = nums.size() / 3;
    List<Integer> result = new ArrayList<>();
    HashMap<Integer, Integer> frequencyMap = new HashMap<>();

    // Count the frequency of each number
    for (int num : nums) {
        frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
    }

    // Add numbers that appear more than one third of the time
    for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
        if (entry.getValue() > one_third) {
            result.add(entry.getKey());
        }
    }

    // If no majority element found, add -1
    if (result.isEmpty()) {
        result.add(-1);
    }

    return result;
}

}
