package keerthi.com.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="department")
public class Department {
	@Column(name="id")
	@Id
	String id;
	@Column(name="name")
	String name;
	
	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
	List<Employee> emplist;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(String id, String name) {
		super();
		this.id = id;
		this.name = name;
		emplist= new ArrayList<Employee>();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addEmployee(Employee employee) {
		//assigning the present dept
		employee.setDepartment(this);
		//add the employee t list
		emplist.add(employee);
	}
	
	@Override
	public String toString() {
		return id+" "+name;
	}
}
