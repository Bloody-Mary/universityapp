package ru.babushkina.week5.universityapp.model;

public interface StudentActions extends CommonActions {
    void attendLectures(String lectureName);
    void getGrades(String professorName);
}
