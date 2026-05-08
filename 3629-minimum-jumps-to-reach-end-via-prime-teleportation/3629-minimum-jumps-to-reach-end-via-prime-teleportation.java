class Solution {
    public int minJumps(int[] nums) {
         int n = nums.length;

        if (n == 1) return 0;

        int max = 0;

        for (int x : nums) {
            max = Math.max(max, x);
        }

        int[] spf = buildSPF(max);

        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            int val = nums[i];

            Set<Integer> factors = new HashSet<>();

            while (val > 1) {

                int p = spf[val];

                factors.add(p);

                while (val % p == 0) {
                    val /= p;
                }
            }

            for (int p : factors) {
                map.computeIfAbsent(p, k -> new ArrayList<>()).add(i);
            }
        }

        Queue<Integer> q = new LinkedList<>();

        boolean[] visited = new boolean[n];

        q.offer(0);

        visited[0] = true;

        int jumps = 0;

        while (!q.isEmpty()) {

            int size = q.size();

            while (size-- > 0) {

                int idx = q.poll();

                if (idx == n - 1) {
                    return jumps;
                }

                if (idx - 1 >= 0 && !visited[idx - 1]) {

                    visited[idx - 1] = true;

                    q.offer(idx - 1);
                }

                if (idx + 1 < n && !visited[idx + 1]) {

                    visited[idx + 1] = true;

                    q.offer(idx + 1);
                }

                int value = nums[idx];

                if (isPrime(value, spf) && map.containsKey(value)) {

                    for (int next : map.get(value)) {

                        if (!visited[next]) {

                            visited[next] = true;

                            q.offer(next);
                        }
                    }

                    map.remove(value);
                }
            }

            jumps++;
        }

        return -1;
    }

    private int[] buildSPF(int n) {

        int[] spf = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            spf[i] = i;
        }

        for (int i = 2; i * i <= n; i++) {

            if (spf[i] == i) {

                for (int j = i * i; j <= n; j += i) {

                    if (spf[j] == j) {
                        spf[j] = i;
                    }
                }
            }
        }

        return spf;
    }

    private boolean isPrime(int x, int[] spf) {

        return x > 1 && spf[x] == x;
    }
}