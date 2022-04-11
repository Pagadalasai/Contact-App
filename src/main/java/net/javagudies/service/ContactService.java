package net.javagudies.service;

import java.util.List;

import net.javagudies.entity.Contact;

public interface ContactService {

	public boolean saveContact (Contact contact);
	
	public List<Contact> getallcontact();
	
	public Contact getContactById (Integer ContactId);
	
	public boolean deleteContactById (Integer ContactId);
}
