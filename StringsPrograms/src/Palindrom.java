
public class Palindrom {
	boolean isPalindrome(String s1) {
		char arr1[]=s1.toCharArray();
		char arr2[]=new char[arr1.length];
		int j=arr2.length-1;
		for(int i=0;i<=arr1.length-1;i++) {
			arr2[j]=arr1[i];
			j--;
		}
		String s2=new String(arr2);
		
		System.out.println("String Before Reverse=====> "+s2);
//		using equals method
//		if(s1.equals(s2))
//			return true;
//		else
//			return false;
		if(s1.equalsIgnoreCase(s2))
			return true;
		else
			return false;

	}
}
