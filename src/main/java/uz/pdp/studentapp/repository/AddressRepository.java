package uz.pdp.studentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.studentapp.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
