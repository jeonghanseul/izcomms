package egovframework.example.sample.service;


public class MemberVO extends MemberDefaultVO {

	private static final long serialVersionUID = 5836196838072467221L;
	
	private String id;
	private String pwd;
	private String name;
	private String telNo;
	private String email;
	private String grade;
	private String memberGroup;
	private String joinDate;
	private String refireDate;
	private String address;
	private String detailAddress;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelNo() {
		return telNo;
	}
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getMemberGroup() {
		return memberGroup;
	}
	public void setMemberGroup(String memberGroup) {
		this.memberGroup = memberGroup;
	}
	public String getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
	public String getRefireDate() {
		return refireDate;
	}
	public void setRefireDate(String refireDate) {
		this.refireDate = refireDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDetailAddress() {
		return detailAddress;
	}
	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}
	
}
