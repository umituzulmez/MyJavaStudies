package day_38_inheritance_part2;

public class Company {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		FullTimeEmployee ft = new FullTimeEmployee();
		Contractor ct = new Contractor();
		
		emp.calculatePay(40, 40);
		ft.calculatePay(20, 20);
		ct.calculatePay(10, 10);

	}

}
