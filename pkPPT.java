/*
PROJECT TITLE:pkPPT
PURPOSE OF PROJECT: to utilize ppt and twin primes to find public key codes
AUTHORS: phenixwarez Nicholas Joseph Stanley 
DATE: v1.20220216 
VERSION: v2.20220504
USER INSTRUCTIONS:
NOTES:
DRY , dont , repeat , yourself
KISS , keep , it , short , simple
APIE , Abstract , Polymorphism , Inheritance , Polymorphism , Encapulation
CRUD , create , read , update , delete
COMB , class , obj , method , block

Primitive Pythagorean Triple 
A is odd; B is even; gcd(a,b,c) = 1;
Mersenne Fermat Euclid 
jp jones matiyaesvich poussin hadamard
------------------------------------------------------
C + B = S^2 , C - B = T^2 , S > T >= 1
A = S * T , B = ( S^2 - T^2) /2 , C = ( S^2 + T^2) /2
u = s+t /2 , v = s-t/2
(a , b , c ) (u^2 - v^2 , 2uv , u^2 + v^2)


(A,B,C)		-2	+2
(3,4,5) 	3 	7
(5,12,13)	11 	15
(15,8,17)	15 	19

------------------------------------------------------
there is infinitely many PPT;
there is infinitely many primes;
there is infinitely many 1 modulo 4 primes;
there is infinitely many 3 modulo 4 primes;
there is infinitely many twin primes!
--------------------------------------------------------
1 ( modulo 4 ) prime or 4n + 1;
3 ( modulo 4 ) prime or 4n + 3;
twin prime p + 30n;   
TRUE TWIN ( 1(mod4) U 3(mod4) , where n is equal );
1 ( modulo 4 );
1	5	9	13	17	21	25	29	33	37	41	45
3 ( modulo 4 );
3	7	11	15	19	23	27	31	35	39	43	47
TWIN PRIME
11	13 	-	41	43	-	71	73	-	101 103	-	131	137		
17	19	-	47	49	-	77	79	-	107	109	-	137	139	
29	31	-	59	61	-	89	91	-	119	121	-	149	151
--------------------------------------------------------
161	163	-	191	193	-	221	223	-	251	253	-	281	283
167	169	-	197	199	-	227	229	-	257	259	-	287	289
179	181	-	209	211	-	239	241	-	269	271	-	299	301
--------------------------------------------------------


*/
public static int gcdRecursive(int bigger, int smaller);
 
public class pkPPT()
{
	public static void main(String[] args)
	{
		int big = 2 ; int small = 1;
		int n = 1; int m = 0; 	//S > T >=	1
		int s = 2n + 1; int t = 2m + 1; // S AND T are indepandant variables to produce PPT
		ArrayList<Integer> opp = new ArrayList<Integer>(); //A = S * T
		ArrayList<Integer> adj = new ArrayList<Integer>();	//B = ( S^2 - T^2) /2
		ArrayList<Integer> hyp = new ArrayList<Integer>();	//C = ( S^2 + T^2) /2
		ArrayList<Integer> cMin = new ArrayList<Integer>(); // hyp - 2
		ArrayList<Integer> cPlus = new ArrayList<Integer>();// hyp + 2
	}
}
//  A = B * Q + R euclid! gcd  @ripped from online for concept 

	public static int gcdRecursive(int big, int small) 
	{
	 int remainder = big % small;
	 if (remainder == 0)
	 { return small;} 
	  else { return gcdRecursive(small, remainder);}
	}
	// @ripped from online for concept
	public static int isPrime(int num){
    boolean flag = false;
    for (int i = 2; i <= num / 2; i++){
      // condition for nonprime number
      if (num % i == 0) {
        flag = true;
        break;
      }
    }
    if (!flag) // prime
      System.out.println(num + " is a prime number.");
    else // composite
      System.out.println(num + " is not a prime number.");
	}
  }
}