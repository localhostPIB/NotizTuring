package main.notizverwaltung.dao.interfaces;

import main.notizverwaltung.model.classes.Kategorie;

import java.util.List;

public interface KategorieDAO {

    public void addKategorie(Kategorie kategorie);
    public Kategorie getKategorie(int kategorieID);
    public void deleteKategorie( int kategorieID);
    public void updateKategorie(Kategorie kategorie);

    public List<Kategorie> getAlleKategorien();



}