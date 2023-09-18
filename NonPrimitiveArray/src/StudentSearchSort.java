
public class StudentSearchSort {
	static boolean studentLinearSearch(Student arr[],String nameKey) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i].name.equals(nameKey)) {
				System.out.println("Student Name is Found at id is:"+arr[i].id);
				return true;
			}
		}
		return false;
	}
	
	static void studentBobbleSorting(Student arr[]) 
	{
		for(int i=0;i<=arr.length-2;i++) 
		{
			for(int j=0;j<=arr.length-2-i;j++) 
			{
				if(arr[j].id>arr[j+1].id) 
				{
					Student help;
					 help=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=help;
				}
			}
		}
	}
	
	static void studentInsertionSorting(Student arr[])
	{
		for(int i=0;i<arr.length;i++) {
			Student item=arr[i];
			int j=i-1;
			while(j>=0 && arr[j].id>item.id)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=item;	
		}
	}
	
	static void studentSelectionSorting(Student arr[])
	{
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i].id>arr[j].id) {
					Student help=arr[i];
					arr[i]=arr[j];
					arr[j]=help;
				}
			}
		}
	}
	
	static boolean studentBinarySearch(Student arr[],int idKey)
	{
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid].id==idKey) 
			{
				System.out.println("Student Id Found and the name is "+arr[mid].name);
				return true;
			}
			else if(idKey>arr[mid].id)
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		return false;
	}
	
	static void studentPrintArray(Student arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i].id+" "+arr[i].name+" "+arr[i].marks+" | ");
		}
	}
	
	static void studentRatingApplication(int nor)
	{
		for(int i=1;i<=nor;i++) 
		{
			System.out.print("* ");
		}
	}
	
}
