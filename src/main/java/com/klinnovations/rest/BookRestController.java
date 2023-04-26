package com.klinnovations.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klinnovations.binding.Book;

@RestController
public class BookRestController {
	
	@PostMapping(value = "/book",consumes  = { "application/xml", "application/json " } )
	public ResponseEntity<String> addBook(Book b){
		
		System.out.println(b);
		
		String msg = "Record Saved";
		
		return new ResponseEntity<String>(msg, HttpStatus.CREATED);
	}

	@GetMapping(value = "/book", produces = { "application/xml", "application/json " })
	public List<Book> getBook() {
		Book b = new Book();
		b.setId(101);
		b.setName("Java");
		b.setPrice(1000.00);

		Book b1 = new Book();
		b1.setId(102);
		b1.setName("DevOps");
		b1.setPrice(1200.00);

		Book b2 = new Book();
		b2.setId(103);
		b2.setName("AWS");
		b2.setPrice(1500.00);
		
		Book b3 = new Book();
		b3.setId(104);
		b3.setName("REST API");
		b3.setPrice(1500.00);

		return Arrays.asList(b, b1, b2, b3);

	}

}
