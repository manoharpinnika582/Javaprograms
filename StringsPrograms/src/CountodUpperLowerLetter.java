
public class CountodUpperLowerLetter {
	void countUpperLower(String str) {
		
		int lowerCount = 0;
		int upperCount=0;
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			if(Character.isLowerCase(ch)) 
			{
				lowerCount++; 
		}
			else {
				upperCount++;
			}
		}
		System.out.println("lower letters: "+lowerCount);
		System.out.println("UPPER LETTERS: "+upperCount);

	}
}
