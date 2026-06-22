class B {
    public int minLights(int[] lights) {
        int n = lights.length;
        int[] diff = new int[n + 1];
        for (int i = 0; i < n; i++) {
            int v = lights[i];
            if (v > 0) {
                int l = Math.max(0, i - v);
                int r = Math.min(n - 1, i + v);
                diff[l]++;
                diff[r + 1]--;
            }
        }
        boolean[] visible = new boolean[n];
        int cur = 0;
        for (int i = 0; i < n; i++) {
            cur += diff[i];
            visible[i] = cur > 0;
        }
        int count = 0;
        int reach = -1; 
        for (int i = 0; i < n; i++) {
            if (!visible[i] && i > reach) {
                int center = Math.min(i + 1, n - 1);
                count++;
                reach = center + 1;
            }
        }
        return count;
    }
}