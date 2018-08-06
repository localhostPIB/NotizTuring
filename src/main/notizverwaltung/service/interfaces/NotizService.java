package main.notizverwaltung.service.interfaces;


import main.notizverwaltung.model.classes.Notiz;

import java.util.List;
import main.notizverwaltung.model.classes.Kategorie;
import main.notizverwaltung.model.classes.Notiz;

import java.util.List;


import main.notizverwaltung.model.classes.Kategorie;
import main.notizverwaltung.model.classes.Notiz;

import java.util.List;

/**
 *
 * Die Klasse stellt Funktionalitäten für Notizen bereit
 *
 *
 * @author
 * @version 1.0
 * @since
 */
public interface NotizService {

    public Notiz getNotiz(int NotizID);
    public void newNotiz(Notiz notiz, int notizblockID);
    public void removeNotiz(int NotizID);
    public void updateNotiz(Notiz notiz);

    //TODO Brauchen wir eine Methode zum Verändern der Spalte?


    public List<Notiz> getAlleNotizenvonEinerKategorie(Kategorie kategorie);
    public List<Notiz> getAlleNotizenImNotizblock (int notizblockID);

 }