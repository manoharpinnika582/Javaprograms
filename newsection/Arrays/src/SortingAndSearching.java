
public class SortingAndSearching {
	void selectionSorting(int arr[])
	{
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]>arr[j]) {
					int help=arr[i];
					arr[i]=arr[j];
					arr[j]=help;
				}
			}
		}
		System.out.println("After Sorted Array Using Selection Sorting....");
		for (int x : arr) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
	//linear Search......
	void linearSearch(int arr[],int key)
	{
		System.out.println("Using Linear Search.....");
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==key)
			{
				System.out.println("Key is Fount at : "+i);
				return;
				
			}
		}
		System.out.println("Key is Not Found");
	}

	void binarySeach(int arr[],int key) 
	{
		System.out.println("Using Binary Search...");
		int low=0;
		int high=arr.length-1;
		while(low<=high) 
		{
			int mid=(low+high)/2;
			if(key==arr[mid])
			{
				System.out.println("Key is Found At : "+mid);
				return;
			}
			else if(key>arr[mid])
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		System.out.println("Key is not found");
	}
	void bobbleSort(int arr[])
	{
		for(int i=0;i<=arr.length-2;i++) {
			for(int j=0;j<=arr.length-2-i;j++) {
				if(arr[j]>arr[j+1]) {
					int help=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=help;
				}
			}
		}
		System.out.println("After Sorted Array Using Bobble Sorting....");
		for (int x : arr) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
	void insertionSort(int arr[])
	{
		for(int i=1;i<=arr.length-1;i++) 
		{
			int item=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>item)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=item;
		}
		System.out.println("After Sorted Array Using Insertion Sorting....");
		for (int x : arr) 
		{
			System.out.print(x+" ");
		}
		System.out.println();
	}
	}
	


