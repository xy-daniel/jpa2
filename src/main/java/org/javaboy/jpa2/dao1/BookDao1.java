package org.javaboy.jpa2.dao1;

import org.javaboy.jpa2.bean.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDao1 extends JpaRepository<Book, Integer> {
}
