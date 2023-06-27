import java.util.*;

class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums1.length == 0 || nums2.length == 0 || k == 0) {
            return ans; // Return an empty list if any of the arrays is empty or k is zero
        }
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0] + a[1], b[0] + b[1]));
        
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        // Initialize the index array
        int[] index = new int[n1];
        
        // Add pairs with the smallest elements from both arrays
        for (int i = 0; i < n1; i++) {
            pq.offer(new int[]{nums1[i], nums2[0], i});
        }
        
        while (k > 0 && !pq.isEmpty()) {
            int[] pair = pq.poll();
            int num1 = pair[0];
            int num2 = pair[1];
            int i = pair[2];
            
            ans.add(Arrays.asList(num1, num2));
            
            // If the index of nums2 for the popped pair is less than nums2.length - 1,
            // increment the index and add the next pair with the same element from nums1
            // and the next element from nums2 to the priority queue.
            if (index[i] < n2 - 1) {
                index[i]++;
                pq.offer(new int[]{nums1[i], nums2[index[i]], i});
            }
            
            k--;
        }
        
        return ans;
    }
}
