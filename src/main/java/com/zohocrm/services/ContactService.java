package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entities.Contacts;

public interface ContactService {
  public void saveContact(Contacts contacts);

  public List<Contacts> getAllContacts();

  public Contacts getContactById(long id);
}
