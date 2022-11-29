public static long aVeryBigSum(List<Long> ar) 
    {
    /*
    init sum <long>
    FOR i to size of array
    add to sum END for
    return sum
    use stream() method to convert a list into an array  
         String[] namesArray = names.stream().toArray(String[] ::new);  
         // print all the elements of the array  
         System.out.println("After converting List into an Array");  
         for (int j = 0; j < namesArray.length; j++) {  
             System.out.println((j+1)+" element of the array is "+namesArray[j]);  
             
    */
        int len = ar.size();
        long sum = 0l;  
        for (int i = 0 ; i < len ; i++)
        {
            
            Long[] longArray = ar.stream().toArray(Long[] :: new);
        
            sum = sum + longArray[i];
            
        }   
        return sum;
    }