package labbook_9_case_study;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {

	private static final List<Employee> employees;
	private static final List<Department> departments;

	static {
		departments = new ArrayList<Department>();
		
		
		departments.add(new Department(10, "HR", 100));
		departments.add(new Department(20, "Production", 201));
		departments.add(new Department(30, "Sales", 124));
		departments.add(new Department(40, "Finance", 205));
		
		
		employees = new ArrayList<Employee>();
		
		employees.add(new Employee(111, "Trenna", "Rajs", "TRAJS", "650.121.8009",
				LocalDate.of(1995, Month.OCTOBER, 17), "Clerk", 3500, 124, departments.get(2)));
		employees.add(new Employee(112, "Shelley", "Higgins", "SHIGGINS", "515.123.8080",
				LocalDate.of(2004, Month.JUNE, 07), "Manager", 12000, 101, departments.get(3)));
		employees.add(new Employee(113, "William", "Gietz", "WGIETZ", "515.123.8181",
				LocalDate.of(2004, Month.JUNE, 07), "Accountant", 8300, 205, departments.get(3)));
		employees.add(new Employee(114, "Douglas", "Grant", "DGRANT", "650.507.9844",
				LocalDate.of(2000, Month.JANUARY, 13), "Clerk", 2600, 205, departments.get(3)));
		employees.add(new Employee(115, "Jennifer", "Whalen", "JWHALEN", "515.123.4444",
				LocalDate.of(2007, Month.SEPTEMBER, 17), "Admin Assistant", 4400, 102, departments.get(3)));
		employees.add(new Employee(116, "Donald", "OConnell", "DOCONNEL", "650.507.9833",
				LocalDate.of(2009, Month.JUNE, 21), "Clerk", 2600, null, departments.get(0)));
	}

	public static List<Employee> getEmployees() {
		return employees;
	}

	public static List<Department> getDepartments() {
		return departments;
	}
}