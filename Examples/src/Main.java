
public class Main {

	public static void main(String[] args) {
	
		A b = new B();
		
		C c = new C();
		
		c.printNameClass();
		System.out.println(c instanceof A);
		((B)b).printNameClass();
		
		Object emp = new Employee("Bill", "Microsoft");
		 
		Person cl = new Client("Tom", "UnitBank", 200, 20);
		 
		//у класса Object нет метода displayInfo, поэтому приводим к классу Employee
		((Employee) emp).displayInfo();
		 
		// у класса Person есть метод displayInfo
		cl.displayInfo(); 
		 
		// у класса Person нет метода getBank(), поэтому приводим к классу Client
		String bank = ((Client)cl).getBank(); 
		
	}

}
