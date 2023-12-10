
public class Student {
	int id;
	String name;
	int marks;
	public Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	//Linear Search
	public static void linearSearch(Student arr[],String name) {
		boolean found=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].name.equals(name)) 
			{
				System.out.println("Name is Found in Student Object..."+i);
				found=true;
				break;
			}	
		}
		if(!found)
			System.out.println("Name is not Found.");
				
	}
	
	//Sorting id's
		static void sorting(Student arr[],boolean sort) {
			if(sort==true) 
			{
				for(int i=0;i<arr.length;i++) 
				{
					for(int j=i;j<arr.length;j++) 
					{
						if(arr[i].id>arr[j].id) 
						{
							Student help=arr[i];
							arr[i]=arr[j];
							arr[j]=help;
						}
					}
				}
				System.out.println("Your Sorting id's Are:-");
				for (Student s : arr) 
				{
					System.out.print(s.id+" "+s.name+" "+s.marks);
				}
			}
			if(!sort)
				System.out.println("You are Choosed Not Sorting.");
			
		}
	
	//Binary Search
	static void binarySearch(Student arr[],int key) {
		boolean found=false;
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid].id==key) 
			{
				System.out.println("ID is Present At index:"+arr[mid].name);
				found=true;
				break;
			}
			else if(arr[mid].id<=key) 
			{
				low=mid+1;
			}
			
			else {
				high=mid=1;
			}
		}
		if(!found)
			System.out.println("ID is not present in Student Object.");
	}
	
	static void studentArrayContent(Student arr[]){
		for (int i=0;i<arr.length;i++) {
			System.out.println("Student Details of : "+(i+1));
			System.out.println(arr[i].id+" "+arr[i].name+" "+arr[i].marks);
			System.out.println();
		}
	}
		static void studentAppRating(int nor) {
			for(int i=0;i<=nor;i++) {
				System.out.print("* ");
			}
		
	}
}
