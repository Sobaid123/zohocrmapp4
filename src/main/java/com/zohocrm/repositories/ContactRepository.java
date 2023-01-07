package com.zohocrm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.entities.Contacts;
import com.zohocrm.entities.Lead;

public interface ContactRepository extends JpaRepository<Contacts, Long> {

}
