import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeApp {
	public static void main(String[] args) {
		Employee e1=new Employee(103, "Manu", 56000);
		Employee e2=new Employee(101, "siri", 54000);
		Employee e3=new Employee(104, "keerthi",55000);
		Employee e4=new Employee(102, "nani", 53000);
		
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		
		System.out.println(al);
		System.out.println("===================================");
		System.out.println("Sorting based on id asc");
		Collections.sort(al,new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				if(o1.id>o2.id) {
					return 1;
				}
				else if(o1.id<o2.id) {
					return -1;
				}
				else {
				return 0;
				}
			}
		});
		System.out.println(al);
		System.out.println("===================================");
		System.out.println("Sorting based on Name asc");
		
		Collections.sort(al,new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.name.compareTo(o2.name);
			}
		});
		System.out.println(al);
		System.out.println("===================================");
		System.out.println("Sorting based on salary asc");
		Collections.sort(al,new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				if(o1.salary>o2.salary) {
					return 1;
				}
				else if(o1.salary<o2.salary) {
					return -1;
				}
				else {
				return 0;
				}
			}
		});
		System.out.println(al);
	}
}
