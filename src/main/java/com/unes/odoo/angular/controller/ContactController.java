package com.unes.odoo.angular.controller;

import com.unes.odoo.angular.model.Contact;
import com.unes.odoo.angular.service.IContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("contact")
public class ContactController {

    @Autowired
    private IContactService iContactService;

    @GetMapping("/all")
    public List<Contact> getAllContact(){
        return this.iContactService.findAll();
    }

    @GetMapping("/{id}")
    public void getContactById(@PathVariable("id") long id) {
        this.iContactService.findContactById(id);
    }

    @PostMapping("/add")
    public void createContact(@RequestBody Contact contact) {
        this.iContactService.addContact(contact);
    }

    @PutMapping("/{id}")
    public void updateContact(@PathVariable("id") long id, @RequestBody Contact contact) {
    this.iContactService.updateContact(contact);
    }

    @DeleteMapping("/{id}")
    public void deleteTutorial(@PathVariable("id") long id) {
    this.iContactService.deleteContact(id);
    }

}