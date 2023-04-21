package ro.cognizant.coderun2023.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    private final IBooksRepository repo;

    private static final String HELLO = """
            <h1>Hello Code Runners!</h1>
            <p>Wish you good luck!</p>
            """;

    public DemoController(IBooksRepository repo) {
        this.repo = repo;
    }

//    @GetMapping("/")
//    public String helloWorld() {
//        return HELLO;
//    }

    @GetMapping("/books")
    public String books() {
        List<Book> booksList = repo.findAll().stream().toList();
        String frontEnd = "<p>";
        for(var b : booksList)
        {
            frontEnd += b.getBookName() + " | " + b.getBookAuthor() + " | " + b.getBookPublisher();
            frontEnd += "</p><p>";
        }
        frontEnd += "</p>";
        return frontEnd;
    }

    @GetMapping("/books/search")
    public String booksSearch() {
        return "<div><p>SVETLANA CAUTA CARTI</p></div>";
    }

    //@PostMapping()

}
