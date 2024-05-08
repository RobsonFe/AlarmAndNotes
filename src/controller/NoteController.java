/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import entity.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import model.Note;

/**
 *
 * @author ROBSON
 */
public class NoteController {

    public List<Note> getNotes() {
        List<Note> listNotes = new ArrayList<>();

        EntityManager manager = HibernateUtil.getManager();
        try {
            listNotes = manager.createQuery("from Note").getResultList();
        } catch (Exception e) {
            System.out.println("Erro ao Listar Notas!" + e.getMessage());
        } finally {
            manager.close();
        }
        return listNotes;
    }

    public void save(Note note) {
        EntityManager manager = HibernateUtil.getManager();

        try {
            manager.getTransaction().begin();
            manager.persist(note);
            manager.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Erro ao Salvar Notas!" + e.getMessage());
        } finally {
            manager.close();
        }
    }

}
