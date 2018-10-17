package com.evocalize.bootgraphql.resolver

import com.coxautodev.graphql.tools.GraphQLResolver
import com.evocalize.bootgraphql.model.Author
import com.evocalize.bootgraphql.model.Book
import com.evocalize.bootgraphql.repository.AuthorRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class BookResolver(@Autowired val authorRepo: AuthorRepository) : GraphQLResolver<Book> {

    fun author(book: Book): Author {
        return authorRepo.findAuthorById(book.authorId)
    }
}

