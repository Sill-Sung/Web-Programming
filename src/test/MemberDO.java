package test;
/*	데이터를 담아두는 저장소(객체)를 만드는 클래스	*/
public class MemberDO {
	// Field
	private String userName;
	private String userId;
	private String userPassword;
	private String userBirth;		// DATE
	private int userSex;			// number(2)
	private String userPhone;
	private String userAddress;
	private String userEmail;
	private String userGrade;
	
	//Constructor
	public MemberDO() {}
	
	//Method
	public MemberDO(String name, String id, String password, String birth, int sex, String address, String phone, String grade, String email) {
		this.userName = name;
		this.userId = id;
		this.userPassword = password;
		this.userBirth = birth;
		this.userSex = sex;
		this.userPhone = phone;
		this.userAddress = address;
		this.userEmail = email;
		this.userGrade = grade;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserBirth() {
		return userBirth;
	}

	public void setUserBirth(String userBirth) {
		this.userBirth = userBirth;
	}

	public int getUserSex() {
		return userSex;
	}

	public void setUserSex(int userSex) {
		this.userSex = userSex;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserGrade() {
		return userGrade;
	}

	public void setUserGrade(String userGrade) {
		this.userGrade = userGrade;
	}
}
