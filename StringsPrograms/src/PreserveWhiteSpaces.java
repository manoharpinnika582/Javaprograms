
public class PreserveWhiteSpaces {
	void removerSpaces(String str) {
		char arr[]=str.toCharArray();
		char rev[]=new char[arr.length];
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==' ') {
				rev[i]=arr[i];
			}
		}
		int j=arr.length-1;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]!=' ') {
				if(rev[j]==' ') {
					j--;
				}
				rev[j]=arr[i];
				j--;
			}
		}
		String s1=new String(rev);
		System.out.println(s1);
		
	}
}
