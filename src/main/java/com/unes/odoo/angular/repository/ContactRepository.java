package com.unes.odoo.angular.repository;

import com.unes.odoo.angular.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact,Long> {
}
