import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Product name: ");
		String product_name = input.next();
		System.out.print("Value entered: " + product_name);

		System.out.print("Quantity: ");
		int quantity = input.nextInt();
		System.out.print("Value entered: " + quantity);
	}
}