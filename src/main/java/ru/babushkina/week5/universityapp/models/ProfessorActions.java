package ru.babushkina.week5.universityapp.models;

public interface ProfessorActions extends CommonActions {
    void giveLectures(String lectureName);
    void takeExams(String lectureName);
}
