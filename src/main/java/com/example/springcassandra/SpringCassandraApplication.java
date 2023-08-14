package com.example.springcassandra;

import com.example.springcassandra.entity.CyclistCategory;
import com.example.springcassandra.repo.CyclistCategoryRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class SpringCassandraApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCassandraApplication.class, args);
    }

    @Bean
    public ApplicationRunner applicationRunner(CyclistCategoryRepository cyclistCategoryRepository){
        return args -> {
            System.out.println(cyclistCategoryRepository);

            CyclistCategory c1 = new CyclistCategory("Cat1",4, UUID.randomUUID(),"LN");
            CyclistCategory c2 = new CyclistCategory("Cat1",6, UUID.randomUUID(),"LN1");
            CyclistCategory c3 = new CyclistCategory("Cat2",6, UUID.randomUUID(),"LN2");

            System.out.println("Adding all------------------");
            cyclistCategoryRepository.saveAll(List.of(c1,c2,c3));
            System.out.println("Fetching all---------------");
            cyclistCategoryRepository.findAll().forEach(System.out::println);
        };
    }
}
