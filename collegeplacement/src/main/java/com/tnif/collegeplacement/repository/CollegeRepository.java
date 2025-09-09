package com.tnif.collegeplacement.repository;

import com.tnif.collegeplacement.entity.College;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollegeRepository extends JpaRepository<College, Long> {
}
