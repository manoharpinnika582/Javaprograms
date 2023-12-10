
public class SubString {
	//logic 1 with using in built method
void findSubString(String s) {
//	for(int i=0;i<s.length();i++) {
//		for(int j=i;j<s.length();j++) {
//			String temp=s.substring(i,j+1);
//			System.out.println(temp);
//		}
//	}
	//logic 2 without using inbuilt method
	
	for(int i=0;i<s.length();i++) {
		String temp="";
		for(int j=i;j<s.length();j++) {
			temp=temp+s.charAt(j);
			System.out.println(temp);
		}
		}
	}
	
}

