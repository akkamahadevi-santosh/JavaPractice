
public class SingletonDemo {
	
	 private static SingletonDemo obj=null;
	private SingletonDemo() {
	
	}
	
	 public static SingletonDemo objectCreationMethod(){
			/*This logic will ensure that no more than
			 * one object can be created at a time */
			if(obj==null){
			    obj= new SingletonDemo();
			}
		        return obj;
		   }
	 public void display(){
			System.out.println("Singleton class Example");
		   }
	public static void main(String[] args) {
		SingletonDemo obj = new SingletonDemo();
		obj.display();
	}

}
