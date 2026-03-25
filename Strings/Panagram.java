//A Pangram is a sentence or string that contains every letter of the alphabet at least once.

//The most famous example in English is:

//"The quick brown fox jumps over the lazy dog."
public class Main {
    public static void main(String[] args) {
        //Panaram
        String s="The quick brown fox jumps over the lazy dog.";
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) >= 'a'&& s.charAt(i) <='z'){
                freq[s.charAt(i)-'a']++;
            }
            else if(s.charAt(i) >= 'a'&& s.charAt(i) <='z'){
                freq[s.charAt(i)-'A']++;
            }
        }
        boolean pangram=true;
        for(int count:freq){
            if(count!=0){
                pangram=false;
                break;
            }
        }
        System.out.println(pangram? "Panagram":"Not Panagram");
    }
}
