package com.evocalize.bootgraphql.model

data class Book(val id: Int, val name: String, val authorId: Int)

data class Author(val id: Int, val name: String)
