package com.ram.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ram.exception.BookNotFoundException;
import com.ram.exception.BookUnSupportedFieldPatchException;
import com.ram.model.Book;
import com.ram.repository.BookRepository;

@RestController
public class BookController
{

	@Autowired
	private BookRepository repository;

	@PostMapping("/books")
	@ResponseStatus(HttpStatus.CREATED)
	public Book createBook(@Valid @RequestBody Book book)
	{
		return repository.save(book);
	}

	@PutMapping("/books/{id}")
	public Book updateBook(@RequestBody Book book, @PathVariable Long id)
	{

		return repository.findById(id).map(x -> {
			x.setName(book.getName());
			x.setAuthor(book.getAuthor());
			x.setPrice(book.getPrice());
			return repository.save(x);
		}).orElseGet(() -> {
			book.setId(id);
			return repository.save(book);
		});
	}

	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable Long id)
	{
		return repository.findById(id).orElseThrow(() -> new BookNotFoundException(id));
	}

	@GetMapping("/books")
	public List<Book> getAllBooks()
	{
		return repository.findAll();
	}

	@PatchMapping("/books/{id}")
	public Book updateBookAuthor(@RequestBody Map<String, String> map, @PathVariable Long id)
	{

		return repository.findById(id).map(x -> {

			String author = map.get("author");
			if (!StringUtils.isEmpty(author))
			{
				x.setAuthor(author);

				return repository.save(x);
			}
			else
			{
				throw new BookUnSupportedFieldPatchException(map.keySet());
			}

		}).orElseGet(() -> {
			throw new BookNotFoundException(id);
		});

	}

	@DeleteMapping("/books/{id}")
	public void deleteBook(@PathVariable Long id)
	{
		repository.deleteById(id);
	}

}
