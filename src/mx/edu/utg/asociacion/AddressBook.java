package mx.edu.utg.asociacion;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	
	private String name;
	private List<Contact> contacts;
	private List<ContactGroup> contactGroups;

	//Asociación de composición
	public AddressBook(){
		
		this.contacts = new ArrayList<Contact>();
		this.contactGroups = new ArrayList<ContactGroup>();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
