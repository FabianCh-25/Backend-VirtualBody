package com.g6.virtualbody.dtos;

public class GroupStudentDTO {
    private String studentName;
    private int gxeCount;

    public GroupStudentDTO(String studentName, int gxeCount) {
        this.studentName = studentName;
        this.gxeCount = gxeCount;
    }
    public GroupStudentDTO(){

    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getGxeCount() {
        return gxeCount;
    }

    public void setGxeCount(int gxeCount) {
        this.gxeCount = gxeCount;
    }
}
