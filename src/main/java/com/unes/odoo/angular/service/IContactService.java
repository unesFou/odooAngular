package com.unes.odoo.angular.service;

import com.unes.odoo.angular.model.Contact;

import java.util.List;
import java.util.Optional;

public interface IContactService {

    public List<Contact> findAll();
    public void addContact(Contact contact);
    public void deleteContact(Long id);
    public void updateContact(Contact contact);
    Optional<Contact> findContactById(Long id);
}
