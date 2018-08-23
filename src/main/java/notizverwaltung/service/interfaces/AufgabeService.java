package service.interfaces;

import model.classes.Aufgabe;

import java.util.List;

public interface AufgabeService {

    public Aufgabe getAufgabe(int notizID, int aufgabeID);
    public void addAufgabe (int notizID, Aufgabe aufgabe);
    public void updateAufgabe(int notizID, Aufgabe aufgabe);

    //notizID und aufgabeID sollte der Primärschlussel der DB sein
    public void removeAufgabe (int notizID, int aufgabeID);

    public List<Aufgabe> getAlleAufgabenEinerNotize (int notizID);
}
