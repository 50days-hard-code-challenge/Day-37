class Solution {
    public int[] findArray(int[] pref) {
        int n = pref.length;
        // create an array of same size 
        int[] arr = new int[n];
         arr[0] = pref[0];
        for(int i = 1; i<n; i++){
            arr[i] = pref[i] ^ pref[i-1];
        }
        return arr;
    }
}
