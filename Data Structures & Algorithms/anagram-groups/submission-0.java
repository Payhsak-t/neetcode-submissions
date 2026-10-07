class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        String temp = null;
        HashMap<String, List<String>> strMap = new HashMap<>();

        for(int i=0; i<n; i++) {
            temp = strs[i];
            String sorted = strs[i].chars().sorted().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());

            if(strMap.containsKey(sorted)){
                strMap.get(sorted).add(temp);
            } else {
                strMap.computeIfAbsent(sorted, key -> new ArrayList<>()).add(temp);
            }

        }

        return new ArrayList<>(strMap.values());
    }
}
