package dapanas.caryl.midterms.commandlinerunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dapanas.caryl.midterms.course.Course;
import dapanas.caryl.midterms.repository.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    //@Autowired
    //private CourseJpaRepository repository;
   
   @Autowired
    private CourseSpringDataJpaRepository repository;   
        
        
        @Override
        public void run(String... args) throws Exception {
            System.out.println("All Courses in Database:");
            repository.findAll().forEach(System.out::println);
        }

    }


