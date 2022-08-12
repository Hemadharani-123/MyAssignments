package week1.day2;
public class Calculator {
	public int additionOfNumbers(int a,int b,int c) {
		int v=a+b+c;
		return v;
	}
	public int subtractionOfNumbers(int d, int e) {
       int x=d-e;
       return x;
	}
	public double multiplicationOfNumbers(double f, double g) {
		double y=f*g;
		return y;
	}
	public float divisionOfNumbers(float h, float i) {
		float z=h/i;
		return z;
	}
public class MyCalculator{
}
	public static void main(String[] args) {
		Calculator obj=new Calculator();
		int add=obj.additionOfNumbers(8, 6, 5);
		System.out.println(add);
		int sub=obj.subtractionOfNumbers(25,45);
		System.out.println(sub);
		double mul=obj.multiplicationOfNumbers(8768,3456);
		System.out.println(mul);
		float div=obj.divisionOfNumbers(35f,5f);
		System.out.println(div);
	}
}	

