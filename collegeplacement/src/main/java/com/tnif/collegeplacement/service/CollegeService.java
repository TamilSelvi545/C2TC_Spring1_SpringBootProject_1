package com.tnif.collegeplacement.service;

import com.tnif.collegeplacement.entity.College;
import com.tnif.collegeplacement.repository.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeService {

    @Autowired
    private CollegeRepository collegeRepo;

    public List<College> getAllColleges() {
        return collegeRepo.findAll();
    }

    public College getCollegeById(Long id) {
        return collegeRepo.findById(id).orElse(null);
    }

    public College createCollege(College college) {
        return collegeRepo.save(college);
    }

    public College updateCollege(Long id, College college) {
        College existing = collegeRepo.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(college.getName());
            existing.setLocation(college.getLocation());
            existing.setDean(college.getDean());
            existing.setTotalDepartments(college.getTotalDepartments());
            existing.setStudentCount(college.getStudentCount());
            existing.setWebsite(college.getWebsite());
            return collegeRepo.save(existing);
        }
        return null;
    }

    public void deleteCollege(Long id) {
        collegeRepo.deleteById(id);
    }
}
