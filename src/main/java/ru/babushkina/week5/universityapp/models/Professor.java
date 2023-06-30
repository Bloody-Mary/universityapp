package ru.babushkina.week5.universityapp.models;

public class Professor implements ProfessorActions {
    String name;
    University university;
    Student student;

    public Professor(String name, University university) {
        this.name = name;
        this.university = university;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public void visitLibrary() {
        System.out.println("Здравствуйте! Меня зовут " + name + ". Всем студентам советую посещать нашу библиотеку, где вы можете найти всю необходимую литературу и успешно сдать экзамены.");
    }

    @Override
    public void getScholarship() {
        System.out.println("Самым успешным студентам я помогаю с получением международной стипендии, чтобы они смогли получить знания в самых лучших университетах мира.");
    }

    @Override
    public void giveLectures(String lectureName) {
        System.out.println("Я, " + name + ", в нашем университете преподаю предмет " + lectureName + ".");
    }

    @Override
    public void takeExams(String lectureName) {
        System.out.println("В нашем университете экзамены принимаю я по дисциплине " + lectureName + " принимаю я.");
    }
}
