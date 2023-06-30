package ru.babushkina.week5.universityapp.models;

public interface StudentActions extends CommonActions {
    void attendLectures(String lectureName);
    void getGrades(String professorName);
}
