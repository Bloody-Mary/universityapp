package ru.babushkina.week5.universityapp._main;

import ru.babushkina.week5.universityapp.models.Professor;
import ru.babushkina.week5.universityapp.models.Student;
import ru.babushkina.week5.universityapp.models.University;
import ru.babushkina.week5.universityapp.server.ProfessorActionManager;
import ru.babushkina.week5.universityapp.server.StudentActionManager;

public class _Main {
    public static void main(String[] args) {
        University university = new University("ИТМО");
        Student student = new Student("Саша", university);
        Professor professor = new Professor("Сергей Александрович", university);

        student.setProfessor(professor);
        professor.setStudent(student);

        StudentActionManager studentServer = new StudentActionManager(student);
        ProfessorActionManager professorServer = new ProfessorActionManager(professor);

        studentServer.runStudentActions();
        professorServer.runProfessorActions();
    }
}
