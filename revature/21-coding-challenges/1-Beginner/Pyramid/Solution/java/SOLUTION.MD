```java
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Star Pyramid!");
        System.out.print("Provide Whole Number: ");

        //this will break if you provide anything but a whole number
        Integer num = scanner.nextInt();

        for(int i = 1; i <= num; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
```