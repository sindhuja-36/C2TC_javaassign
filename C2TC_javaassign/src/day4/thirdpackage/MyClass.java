package day4.thirdpackage;

public class MyClass {
	//Program to demonstrate singleton class

		private static MyClass obj=new MyClass();
		private int id;
		
		public int getId()
		{
			return id;
		}
		
		public void setId(int id)
		{
			this.id=id;
		}
		
		private MyClass() {
			System.out.println("MyClass object created");		
		}
		
		public static MyClass getObject() //factory method
		{
			return obj;
		}

		@Override
		public String toString() {
			return "MyClass [id=" + id + "]";
		}
		
	}

