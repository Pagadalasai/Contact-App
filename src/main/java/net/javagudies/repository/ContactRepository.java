package net.javagudies.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javagudies.entity.Contact;


public interface ContactRepository extends JpaRepository<Contact, Integer>{

}
