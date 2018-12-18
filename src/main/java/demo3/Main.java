package demo3;

/**
 * TODO
 *
 * @author: yuepan
 * @date: 2018/12/18
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("dvdf"));
        System.out.println(lengthOfLongestSubstring("ohvhjdml"));
    }
    public static int lengthOfLongestSubstring(String s) {
        String result="";
        int max=0;
        for(int i=0;i<s.length();i++){
           if(result.indexOf(s.charAt(i))>=0){
               if(result.length()>max){
                   max=result.length();
               }
               result=result.substring(result.indexOf(s.charAt(i))+1)+s.charAt(i);
           }
           else{
               result=result+s.charAt(i);
           }
        }
        return result.length()>max?result.length():max;
    }
}
