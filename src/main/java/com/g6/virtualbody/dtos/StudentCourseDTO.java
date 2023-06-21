package com.g6.virtualbody.dtos;

public class StudentCourseDTO {
    private String courseName;
    private int stuCount;

    public StudentCourseDTO(String courseName, int stuCount) {
        this.courseName = courseName;
        this.stuCount = stuCount;
    }

    public StudentCourseDTO() {
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getStuCount() {
        return stuCount;
    }

    public void setStuCount(int stuCount) {
        this.stuCount = stuCount;
    }
}
