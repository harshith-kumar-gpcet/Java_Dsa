// For example: "listen" and "silent" are anagrams.
//To check if two strings are anagrams, you are essentially checking if they have the same characters with the same frequencies.

public class Main {
    public static void main(String[] args) {
        String s1 = "Listen", s2 = "Silent";
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if (s1.length() != s2.length()) {
            System.out.println("Not anagram");
            return;
        }
        int[] freq = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }
        boolean isAnagram = true;
        for (int count : freq) {
            if (count != 0) {
                isAnagram = false;
                break; 
            }
        }
        System.out.println(isAnagram ? "Anagram" : "Not anagram");
    }
}
