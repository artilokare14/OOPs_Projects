package model;

public class User {
	private String password;
	 private int userId;
	 private String userName;
	 private int age;
	 private String address;
	 private long mobileNo;
	 private String adharNo;
	 private String panNo;
	 private String email;
	 
	 public int getUserId() {
		return userId;
		
	 }
	 public void setUserId(int userId) {
		this.userId = userId;
	 }
	 public String getUserName() {
		return userName;
	 }
	 public void setUserName(String userName) {
		this.userName = userName;
	 }
	 public int getAge() {
		return age;
	 }
	 public void setAge(int age) {
		this.age = age;
	 }
	 public String getAddress() {
		return address;
	 }
	 public void setAddress(String address) {
		this.address = address;
	 }
	 public long getMobileNo() {
		return mobileNo;
	 }
	 public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	 }
	 public String getPanNo() {
		return panNo;
	 }
	 public void setPanNo(String panNo) {
		this.panNo = panNo;
	 }
	 public String getEmail() {
		return email;
	 }
	 public void setEmail(String email) {
		this.email = email;
	 }
	 
	 public String getAdharNo() {
		return adharNo;
	 }
	 public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	 }
	 @Override
	 public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", age=" + age + ", address=" + address + ", mobileNo="
				+ mobileNo + ", adharNo=" + adharNo + ", panNo=" + panNo + ", email=" + email + "]";
	 }
	 public String getPassword() {
		return password;
	 }
	 public void setPassword(String password) {
		this.password = password;
	 }
	 
	 
}
