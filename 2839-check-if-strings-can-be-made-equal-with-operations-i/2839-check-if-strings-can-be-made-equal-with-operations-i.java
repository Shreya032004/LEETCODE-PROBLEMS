class Solution {
    public boolean canBeEqual(String s1, String s2) {
        
        if (s1.equals(s2)) return true;
        
        char[] arr = s1.toCharArray();
        
        // swap (0,2)
        swap(arr, 0, 2);
        if (new String(arr).equals(s2)) return true;
        
        // revert
        swap(arr, 0, 2);
        
        // swap (1,3)
        swap(arr, 1, 3);
        if (new String(arr).equals(s2)) return true;
        
        // both swaps
        swap(arr, 0, 2);
        if (new String(arr).equals(s2)) return true;
        
        return false;
    }
    
    void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}