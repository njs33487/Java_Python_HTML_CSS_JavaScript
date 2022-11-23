```java
public int sum(int[] arr){
        int sum = 0;
        
        //go through each index and add value to the sum variable
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        return sum;
    }
```