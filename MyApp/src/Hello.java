
public class Hello {
	public static void main(String[] args) {
		System.out.println("Hello git, this is my javapoject");
		
		sayHello("Bob");
		sayHello("Jack");
	}
	
	static void sayHello(String name) {
		System.out.println("Hello my name is "+name);
	}
	
	static void sayHello() {
		System.out.println("Hello");
	}
}
