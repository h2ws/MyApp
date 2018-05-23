
public class Hello {
	public static void main(String[] args) {
		System.out.println("Hello git, this is my javapoject");
		
		sayHello("Bob");
		sayHello("Jack");
	}
	
	static void sayHello(Object object) {
		System.out.println("Hello my name is "+object.toString());
	}
	
	static void sayHello() {
		System.out.println("Hello");
	}
}
