package com.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact,Long> {

}
