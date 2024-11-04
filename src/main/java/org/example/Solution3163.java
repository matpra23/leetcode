package org.example;

class Solution3163 {
    public String compressedString(String word) {
        StringBuilder comp = new StringBuilder();
        int count = 0, n = word.length();
        char c = word.charAt(0);
        for (int i = 0; i < n; i++) {
            if(word.charAt(i) == c && count < 9){
                count++;
            }else{
                comp.append(count).append(c);
                c = word.charAt(i);
                count = 1;
            }
        }
        comp.append(count).append(c);
        return comp.toString();
    }
}
