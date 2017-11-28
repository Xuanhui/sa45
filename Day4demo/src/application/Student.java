package application;

import java.util.Comparator;

public class Student implements Comparable<Student> ,Comparator<Student>{
	private int studentId;
	private String name;
	private String nickName;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + studentId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (studentId != other.studentId)
			return false;
		return true;
	}
	public Student(int studentId, String name, String nickName) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.nickName = nickName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", nickName=" + nickName + "]";
	}
	@Override
	public int compareTo(Student arg0) {
		// TODO Auto-generated method stub
		if(this.studentId<arg0.studentId) {
			return -1;
		}else if(this.studentId>arg0.studentId)
			return +1;
		else {
			return 0;
		}
		
	}
	@Override
	public int compare(Student arg0, Student arg1) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
    
}
