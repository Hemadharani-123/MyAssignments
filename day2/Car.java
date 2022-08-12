package week1.day2;
public class Car {
	public void printCarName(){
			System.out.println("MarutiSwift");	
		}
		public String getCarColor(){
			return "White";
		}
		public int getCarEngineNumber(){
			return 768954;
		}
		public int subTwoNumbers(int a,int b){
			int c;
			c=a-b;
			return c;
		}
		public int multipleTwoNumbers(int d, int e){
			int f;
			f=d*e;
			return f;
		}
		public float divisionTwoNumbers(float g, float h){
			float i;
			i=g/h;
			return i;
		}
		public static void main(String[]args){
			Car obj=new Car();
			obj.printCarName();
			String colour=obj.getCarColor();
			System.out.println(colour);
			int number=obj.getCarEngineNumber();
			System.out.println(number);
			int sub=obj.subTwoNumbers(8,4);
			System.out.println(sub);
			int mul=obj.multipleTwoNumbers(5,9);
			System.out.println(mul);
			float div=obj.divisionTwoNumbers(78.95f,32.0f);
			System.out.println(div);
	}
}
