//Longest_palindrome_substring
class Solution {
    public String longestPalindrome(String s) {
        String result = "";
        for(int i =0;i<s.length();i++){
            for(int j =i+1;j<=s.length();j++){
                String sub = s.substring(i,j);
                String found = palindrome(sub);
                if(found.length()>result.length()){
                    result = found;
                }
            }
        }
        return result;

    }
    public String palindrome(String str){
        int left =0,right=str.length()-1;
        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                return " ";
            }
            left++;
            right--;
        }
        return str;
    }
}
