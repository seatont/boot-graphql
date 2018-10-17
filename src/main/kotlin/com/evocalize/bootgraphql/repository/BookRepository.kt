package com.evocalize.bootgraphql.repository

import com.evocalize.bootgraphql.model.Book
import org.springframework.stereotype.Component

@Component
class BookRepository {

    fun fetchAllBooks(): List<Book> {
        val book1 = Book(1, "Where the wild things are", 1)
        val book2 = Book(2, "The Prize", 2)
        val book3 = Book(3, "Don Quixote", 3)
        return listOf(book1, book2, book3)
    }
}