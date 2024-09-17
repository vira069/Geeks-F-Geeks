//{ Driver Code Starts
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class LinkedList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Ignore the newline character after t

        for (int testCase = 0; testCase < t; testCase++) {
            int k = scanner.nextInt();
            scanner.nextLine(); // Ignore the newline character after k

            String inputLine = scanner.nextLine().trim();
            String[] inputArray = inputLine.split(" ");

            Node head = null, tail = null;
            if (inputArray.length > 0 && !inputArray[0].isEmpty()) {
                head = new Node(Integer.parseInt(inputArray[0]));
                tail = head;

                for (int i = 1; i < inputArray.length; i++) {
                    if (!inputArray[i].isEmpty()) {
                        tail.next = new Node(Integer.parseInt(inputArray[i]));
                        tail = tail.next;
                    }
                }

                if (k == 1 && head != null) {
                    tail.next = head;
                }
            }

            Solution solution = new Solution();
            boolean isCircular = solution.isCircular(head);
            System.out.println(isCircular ? "true" : "false");
        }
        scanner.close();
    }
}

// } Driver Code Ends


/* Structure of LinkedList
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/
class Solution {
    boolean isCircular(Node head) {
        // Handle the edge case: an empty list is circular by definition.
        if (head == null) return true;

        // Initialize two pointers, slow and fast.
        Node slow = head;
        Node fast = head;

        // Traverse the list with two pointers.
        while (fast != null && fast.next != null) {
            // Move the slow pointer by one step.
            slow = slow.next;
            // Move the fast pointer by two steps.
            fast = fast.next.next;

            // If the slow pointer meets the fast pointer, it means there is a cycle.
            if (slow == fast) {
                return true;
            }
        }

        // If the fast pointer reaches the end of the list (null), it means there is no cycle.
        return false;
    }
}
