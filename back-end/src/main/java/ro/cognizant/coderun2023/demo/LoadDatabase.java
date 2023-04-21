package ro.cognizant.coderun2023.demo;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;

@Configuration
@Slf4j
public class LoadDatabase {

    /*
    @Bean
    CommandLineRunner initDatabase(IBooksRepository repo){
        return args -> {
          log.info("BLBLBL " + repo.save(new Book((long)1, "SVETLANA", "SVETLANA", "SVETLANA")));
        };
    }
    */
    public LoadDatabase(){
        log.warn("BLBLBL");
        //System.out.println("");
    }

}
