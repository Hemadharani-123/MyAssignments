package week3.day1.assignment;

public class Students {
	public static void main(String[] args) {
		Students std=new Students();
		std.getStudentInfo(786);
		std.getStudentInfo(786, "Hemadharani");
		std.getStudentInfo("hema345@gmail.com", 9876543257l);
}
	public void getStudentInfo(int id) {
		// TODO Auto-generated method stub
		System.out.println(id);
	}
	public void getStudentInfo(int id, String name) {
		// TODO Auto-generated method stub
		System.out.println(id + name);
	}
	public void getStudentInfo(String email, long phone) {
		// TODO Auto-generated method stub
		System.out.println(email + phone);
	}
	
}

/*public void getStudentInfo(int id, String name) {
	// TODO Auto-generated method stub
	System.out.println(id+name);
}
public void getStudentInfo(String email, long phone) {
	// TODO Auto-generated method stub
	System.out.println(email+phone);
}*/
