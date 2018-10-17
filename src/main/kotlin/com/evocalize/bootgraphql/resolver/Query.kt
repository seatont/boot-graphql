package com.evocalize.bootgraphql.resolver

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.evocalize.bootgraphql.model.Book
import com.evocalize.bootgraphql.repository.BookRepository
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class Query(@Autowired val bookRepo : BookRepository) : GraphQLQueryResolver {
    private val log = LoggerFactory.getLogger(this::class.java)

    fun books() : List<Book> {
        log.info("Fetching all books!")
        return bookRepo.fetchAllBooks()
    }

    fun version() : String {
        return "1.0.0"
    }
}