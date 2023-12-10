import java.util.Scanner;

public class SortingAndSearchingApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Array Length");
		int arr[]=new int[scanner.nextInt()];
		System.out.println("Enter "+arr.length+" Elements Stored into an Array");
		for(int i=0;i<=arr.length-1;i++) 
		{
			arr[i]=scanner.nextInt();
		}
		//printing the values
		System.out.println("Your Are Elements Are....");
		for (int x : arr) 
		{
			System.out.print(x+" ");
		}
		System.out.println();
		SortingAndSearching sortSearch=new SortingAndSearching();
		while(true) {
			System.out.println("==================================");
			System.out.println("Welcome to Manohar sorting And Searching Applicatin");
			System.out.println("Enter your Choices=====>");
			System.out.println("Choice 1 ====> Selection Sorting");
			System.out.println("Choice 2 ====> Linear Search");
			System.out.println("Choice 3 ====> Binary Search");
			System.out.println("Choice 4 ====> Bobble Sorting");
			System.out.println("Choice 5 ====> Insertion Sorting");
			System.out.println("Choice 6 ====> To Exit");
			System.out.println("Enter a Key To Search");
			int key=scanner.nextInt();
			System.out.println("Enter Your Choice Here");
			int num=scanner.nextInt();
			switch(num) 
			{
			case 1:
				sortSearch.selectionSorting(arr);
				break;
			case 2:	
				sortSearch.linearSearch(arr, key);
				break;
			case 3:
				sortSearch.selectionSorting(arr);
			    sortSearch.binarySeach(arr, key);
			    break;
			case 4:
				sortSearch.bobbleSort(arr);
			    break;
			case 5:
				sortSearch.insertionSort(arr);
				break;
			case 6:
				return;
			default :
				System.out.println("Hey Man.....Read The Message Properly");
				break;
			}
		}
	}

}


