package test;

import ro.upt.cm.poo.person.Persoana;
import ro.upt.cm.poo.person.Student;
import ro.upt.cm.poo.person.Tutor;
import ro.upt.cm.poo.unit.Facultate;

public class Aplicatie {
    public static void main(String[] args) {
        Persoana persoana = new Persoana("andrei");
        Facultate facultate = new Facultate("ETC","Adresa");
        Tutor tutor1 = new Tutor("Adrian",12,1.2,"Prof","525",facultate);
        Tutor tutor2 = new Tutor("Ion",12,1.2,"Prof","525",facultate);
        Student student = new Student("Flavius",12,1.2,5,facultate);
        Colaboratori colaborator = new Colaboratori(persoana);
        colaborator.adaugaContact(tutor1);
        colaborator.adaugaContact(tutor2);
        colaborator.adaugaContact(student);
        colaborator.stergeContact();
        colaborator.Tutor();
        colaborator.numarContacte();
    }
}
