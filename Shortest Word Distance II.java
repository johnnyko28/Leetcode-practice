class WordDistance {
    private HashMap<String, List<Integer>> map;
    
    public WordDistance(String[] words) {
        map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if(map.containsKey(words[i])) {
                map.get(words[i]).add(i);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(words[i], list);
            }
        }
    }
    
    public int shortest(String word1, String word2) {
        List<Integer> l1 = map.get(word1);
        List<Integer> l2 = map.get(word2);
        int res = Integer.MAX_VALUE;
        for(Integer num1 : l1) {
            for (Integer num2 : l2) {
                res = Math.min(res, Math.abs(num1 - num2));
            }
        }
        return res;
    }
}

/**
 * Your WordDistance object will be instantiated and called as such:
 * WordDistance obj = new WordDistance(words);
 * int param_1 = obj.shortest(word1,word2);
 */
