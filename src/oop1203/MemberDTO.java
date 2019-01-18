package oop1203;

public class MemberDTO {	//main() ¾øÀ½
	
	private String id;
	private String password;
	private String name;
	private String email;
	private String phone;
	
	public MemberDTO() {}
	//Source ¡æ Generate Getters and Setters...¡æSelect All ¡æ Generate
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", password=" + password + ", name=" + name + ", email=" + email + ", phone="
				+ phone + "]";
	}
	
}//class end
