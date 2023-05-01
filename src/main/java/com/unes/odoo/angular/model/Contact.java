package com.unes.odoo.angular.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String street1;
    private String street2;
    private String city;
    private String stat;
    private String zip;
    private String country;
    private String vat;
    private String job_position;
    private String phone;
    private String mobile;
    private String email;
    private String webSite;
    private String title;
    private Company_type company_type;
}
