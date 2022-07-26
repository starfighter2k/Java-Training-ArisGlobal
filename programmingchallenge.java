package training;
import java.util.*;
import java.io.*;
public class programmingchallenge {
	public void swapNum(int x,int y)
	{
		System.out.println("Original value of X= "+x+" and original value of Y= "+y);
		int t;
		System.out.println("Swapping values");
		t = x;
		x = y;
		y = t;
		System.out.println("Current value of X= "+x+" and current value of Y= "+y);
	}
	public int revNum(int x)
	{
		String temp = Integer.toString(x);
		String res="";
		for(int j=temp.length()-1;j>=0;j--)
		{
			res += temp.charAt(j);
		}
		return Integer.parseInt(res);
	}
	public void printFibo(int x)
	{
		if(x == 0)
			System.out.println("The first 0 elements of Fibonacci series are: ");
		else if(x==1)
			System.out.println("The first element of Fibonacci series is 0");
		else if(x==2)
			System.out.println("The first 2 elements of the Fibonacci series are: 0,1");
		else {
		int a=0,b=1,c;
		System.out.print("First "+x+" elements of Fibinacci series are: 0,1,");
		for(int i=1;i<x-1;i++)
		{
			c = a + b;
			System.out.print(c+",");
			a = b;
			b = c;
		}
		System.out.println();}
	}
	public void isPalindrome(int x)
	{
		if(x == revNum(x))
			System.out.println(x+" is a Palindrome number");
		else
			System.out.println(x+" is not a Palindrome number");
	}
	public int calLCM(int x,int y)
	{
		int lim = (x<y?x:y);
		int res=1;
		for(int i=2;i<=lim;i++)
		{
			if(x%i==0 && y%i == 0)
			{
				x = x/i;
				y = y/i;
				res *= i;
			}
		}
		if(x!=1)
			res *= x;
		if(y!=1)
			res *= y;
		return res;
	}
	public String revStr(String s)
	{
		String res="";
		for(int i=s.length()-1;i>=0;i--)
			res += s.charAt(i);
		return res;
	}
	public int secondHighest(int[] arr)
	{
		int res=0,max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
				res = max;
			}
		}
		return res;
	}
	public boolean isPrime(int x)
	{
		for(int i=2;i<=x/2;i++)
		{
			if(x%i == 0)
			{
				return false;
			}
		}
		return true;
	}
	public void firstHundPrime()
	{
		System.out.print("The first hundred prime numbers are: ");
		int count = 100,i=1;
		while(count>0)
		{
			if(isPrime(i))
			{
				System.out.print(i+",");
				count--;
			}
			i++;
		}
		System.out.println();
	}
	public void remDup(int[] arr)
	{
		int[] res = new int[arr.length];
		int currEl,j,f,lenRes=0;
		for(int i=0;i<res.length;i++)
			res[i] = -1;
		for(int i=0;i<arr.length;i++)
		{
			currEl = arr[i];
			j=0;
			f=0;
			while(res[j] != -1)
			{
				if(currEl == res[j])
				{
					f=1;
					break;
				}
				j++;
				if(res.length <= j)
					break;
			}
			if(f==0) {
				res[j] = currEl;
				lenRes = j;}
		}
		System.out.print("Array after removing dupes: ");
		for(int i=0;i<=lenRes;i++)
			System.out.print(res[i]+",");
		
	}
	public static void main(String []args)
	{
		programmingchallenge obj = new programmingchallenge();
		obj.swapNum(2, 3);
		System.out.println("Result= "+obj.revNum(1234));
		obj.printFibo(10);
		obj.isPalindrome(121);
		System.out.println("LCM = "+obj.calLCM(12, 6));
		System.out.println("Reversed String = "+obj.revStr("SomeString"));
		int arrIn[] = new int[10];
		for(int i=0;i<10;i++)
			arrIn[i] = i + 1;
		System.out.println("Second Highest Value in Array is = "+obj.secondHighest(arrIn));
		if(obj.isPrime(17))
			System.out.println("17 is a prime number");
		else
			System.out.println("17 is not a prime number");
		obj.firstHundPrime();
		arrIn[6] = 6;
		arrIn[9] = 2;
		obj.remDup(arrIn);
		
	}

}
