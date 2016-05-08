

public class StatickBlock  {

	int i = A.st();
	Integer ii;
	String s;
	char c;
	boolean b;
	Boolean bb;

	{
		System.out.println("block init");
	}
	
	static private A a = new A();

	public StatickBlock(int a) {
		System.out.println(i);
		i = a;
		System.out.println(i);
	}

	public StatickBlock() {
		super();
	}

	public StatickBlock(int i, Integer ii, String s) {
		this(i, ii, s, 'a', false, null);
	}

	public StatickBlock(int i, Integer ii, String s, char c, boolean b, Boolean bb) {
		super();
		this.i = i;
		this.ii = ii;
		this.s = s;
		this.c = c;
		this.b = b;
		this.bb = bb;
	}

	public static void main(String[] args) {
		A a = new A();
		a.f(5);
	}

}

class A {
	public void f(int i) {
		System.out.println("i");
	}
	
	public void f(Integer i) {
		System.out.println("I");
	}
	
	static {
		System.out.println("A");

	}
static int st(){
	return 100;
}
	void f() {
		StatickBlock st = new StatickBlock();
		st.i = 55;
	}
}