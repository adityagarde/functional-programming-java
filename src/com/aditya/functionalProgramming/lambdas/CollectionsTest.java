package com.aditya.functionalProgramming.lambdas;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionsTest {

	public static void main(String[] args) {

		Book book1 = new Book("Miss Peregrine's Home for Peculiar Children", "Ranson", "Riggs", 382);
		Book book2 = new Book("Harry Potter and The Sorcerers Stone", "JK", "Rowling", 411);
		Book book3 = new Book("The Cat in the Hat", "Dr", "Seuss", 45);

		List<Book> books = Arrays.asList(book1, book2, book3);
		
		int numberOfPages1 = books.stream()
								 .map(x -> x.getPages())
								 .reduce(0, (acc, z) -> acc + z);

		System.out.println(numberOfPages1);

		int numberOfPages2 = books.stream()
								  .collect(Collectors.summingInt(x -> x.getPages()));

		System.out.println(numberOfPages2);
		
		int numberOfPages3 = books.stream()
								  .collect(Collectors.summingInt(Book::getPages));

		System.out.println(numberOfPages3);
		
		List<String> firstNameList1 = books.stream()
										  .map(x -> x.getAuthorFName())
										  .collect(Collectors.toList());

		System.out.println(firstNameList1);

		List<String> firstNameList2 = books.stream()
										   .map(Book::getAuthorFName)
										   .collect(Collectors.toList());

		System.out.println(firstNameList2);

		List<Book> dupBooks = Arrays.asList(book1, book2, book3, book1, book2);
		
		System.out.println(dupBooks.toString());
		
		Collection<Book> noDups = new HashSet<>(dupBooks);
		
		System.out.println(noDups.toString());
	}

}
