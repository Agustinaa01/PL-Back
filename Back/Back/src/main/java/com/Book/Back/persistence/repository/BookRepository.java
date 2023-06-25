package com.Book.Back.persistence.repository;

import com.Book.Back.persistence.entities.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository <Books, Long> {

}
