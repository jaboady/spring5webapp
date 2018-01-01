package fr.ranaivoson.spring5webapp.repositories;

import fr.ranaivoson.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
