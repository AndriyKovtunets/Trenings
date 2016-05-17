
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
		
		int[] mas = {1, 2, 3, 4, 5};
		int[] mas2 = {8, 9,8,8,8};
		
		System.arraycopy(mas, 3, mas, 0, 2);
		for(int i=0; i< mas.length; i++)System.out.println(mas[i]);
//		for(int i: mas3){System.out.println(mas3[i]);}
		
		
	}

}
