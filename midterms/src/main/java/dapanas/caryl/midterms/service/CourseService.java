package dapanas.caryl.midterms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dapanas.caryl.midterms.course.Course;
import dapanas.caryl.midterms.repository.CourseSpringDataJpaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseSpringDataJpaRepository repository;

    public List<Course> getAllCourses() {
        return repository.findAll();
    }

    public Course getCourseId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Course saveCourse(Course course) {
        return repository.save(course);
    }

    public void deleteCourse(Long id) {
        repository.deleteById(id);
    }
}

