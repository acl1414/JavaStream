package com.acl1414.test.stream;

public class Employee implements Comparable{

    private String name;
    private float salary;
    private String gender; // "M", "F"

    public Employee(String name, float salary, String gender) {
        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public String getGender() {
        return gender;
    }

    public boolean isFemale() {
        return "F".equals(this.getGender());
    }

	
	public int compareTo(Object o) {
		
		Employee emp = (Employee) o;
		
		if (this.name.compareTo(emp.getName() ) == 0)
		{
			if (this.salary > emp.getSalary()) {
				return 1;
			}
			else {
				return -1;
			}
			
		}
		else {
			return this.name.compareTo(emp.getName() );
		}
		
		
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", gender=" + gender + "]";
	}
}