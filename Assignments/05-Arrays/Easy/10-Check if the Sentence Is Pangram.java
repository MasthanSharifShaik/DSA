
/*
1832. Check if the Sentence Is Pangram
Problem URL:   https://leetcode.com/problems/check-if-the-sentence-is-pangram/
*/

class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] check = new boolean[26];
        int index;
        for(int i=0; i<sentence.length(); i++){
            if(sentence.charAt(i)>='A' && sentence.charAt(i)<='Z')
                index = sentence.charAt(i) - 'A';
            else if(sentence.charAt(i)>='a' && sentence.charAt(i)<='z')
                index = sentence.charAt(i) - 'a';
            else continue;
            check[index] = true;
        }
        
        for(int i=0; i<26; i++){
            if(!check[i]) return false;
        }
        
        return true;
    }
}