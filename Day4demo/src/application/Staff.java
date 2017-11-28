package application;

public class Staff 
{private int staffId;
private String name;
private String nickName;
public Staff(int staffId, String name, String nickName) {
	super();
	this.staffId = staffId;
	this.name = name;
	this.nickName = nickName;
}
public int getStaffId() {
	return staffId;
}
public void setStaffId(int staffId) {
	this.staffId = staffId;
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
	return "Staff [staffId=" + staffId + ", name=" + name + ", nickName=" + nickName + "]";
}

}
