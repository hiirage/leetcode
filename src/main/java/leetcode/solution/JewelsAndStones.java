package leetcode.solution;

import java.util.HashSet;

class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> jewelSet = new HashSet<>();
        for(char j : J.toCharArray()){
            jewelSet.add(j);
        }
        int n = 0;
        for(char s : S.toCharArray()){
            if(jewelSet.contains(s)){
                n++;
            }
        }
        return n;
    }
}
