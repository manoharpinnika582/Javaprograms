package keerthi.com.onetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Column(name="id")
	@Id
	String is;
	@Column(name="name")
	String name;
	
	@ManyToOne
	@JoinColumn(name="dept_id")
	Department department;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String is, String name) {
		super();
		this.is = is;
		this.name = name;
	}

	public String getIs() {
		return is;
	}

	public void setIs(String is) {
		this.is = is;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Department getDepartment() {
		return department;
	}
}
