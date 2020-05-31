class Solution {
    public boolean isAnagram(String s, String t) {
        // // 字母异位词：字母相同但位置不同
        // if(s.equals(t)){
        //     return true;
        // }
        // if(s.length() != t.length()){
        //     return false;
        // }
        // char[] cS = s.toCharArray();
        // char[] tS = t.toCharArray();

        // Arrays.sort(cS);
        // Arrays.sort(tS);

        // for(int i = 0,len = cS.length; i < len; i++){
        //     if(cS[i] != tS[i]){
        //         return false;
        //     }
        // }
        // return true;

        if(s.equals(t)){
            return true;
        }
        if(s.length() != t.length()){
            return false;
        }

        // 26个字母，ASCII 字母 - ‘a’ 即下标
        int[] count = new int[26];
        for(int i = 0,len = s.length(); i < len; i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for(int i = 0; i < 26; i++){
            if(count[i] != 0){
                return false;
            }
        }
        return true;
    }
}