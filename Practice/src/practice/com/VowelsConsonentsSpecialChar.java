package practice.com;

public class VowelsConsonentsSpecialChar {

	public static void main(String[] args) {
		int vowels = 0, consonents = 0, special = 0;
		String s1= "P@radise";
		for (int i =0; i <= s1.length()-1; i++) {
			char ch = s1.charAt(i);
			if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowels++;
				}
				else {
					consonents++;
				}
			}else {
				special++;
			}
		}
		System.out.println("no of vowels: "+vowels);
		System.out.println("no of consonents: "+consonents);
		System.out.println("no of special characters: "+special);
	}

}
