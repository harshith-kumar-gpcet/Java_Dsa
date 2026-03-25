// forgeeksskeegfor =>> forgeeksskeegfor

public class Main
{
	public static void main(String[] args) {
		//longest palindrome
		String s="forgeeksskeegfor";
		int p1,p2,p3,p4,len=1,st=0;
		for(int i=0;i<s.length();i++){
		    p1=i-1;p2=i+1;p3=i;p4=i+1;
		    while( (p1 >=0 && p2 < s.length()) && (s.charAt(p1)== s.charAt(p2) ) ){
		        if(len < (p2-p1+1)){
		            len=p2-p1+1;
		            st=p1;
		        }
		        p1--;
		        p2++;
		    }
		    while( (p3 >=0 && p4 < s.length()) && (s.charAt(p3)== s.charAt(p4) ) ){
		        if(len < (p4-p3+1)){
		            len=p4-p3+1;
		            st=p3;
		        }
		        p3--;
		        p4++;
		    } 
		}
		System.out.print(s.substring(st,st+len));
	}
}
