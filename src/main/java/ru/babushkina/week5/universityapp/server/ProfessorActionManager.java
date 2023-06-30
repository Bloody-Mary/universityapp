package ru.babushkina.week5.universityapp.server;

import ru.babushkina.week5.universityapp.model.ProfessorActions;

public class ProfessorActionManager {
    ProfessorActions professor;

    public ProfessorActionManager(ProfessorActions professor) {
        this.professor = professor;
    }

    public void runProfessorActions() {
        professor.visitLibrary();
        professor.getScholarship();
        professor.giveLectures("Алгоритмы и структуры данных");
        professor.takeExams("Алгоритмы и структуры данных");
    }
}
