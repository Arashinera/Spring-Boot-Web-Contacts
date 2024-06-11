package app.SpringBootWebContacts.service;

import app.SpringBootWebContacts.entity.Contact;
import app.SpringBootWebContacts.repository.ContactRepository;
import app.SpringBootWebContacts.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class ContactService {

    @Autowired
    ContactRepository repository;

    public List<Contact> getTours() {
        Iterable<Contact> iterable = repository.findAll();
        List<Contact> list =
                StreamSupport.stream(iterable.spliterator(), false)
                        .map(contact -> new Contact(contact.getId(),
                                Constants.URL_IMAGES + contact.getImg(),
                                contact.getFirstName(),
                                contact.getLastName(),
                                contact.getPhoneNumber()))
                        .toList();
        return new ArrayList<>(list);
    }
}
