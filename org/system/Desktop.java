package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		float a;
		a=15.6f;
		System.out.println(a);
		}
	
	public static void main(String args[]){
		Desktop dvalue=new Desktop();
		dvalue.desktopSize();
		dvalue.computerModel();
		
	}

}
