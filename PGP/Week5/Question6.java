class Question6 {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();


        List<Integer> ans = new ArrayList<>();

        if (s.length() < p.length()) return ans;


        for (int i = 0; i < p.length(); i++) {
            char ch = p.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < p.length(); i++) {
            char ch = s.charAt(i);
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }

        if(map1.equals(map2)){
            ans.add(0);
        }

        int windowEnd = p.length();
        while(windowEnd < s.length()){
            char ch = s.charAt(windowEnd);
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
            ch = s.charAt(windowEnd-p.length());
            map2.put(ch, map2.getOrDefault(ch, 0) - 1);
            if (map2.get(ch) == 0) {
                map2.remove(ch);
            }

            if(map1.equals(map2)){
                ans.add(windowEnd-p.length()+1);
            }
            windowEnd++;
        }

        return ans;
        
    }
}