package com.tnif.collegeplacement.entity;

import jakarta.persistence.*;

@Entity
public class College {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String location;
    private String dean;
    private int totalDepartments;
    private int studentCount;
    private String website;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getDean() { return dean; }
    public void setDean(String dean) { this.dean = dean; }

    
	public int getTotalDepartments() { return totalDepartments; }
    public void setTotalDepartments(int totalDepartments) { this.totalDepartments = totalDepartments; }

    public int getStudentCount() { return studentCount; }
    public void setStudentCount(int studentCount) { this.studentCount = studentCount; }

    public String getWebsite() { return website; }
    public void setWebsite(String website) { this.website = website; }
    
    @Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", location=" + location + ", dean=" + dean
				+ ", totalDepartments=" + totalDepartments + ", studentCount=" + studentCount + ", website=" + website
				+ "]";
	}
}
