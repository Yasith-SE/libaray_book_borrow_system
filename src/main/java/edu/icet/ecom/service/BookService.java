package edu.icet.ecom.service;

import edu.icet.ecom.model.Book;
import edu.icet.ecom.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public void getAllDetails(){
        bookRepository.findAll();
    }

    public void add(){
        Book book = new Book(
                4L,
                "Sherlock Holmes",
                "Arthar Conan",
                "Sarasavi",
                "999-999-888-777",
                "Sinhala Lit",
                12
        );
        bookRepository.save(book);
    }
}
