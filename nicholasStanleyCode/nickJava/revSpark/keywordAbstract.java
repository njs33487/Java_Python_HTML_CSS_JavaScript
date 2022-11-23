public abstract class Instrument
{
	private String brand;

	public String getBrand(){
		return brand;
	}
	public void setBrand(String){
		this.brand = brand;
	}
	public abstract void makeSound();

	public class Trumpet extends Instrument{
		@Override 
		public void makeSound(){
			System.out.println("Brumm Brumm");
		}
		public static void main(String args){
			Trumpet trumpet = new Trumpet();
			trumpet.makeSound();
		}
	}
}