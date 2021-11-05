package com.example.courseinformation.service;

        import com.example.courseinformation.model.Course;
        import com.example.courseinformation.repository.CourseRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

        import javax.transaction.Transactional;
        import java.util.List;

@Service
public class CourseServiceImpl {

    @Autowired
    private CourseRepository courseRepository;

//    @Transactional
//    public Iterable<Course> findAllByTitleContainingIgnoreCase(String filter) {
//        return courseRepository.findAll(filter);
//    }
    @Transactional
    public List<Course> findAll() {
        return courseRepository.findAll();
    }
    @Transactional
    public Course findById(int id) {
        return courseRepository.findById(id).get();
    }
//    @Transactional
//    public void save(Course course) {
//        courseRepository.save(course);
//    }
//    @Transactional
//    public void deleteById(int id) {
//        courseRepository.delete(courseRepository.findById(id).get());
//    }
}
