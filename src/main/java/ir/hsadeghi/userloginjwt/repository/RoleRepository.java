package ir.hsadeghi.userloginjwt.repository;

import ir.hsadeghi.userloginjwt.models.ERole;
import ir.hsadeghi.userloginjwt.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
