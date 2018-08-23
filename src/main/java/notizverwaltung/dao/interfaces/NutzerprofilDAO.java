package notizverwaltung.dao.interfaces;

import model.classes.Nutzerprofil;

public interface NutzerprofilDAO {
    public void addNutzerprofil(Nutzerprofil nutzerprofil);
    public void deleteNutzerprofil(Nutzerprofil nutzerprofil);
    public void updateNutzerprofil(Nutzerprofil nutzerprofil);

    public Nutzerprofil getNutzerprofil(int NutzerprofilID);
}