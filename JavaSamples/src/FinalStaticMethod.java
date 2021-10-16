package demo01;

//static method versus method overriding
class FinalStatic {
	final static int method1() {
		return 0;
	}
}

public class FinalStaticMethod extends FinalStatic {
	final static int method1 () { //compiler error here
		return 2;
	}
	
	public static void main(String[] args) {
		FinalStatic fs = new FinalStaticMethod();
		/*	FinalStaticMethod.java:10: error: method1() in FinalStaticMethod cannot override
 			method1() in FinalStatic
        	final static int method1 () {
            	             ^
  			overridden method is static,final
			1 error
			error: compilation failed
		*/
		System.out.println(fs.method1());
	}
}