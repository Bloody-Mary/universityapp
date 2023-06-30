package ru.babushkina.week5.universityapp.models;

public class Student implements StudentActions {
    String name;
    University university;
    Professor professor;

    public Student(String name, University university) {
        this.name = name;
        this.university = university;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public void visitLibrary() {
        System.out.println("Всем привет! Меня зовут " + name + ". Я люблю ходить в библиотеку. Там я нахожу всю необходимую литературу, чтобы хорошо сдавать экзамены.");
    }

    @Override
    public void getScholarship() {
        System.out.println("Недавно я, " + name + ", выиграл международную стипендию, так как хорошо учился и проявлял себя. Ура!");
    }

    @Override
    public void attendLectures(String lectureName) {
        System.out.println("Мне нравится учиться на своей специальности и посещать лекции " + lectureName + ".");
    }

    @Override
    public void getGrades(String professorName) {
        System.out.println("Мне нравится посещать все лекции в университете, но больше всего нравится преподаватель " + professorName + ". Он читает лекции лучше и интереснее всех.");
    }
}
