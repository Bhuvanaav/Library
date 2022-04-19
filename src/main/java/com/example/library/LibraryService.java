package com.example.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibraryService {

    @Autowired
    private LibraryRepository repository;

    public Library save(Library library) {
        return repository.save(library);
    }


    public List<Library> getDetail() {
        return repository.findAll();
    }


    public Optional<Library> getBookById(int bookId) {
        return repository.findById(bookId);
    }



    public void deleteBook(int bookId) {
        repository.deleteById(bookId);
    }
}
