class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if(p.length()>s.length()){
            return res;
        }
        int[] pc = new int[26];
        int[] sc = new int[26];

        for(char c : p.toCharArray()){
            pc[c - 'a']++;
        }

        for(int i = 0; i<s.length();i++){
            sc[s.charAt(i) - 'a']++;
            if(i >= p.length()){
                sc[s.charAt(i - p.length()) - 'a']--;
            }
            if(Arrays.equals(pc,sc)){
                res.add(i-p.length()+1);
            }
        }
        return res;
    }
}