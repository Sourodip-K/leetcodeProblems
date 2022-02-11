class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        if (m > n) {
            return false;
        }
        int[] s1Freq = new int[26], currentWindowFreq = new int[26];
        for (char c: s1.toCharArray()) {
            s1Freq[c - 'a']++;
        }
        for (int i = 0; i < n; i++) {
           
            if (i >= m) {
                if (Arrays.equals(s1Freq, currentWindowFreq)) {
                    return true;
                }
                currentWindowFreq[s2.charAt(i - m) - 'a']--;
            }
             currentWindowFreq[s2.charAt(i) - 'a']++;
        }
        if (Arrays.equals(s1Freq, currentWindowFreq)) {
            return true;
         }
        return false;
}
}