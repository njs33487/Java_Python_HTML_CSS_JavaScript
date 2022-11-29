```java
    public static void main(String[] args) throws InterruptedException {
        Boolean running = true;
        Scanner scanner = new Scanner(System.in);
        //Get input from user for how long the timer should last
        System.out.print("Set Timer For How Long (seconds): ");
        Integer seconds = scanner.nextInt();
        while(running){

            if(seconds == 0){
                System.out.println("Times Up!");
                running = false;
            }
            else{
                System.out.println(seconds--);
            }
                
            //1 second delay
            Thread.sleep(1000);
        }
        scanner.close();
    }
```
