package com.g6.virtualbody.dtos;

public class ActivityStudentDTO {
    private String activity;
    private int studentCount;

    public ActivityStudentDTO() {
    }

    public ActivityStudentDTO(String activity, int studentCount) {
        this.activity = activity;
        this.studentCount = studentCount;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }
}
