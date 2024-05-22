package com.example.app.SpringBootWebContacts.controller;

import com.example.app.SpringBootWebContacts.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.net.URISyntaxException;

@Controller
public class ContactController {

    @Autowired
    ContactService contactService;

    @GetMapping("/")
    public String getContact(Model model) throws URISyntaxException, IOException {
        model.addAttribute("contacts", contactService.getContacts());
        return "home";
    }
}
