import java.util.*;

class Solution {

    // Function to check prime
    private boolean isPrime(int x) {
        if (x < 2) return false;

        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0)
                return false;
        }

        return true;
    }

    public int minJumps(int[] nums) {

        int n = nums.length;

        // Map: prime factor -> indices divisible by it
        Map<Integer, List<Integer>> map = new HashMap<>();

        // Build map
        for (int i = 0; i < n; i++) {

            int val = nums[i];

            // Find all factors of nums[i]
            for (int p = 2; p * p <= val; p++) {

                if (val % p == 0) {

                    map.putIfAbsent(p, new ArrayList<>());
                    map.get(p).add(i);

                    while (val % p == 0)
                        val /= p;
                }
            }

            // Remaining prime factor
            if (val > 1) {
                map.putIfAbsent(val, new ArrayList<>());
                map.get(val).add(i);
            }
        }

        // BFS
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];

        q.offer(0);
        visited[0] = true;

        int jumps = 0;

        // To avoid using same teleport many times
        Set<Integer> usedPrime = new HashSet<>();

        while (!q.isEmpty()) {

            int size = q.size();

            for (int s = 0; s < size; s++) {

                int i = q.poll();

                // Reached end
                if (i == n - 1)
                    return jumps;

                // Move left
                if (i - 1 >= 0 && !visited[i - 1]) {
                    visited[i - 1] = true;
                    q.offer(i - 1);
                }

                // Move right
                if (i + 1 < n && !visited[i + 1]) {
                    visited[i + 1] = true;
                    q.offer(i + 1);
                }

                // Teleport
                int val = nums[i];

                if (isPrime(val) && !usedPrime.contains(val)) {

                    usedPrime.add(val);

                    if (map.containsKey(val)) {

                        for (int next : map.get(val)) {

                            if (!visited[next]) {
                                visited[next] = true;
                                q.offer(next);
                            }
                        }
                    }
                }
            }

            jumps++;
        }

        return -1;
    }
}