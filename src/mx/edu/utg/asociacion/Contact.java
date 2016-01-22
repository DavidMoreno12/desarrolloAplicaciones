package mx.edu.utg.asociacion;

public class Contact {

	private String name;
	private String primaryContactMethod;
	private String emailAdress;
	private String faxNumber;
	public String getName() {
		return name;
	}
	public String getPrimaryContactMethod() {
		return primaryContactMethod;
	}
	public String getEmailAdress() {
		return emailAdress;
	}
	public String getFaxNumber() {
		return faxNumber;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrimaryContactMethod(String primaryContactMethod) {
		this.primaryContactMethod = primaryContactMethod;
	}
	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}
	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}
	
	
}
