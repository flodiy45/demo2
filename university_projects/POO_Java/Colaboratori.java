package test;

import ro.upt.cm.poo.person.Persoana;
import ro.upt.cm.poo.person.Student;
import ro.upt.cm.poo.person.Tutor;

import javax.xml.transform.Templates;
import java.util.*;

public class Colaboratori {

    Persoana persoana;
    List<Object> contacte = new ArrayList<Object>();

    public Colaboratori(Persoana persoana) {
        this.persoana = persoana;
    }
    public void adaugaContact(Object contact){
        contacte.add(contact);
    }
    public void stergeContact(){
        try {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Introdu contactul pe care vrei sa il stergi :");
            String nume = keyboard.next();
            int nr = 0;
            for (Object elemente : contacte) {
                if(elemente.getClass()==Tutor.class) {
                    if(((Tutor) elemente).getNume().equals(nume)) {
                        contacte.remove(nr);
                    }
                }
                if(elemente.getClass()==Student.class) {
                    if(((Student) elemente).getNume().equals(nume)) {
                        contacte.remove(nr);
                    }
                }
                nr++;
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    public void Tutor(){
        for (Object elemente : contacte) {
            if(elemente.getClass()==Tutor.class) {
                System.out.println("Tutor :"+((Tutor) elemente).getNume());
                break;
            }
        }
    }
    public void numarContacte(){
        System.out.println("numar contacte "+contacte.size());
    }

}
