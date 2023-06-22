package com.g6.virtualbody.dtos;

public class ClassroomTeacherDTO {
    private String teacherName; //aquí
    private int classCount;

    public ClassroomTeacherDTO(String teacherName, int classCount) {
        this.teacherName = teacherName;
        this.classCount = classCount;
    }

    public ClassroomTeacherDTO() {
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getClassCount() {
        return classCount;
    }

    public void setClassCount(int classCount) {
        this.classCount = classCount;
    }
}
