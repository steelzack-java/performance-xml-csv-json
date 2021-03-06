package com.steelzack.test.drive.jaxb.books.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "book", namespace = "http://www.bookshelexample.com")
public class Book {
	@XmlAttribute(name = "name")
	private String title;
	@XmlElement
	private Integer pages;
	@XmlElement
	private String genre;
	@XmlElement
	private String author;

	public String getAuthor() {
		return author;
	}

	public Integer getPages() {
		return pages;
	}

	public String getGenre() {
		return genre;
	}

	public String getTitle() {
		return title;
	}
}
