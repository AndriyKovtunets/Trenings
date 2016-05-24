
public class Main2 {

	public static void main(String[] args) {
	String a = "Andriy";
	String b = "Andriy";
    String c = new String("Andriy");
    
//    System.out.println(a==c);
    
    Short s =1;
    Cat cat;
    Cat[] allCat = Cat.values();
    cat = Cat.valueOf("Puma");
    System.out.println(cat);
    
    for(Cat cat2: allCat){
    	System.out.println(cat2 + "" + cat2.ordinal());
    }
    
    
	}
	
	enum Cat {
	    Leopard, Puma, Lion, Tiger, Manul
	}

}
