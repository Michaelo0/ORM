package com.example.demo

import com.example.demo.entity.Book
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class BookService {
    @Autowired
    private val bookRepository: BookRepository? = null
    fun list(): List<Book> {
        return bookRepository!!.findAll()
    }
}