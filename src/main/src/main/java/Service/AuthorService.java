package library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import library.repository.AuthorRepository;
import library.model.Author;
import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    public Author findAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    public void addAuthor(Author author) {
        authorRepository.save(author);
    }
}
