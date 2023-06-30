package ru.babushkina.week5.universityapp.model;

public interface ProfessorActions extends CommonActions {
    void giveLectures(String lectureName);
    void takeExams(String lectureName);
}
