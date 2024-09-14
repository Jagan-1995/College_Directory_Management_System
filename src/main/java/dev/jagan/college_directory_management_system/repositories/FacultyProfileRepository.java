package dev.jagan.college_directory_management_system.repositories;

import dev.jagan.college_directory_management_system.models.FacultyProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultyProfileRepository extends JpaRepository<FacultyProfile, Long> {
    // Custom query methods if needed
}
