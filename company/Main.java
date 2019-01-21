package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StudentEntityManager sem = new StudentEntityManager();
        sem.save(new Student(1,"Jony","Ponti",30,5.4f));
    }
}
