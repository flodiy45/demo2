package test;

import ro.upt.cm.poo.person.Student;
import ro.upt.cm.poo.unit.Facultate;

public class Aplicatie {
    public static void main(String[] args) {
        Facultate facultate = new Facultate("ETC","Bulevardul Vasile Pârvan, Timișoara");
        Student student = new Student("Antonio", 20, 1.4, 10.0, facultate);
        Carnet carnet = new Carnet(student);
        carnet.noteaza("POO", 10.000f);
        carnet.noteaza("GDCE", 8.00f);
        carnet.noteaza("BFE", 2.00f);
        carnet.noteaza("POO", 9.999f);
        carnet.afiseazaRezultate();
        carnet.salveazaCarnet();
    }

}
