package mx.edu.utg.asociacion;

import java.util.List;

public class Account {

	private String name;
	private String emailAddress;
	private List<AddressBook> isAccessBy;
	
	//Asociación de Agregación
	public Account(List<AddressBook> isAccessBy){
		
		this.isAccessBy = isAccessBy;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	
	
	
}
