package org.javaboy.jpa2.dao2;

import org.javaboy.jpa2.bean.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDao2 extends JpaRepository<Book, Integer> {
}
