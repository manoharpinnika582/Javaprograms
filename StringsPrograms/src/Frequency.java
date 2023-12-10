
public class Frequency {
void findFrequency(String str) {
	int fr[]=new int[str.length()];
	char arr[]=str.toCharArray();
	for(int i=0;i<=arr.length-1;i++) {
		  fr[i]=1;
		 for(int j=i+1;j<=arr.length-1;j++) {
			 if(arr[i]==arr[j]) {
				 fr[i]++;
				 arr[j]=' ';
			 }
		 }
	} 
		for(int i=0;i<=fr.length-1;i++) { 
	if(arr[i]!=' ') {
		System.out.println(arr[i]+" | "+fr[i]);
	
	}
		}
	
}
}
