package com.example.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/lib")
public class LibraryController {

    @Autowired
    private LibraryService service;

    @PostMapping("/save")
    public Library saveBookDetails(@RequestBody Library library) {
        return service.save(library);

    }

    @GetMapping("/")
        public List<Library> getBookDetails() {
        return service.getDetail();
    }

    @GetMapping("/{bookId}")
    public Optional<Library> getBookById(@PathVariable("bookId") int bookId) {
        return service.getBookById(bookId);
    }

    @PutMapping("/update")
    public Library update(@RequestBody Library library) {
        return service.save(library);
    }

   @DeleteMapping("/{bookId}")
    public void deleteBook(@PathVariable("bookId") int bookId) {
        service.deleteBook(bookId);
    }
}
