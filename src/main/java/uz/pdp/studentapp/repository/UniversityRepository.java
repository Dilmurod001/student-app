package uz.pdp.studentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.studentapp.entity.University;

@Repository
public interface UniversityRepository extends JpaRepository<University, Integer> {
}
