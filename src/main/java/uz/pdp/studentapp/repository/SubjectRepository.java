package uz.pdp.studentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.studentapp.entity.Address;
import uz.pdp.studentapp.entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {

    boolean existsByName(String name);

}
