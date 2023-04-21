package ro.cognizant.coderun2023.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IBooksRepository extends JpaRepository<Book, Integer>{
}
