    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     
     start birthdayCakeCandles()
     init variable for length
     FOR  (i < len) convert to array  end FOR
     IF  ( a > b) increment COUNT  end IF
     
    */
       public static int birthdayCakeCandles(List<Integer> candles) 
    {
        int len = candles.size();
        int candleCounter = 0 ;
        int maxCandleHeight = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < len ; i++)
            {
        
                int[] intArray = candles.stream().mapToInt(Integer:: intValue).toArray();
                
                    if( intArray[i] == maxCandleHeight )
                    // if # is equal to max candle height increment count
                    {
                        candleCounter++; 
                    }
                    if( intArray[i] > maxCandleHeight){
                    maxCandleHeight = intArray[i];
                    candleCounter = 1;
                    }
            }
    return candleCounter;
    }
}
