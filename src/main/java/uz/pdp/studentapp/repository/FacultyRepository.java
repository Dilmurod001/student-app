package uz.pdp.studentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.studentapp.entity.Faculty;

import java.util.List;

public interface FacultyRepository extends JpaRepository<Faculty, Integer> {

    boolean existsByNameAndUniversityId(String name, Integer university_id);

    List<Faculty> findAllByUniversityId(Integer university_id);


}
