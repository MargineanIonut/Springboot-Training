package com.springtraining.training.bootstrap;

import com.springtraining.training.model.Author;
import com.springtraining.training.model.Book;
import com.springtraining.training.model.Publisher;
import com.springtraining.training.repo.AutorRepository;
import com.springtraining.training.repo.BookRepository;
import com.springtraining.training.repo.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AutorRepository autorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AutorRepository autorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.autorRepository = autorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }

    public void initData() {

        Publisher publisher = new Publisher();
        publisher.setName("foo");
        publisherRepository.save(publisher);

        Author elon = new Author("Elon", "Musk");
        Book book = new Book("Elon's first book", "1234", publisher);
        elon.getBooks().add(book);
        book.getAuthors().add(elon);

        autorRepository.save(elon);
        bookRepository.save(book);

        Author bill = new Author("Bill", "Gates");
        Book book2 = new Book("How to stuff...?", "23412", publisher);
        bill.getBooks().add(book2);

        autorRepository.save(bill);
        bookRepository.save(book2);
    }
}
