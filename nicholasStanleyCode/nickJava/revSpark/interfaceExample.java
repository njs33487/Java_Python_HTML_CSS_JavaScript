package interfaces;

public class InterfacesExample{
	public static void main(String[] args){
		
		Domesticated domesticatedThing = new Dog();
	}
}
interface Domesticated{
public void doWork();
}
class Animal{
public void eat(){System.out.println("I eat food");}
}
class Wolf extends Animal{
public void eat(){System.out.println("I eat fresh meat"};}
}
class Dog extends Animal implements Domesticated{
	public void eat(){
		System.out.println("i eat kibble");
	}
	public void doWork() {
		Sytem.out.println("i perform a trick");
	}
}