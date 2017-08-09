package com.example.hospital;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class InPatientData {
	@Persistent
	private String patientid;
	@Persistent
	private String patientname;
	@Persistent
	private String age;
	@Persistent
	private String dob;
	@Persistent
	private String address;
	@Persistent
	private String phonenumber;
	@Persistent
	private String mailid;
	@Persistent
	private String wardno;
	
	public String getPatientId() {
		return patientid;
	}
    public void setPatientId(String patientId) {
		this.patientid = patientId;
	}
    
    public String getPatientName() {
		return patientname;
	}
    public void setPatientName(String patientName) {
		this.patientname = patientName;
	}
    
    public String getPatientAge() {
		return age;
	}
    public void setPatientAge(String patientage) {
		this.age = patientage;
	}
    
    public String getPatientDob() {
		return dob;
	}
    public void setPatientDob(String patientdob) {
		this.dob = patientdob;
	}
    
    public String getPatientAddress() {
		return address;
	}
    public void setPatientAddress(String patientaddress) {
		this.address = patientaddress;
	}
    
    public String getPatientPhone() {
		return phonenumber;
	}
    public void setPatientPhone(String patientphone) {
		this.phonenumber = patientphone;
	}
    
    public String getPatientMail() {
		return mailid;
	}
    public void setPatientMail(String patientmail) {
		this.mailid = patientmail;
	}
    
    public String getPatientWard() {
		return wardno;
	}
    public void setPatientWard(String patientward) {
		this.wardno = patientward;
	}
	
}
