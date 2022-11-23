packages examples;

class Person{
	private String name;
	
	public String getName(){return name;}
	public void setName(String name){this.name = name;}
	/*
	public String toString(){
		return "Hi,I'm" + this.name;
	}
	*/
}
	public class ObjectTest{
		public static String print(Object o){
			return 0.toString();
		}
	public static void main(String[] args){
		Person someone = new Person();
		
		//someone.setName("Joe");
		
		System.out.println(print(someone));
		
	}
}