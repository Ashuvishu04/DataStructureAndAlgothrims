package InterviewQuestions;

import java.util.HashMap;

public class LongestSubstringWithKTimes {

  public static void main(String[] args) {
    LongestSubstringWithKTimes l = new LongestSubstringWithKTimes();
    l.longestSubstring("ababacb",3);
  }

  public int longestSubstring(String s, int k) {

    if(s.length()==0 || s.length()<k){
      return 0;
    }
    if(k<=1){
      return s.length();
    }
    HashMap<Character,Integer> map = new HashMap<>();

    for(char ch : s.toCharArray()){
      map.put(ch,map.getOrDefault(ch,0)+1);
    }

    int l =0;
    while (l<s.length() && map.get(s.charAt(l))>=k){
      l++;
    }

    if(l>=s.length()-1){
      return l;
    }

    int ls1 = longestSubstring(s.substring(0,l),k);
    while (l<s.length() && map.get(s.charAt(l))<k){
      l++;
    }
    int ls2 = (l<s.length()) ? longestSubstring(s.substring(l),k) : 0;
    return Math.max(ls1,ls2);
  }

}
