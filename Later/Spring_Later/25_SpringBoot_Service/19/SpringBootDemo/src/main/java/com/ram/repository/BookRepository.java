package com.ram.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ram.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>
{
}
