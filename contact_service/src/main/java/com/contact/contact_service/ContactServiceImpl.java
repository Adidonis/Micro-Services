package com.contact.contact_service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService{


    //Dummy Data 

    List<Contact> list = List.of(
        new Contact(1L,"aditya@gmail.com","Amit",101L),
        new Contact(2L,"anuj@gmail.com","Anuj",101L),
        new Contact(3L,"ashmita@gmail.com","Ashmita",102L),
        new Contact(4L,"deepanshu@gmail.com","Deepanshu",103L)
    );

    @Override
    public List<Contact> getContactOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
