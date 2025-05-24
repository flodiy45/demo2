package test;

import ro.upt.cm.poo.person.Student;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class Carnet {
    private static PrintWriter fout = null;
    Student student = new Student();
    HashMap<String,Float> note = new HashMap<String,Float>();

    public Carnet(Student student) {
        this.student = student;
    }
    public void noteaza(String curs,Float nota){
        if(nota <= 10 || nota >= 1){
            if(note.containsKey(curs)) {
                note.replace(curs, nota);
            }else note.put(curs,nota);
        }
    }

    public void afiseazaRezultate(){
        System.out.println("Materii cu note mai mici de 5: ");
        for (Map.Entry<String, Float> notaa : note.entrySet()){
            if(notaa.getValue() < 5f){
                System.out.println(notaa.getKey()+" ");
            }
        }
    }
    public void salveazaCarnet(){
        try{
            String numecarnet = "carnet_"+student.getNume()+".txt";
            fout = new PrintWriter(new FileWriter(numecarnet));
            fout.println(String.format("Student: %s ", student.getNume()));
            for (Map.Entry<String, Float> notaa : note.entrySet()){
                fout.println(String.format("Materia %s ,Nota:%f", notaa.getKey(),notaa.getValue()));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            if(fout != null) fout.close();
        }
    }

}
