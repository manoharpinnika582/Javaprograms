
public class RemoveDuplicate {
void removeRepeated(String s) {
	char arr[]=s.toCharArray();
	for(int i=0;i<=arr.length-1;i++) {
		for(int j=i+1;j<=arr.length-1;j++) {
			if(arr[i]==arr[j]) {
				arr[i]=' ';
				break;
			}
		}
		if(arr[i]!=' ') {
			System.out.print(arr[i]);
		}
	}
	

			
	
}
}
