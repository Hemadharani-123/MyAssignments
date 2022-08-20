package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department{
	
public void studentName() {
	System.out.println("Hemadharani");
	}
public void studentDept() {
	System.out.println("Civil");
	}

public void studentId() {
	System.out.println("61590025");
}

public static void main(String[] args) {
	Student svalue= new Student();
	svalue.studentDept();
	svalue.studentId();
	svalue.studentName();
	svalue.deptName();
	svalue.collegeCode();
	svalue.collegeName();
	svalue.collegeRank();
	
	/*Department dvalue=new Department();
	dvalue.deptName();
	dvalue.collegeCode();
	dvalue.collegeName();
	dvalue.collegeRank();
	
	College cvalue= new College();
	cvalue.collegeCode();
	cvalue.collegeName();
	cvalue.collegeRank();
*/
}

}
