class Solution {
    public int thirdMax(int[] nums) {
        Integer f = null;
        Integer s = null;
        Integer t = null;
        for (Integer n : nums) {
            if (n.equals(f) || n.equals(s) || n.equals(t)) continue;

            if (f == null||n > f) {
                t = s;
                s = f;
                f = n;
            } 
            else if (s == null|| n > s) {
                t = s;
                s = n;
            } else if (t == null || n > t) {
                t = n;
            }
        }
        return (t != null) ? t : f;
    }
}