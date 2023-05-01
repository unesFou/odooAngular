package com.unes.odoo.angular.service;

import com.unes.odoo.angular.model.Contact;
import com.unes.odoo.angular.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService implements IContactService{

    @Autowired
    private ContactRepository contactRepository;

    public List<Contact> findAll(){
        return this.contactRepository.findAll();
    }

    public void addContact(Contact contact){
        this.contactRepository.save(contact);
    }

    public void deleteContact(Long id){
        this.contactRepository.deleteById(id);
    }

    public void updateContact(Contact contact){
        this.contactRepository.save(contact);
    }

    public Optional<Contact> findContactById(Long id) {return this.contactRepository.findById(id); }


}
