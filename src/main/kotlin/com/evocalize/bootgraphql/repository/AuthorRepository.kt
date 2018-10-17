package com.evocalize.bootgraphql.repository

import com.evocalize.bootgraphql.model.Author
import org.springframework.stereotype.Component

@Component
class AuthorRepository {

    fun findAuthorById(id: Int): Author {
        if (id == 1) {
            return Author(1, "Stephen King")
        } else if (id == 2) {
            return Author(2, "Isaac Asimov")
        }
        return Author(3, "No Author found?")
    }
}