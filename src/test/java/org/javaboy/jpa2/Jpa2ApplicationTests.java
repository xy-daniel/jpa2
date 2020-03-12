package org.javaboy.jpa2;

import org.javaboy.jpa2.dao1.BookDao1;
import org.javaboy.jpa2.dao2.BookDao2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Jpa2ApplicationTests {

    @Autowired
    BookDao1 bookDao1;

    @Autowired
    BookDao2 bookDao2;

    @Test
    void bookDao1() {
        System.out.println(bookDao1.findAll());
    }

    @Test
    void bookDao2() {
        System.out.println(bookDao2.findAll());
    }

}
