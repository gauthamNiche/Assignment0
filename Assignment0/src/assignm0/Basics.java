package assignm0;

import java.util.Arrays;
import java.lang.Math;
import java.util.ArrayList;
import java.util.HashMap;

public class Basics {

	// Read System.out.println()
	public void printHelloWorld() {
		System.out.println("Hello World");
		
	}

	public int getSum(int first, int second) {
		return first+second;
		
	}

	// Read if-else construct
	public int getLargerNumber(int first, int second) {
		if(first>second) {
			return first;
		}
		else {
			return second;
		}
		
	}

	// Read nested if-else construct
	public int largestNumber(int first, int second, int third) {
		if(first>second) {
			if(first>third) {
				return first;
			}
			else {
				return third;
			}
		}
		else {
			if(second>third) {
				return second;
			}
			else {
				return third;
			}
		}
		
	}

	// Go through arrays in java and simple for loop and enhanced for loop
	public void printArray(int array[]) {
		for(int i=0; i<array.length;i++) {
			System.out.print(array[i] );
		}
	}

	public int getSumOfArrayElements(int array[], int n) {
		int sum = 0;
		for(int i = 0 ; i<n;i++) {
			sum+= array[i];
		}
		return sum;
		
	}

	public boolean isPrime(int number) {
		if(number<2) {
			return false;
		}
		for(int i=2;i<= number/2;i++) {
			if (number%i==0) {
				return false;
			}
		}
		return true;
		
		
	}

	// Say, first = 5 and second = 10, this function should print "5 6 7 8 9 10"
	public int[] getArrayOfRangeOfNumbers(int first, int second) {
		int difference = second-first;
		int[] array = new int[difference+1];
		int j=0;
		for(int i=first; i<=second;i++) {
			array[j]=i;
			j++;
		}
		return array;
		
		
		
	}

	public int getFactorial(int n) {
		int fact=1;
		while(n>=1) {
			fact*=n;
			n--;
			
		}
		return fact;

		
	}

	public int getFactorialWithoutLoop(int n) {
		int num = factorialFun(n);
		return num;
		
	}
	public static int factorialFun(int n) {
		if (n==0) {
			return 1;
		}
		else {
			return n * factorialFun(n-1);
		}
		
	}

	// 1234 should give 4321
	public int reverseDigits(int n) {
		int num = 0;
		int rem;
		while(n!=0) {
			rem= n%10;
			num = (int) (num *10 +rem);
			n= n/10;			
		}
		return num;	
	}

	// In between 1 to 10, the prime numbers are 1, 2, 3, 5, 7
	public int[] primeNumbersInARange(int lowerLimit, int upperLimit) {
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
		
		for(int i=lowerLimit;i<=upperLimit;i++) {
			if(i<2) {
				continue;
			}
			else {
				int k=0;
				for(int j=2; j<=i/2;j++) {
					if(i%j==0) {
						k++;
					}
					
				}
				if (k==0) {
					primeNumbers.add(i);
				}
			}
		}
		int[] primeNumbersCount = new int[primeNumbers.size()];
		for(int i=0; i<primeNumbersCount.length;i++) {
			primeNumbersCount[i]= primeNumbers.get(i);
		}
		return primeNumbersCount;		
	}

	public int findNumberOfOccurences(int[] array, int n) {
		int count = 0;
		for(int i:array) {
			if(i==n) {
				count++;
			}
		}
		return count;		
	}

	public static void main(String args[]) {
		Basics myObj = new Basics();
		//myObj.printTrianglePointingRight(5);
		myObj.printRhombus(5);
	}

	public int findFirstOccurence(int[] array, int number) {
		for (int i=0; i<array.length;i++) {
			if (array[i]==number) {
				return i;
			}
		}
		return -1;		
	}

	public void printRhombus(int size) {
		int i =0;
		int j= 1;
		while(i<size) {
			if(i<size/2) {
				for(int k=0; k<Math.abs(size/2-i);k++) {
					System.out.print(" ");
				}
				for(int k=0; k<j;k++) {
					System.out.print("*");
				}
				j+=2;
			}
			else {
				for(int k=0; k<Math.abs(size/2-i);k++) {
					System.out.print(" ");
				}
				for(int k=0; k<j;k++) {
					System.out.print("*");
				}
				j-=2;
			}
			
			System.out.println();
			i++;
		}
		int p=0;
	}

	public String getNumberLessThanTenInWords(int number) {
		//return "";
		String[] numberWords= {"zero","one","two","three","four","five","six","seven","eight","nine"};
		return numberWords[number];
		
		
	}

	public String getNumberInWords(int number) {
		//return "";
		String[] ones= {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String[] teens= {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String[] tens= {".",".","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
		//String[] hundreds={"one hundered","two hundered","three hundered","four hundered","five hundered","six hundered","seven hundered","eight hundered","nine hundered"};
		String numberInWords="";
		if(number>=1000) {
			int thousands= number/1000;
			if(thousands>9) {
				if(thousands<20) {
					numberInWords= numberInWords + teens[thousands%10] + " thousand ";
					
				}
				else {
					numberInWords = numberInWords + tens[thousands/10] + " ";
					int thousandOnes= thousands%10;
					numberInWords = numberInWords + ones[thousandOnes] + " thousand ";
					
				}
			}
			else {
				numberInWords = numberInWords + ones[thousands]+ " thousand ";
			}
			number= number%1000;
		}
		if(number>=100) {
			int hundredsNum = number/100;
			numberInWords = numberInWords + ones[hundredsNum] + " hundred ";
			number = number%100;
		}
		if(!numberInWords.isEmpty()) {
			numberInWords= numberInWords + "and ";
		}
		if( number > 9 ) {
			if(number<20) {
				numberInWords= numberInWords + teens[number%10] +" ";
				number=-1;
				
			}
			else {
				numberInWords = numberInWords + tens[number/10] + " ";
				int onesNum= number%10;
				numberInWords = numberInWords + ones[onesNum];
				number=-1;
				
			}
			
		}
		if(number > 0) {
			numberInWords = numberInWords + ones[number];
			
		}
		return numberInWords;		
	}
   
	public void printTrianglePointingRight(int size) {
		int j = 0;
		int i = 0;
		while( i < size) {
			if ( i <= size/2 ) {
				j++;
			}
			else {
				j--;
			}
			for(int k=0;k<j;k++) {
				System.out.print("*");
			}
			System.out.println();
			i++;
			}	
	}
}