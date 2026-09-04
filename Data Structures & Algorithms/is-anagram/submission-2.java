class Solution {
    public boolean isAnagram(String s, String t) {
        int lenS = s.length(); //O(n)
        int lenT = t.length(); //O(m)
        if(lenS != lenT)
            return false;
        HashMap<Character, Integer> sMap = new HashMap<>(); 
        HashMap<Character, Integer> tMap = new HashMap<>();

        for(int i=0; i < lenS; i++) { //O(n)
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0)+1);
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0)+1);
        }
        if(sMap.equals(tMap)) //O(n)
            return true;
        else return false;
    }
}
