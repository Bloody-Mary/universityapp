package ru.babushkina.week5.universityapp.server;

import ru.babushkina.week5.universityapp.model.StudentActions;

public class StudentActionManager {
    StudentActions student;

    public StudentActionManager(StudentActions student) {
        this.student = student;
    }

    public void runStudentActions() {
        student.visitLibrary();
        student.getScholarship();
        student.attendLectures("Алгоритмы и структуры данных");
        student.getGrades("Сергей Александрович");
    }
}
