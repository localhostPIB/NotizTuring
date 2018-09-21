package notizverwaltung.model.classes;

import notizverwaltung.exceptions.IntIstNegativException;
import notizverwaltung.exceptions.StringIsEmptyException;
import notizverwaltung.model.interfaces.BearbeitungszustandFX;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Testklasse fuer die Klasse BearbeitungszustandFXImpl
 *
 * @author Kevin Engelhardt
 *
 * @version 1.0
 */

import static org.junit.jupiter.api.Assertions.*;

class BearbeitungszustandFXImplTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void setBearbeitungsZustandID() {
        int testInt = -1;
        BearbeitungszustandFXImpl bearbeitungszustandFXImpl = new BearbeitungszustandFXImpl();
        assertThrows(IntIstNegativException.class, () -> {bearbeitungszustandFXImpl.setBearbeitungsZustandID(testInt); });
    }


    @Test
    void setName() {
        String leerstring = " ";
        BearbeitungszustandFXImpl bearbeitungszustandFXImpl = new BearbeitungszustandFXImpl();
        assertThrows(StringIsEmptyException.class, () -> {bearbeitungszustandFXImpl.setName(leerstring);});
    }

    @Test
    void setPosition() {
        int testInt = -1;
        BearbeitungszustandFXImpl bearbeitungszustandFXImpl = new BearbeitungszustandFXImpl();
        assertThrows(IntIstNegativException.class, () -> {bearbeitungszustandFXImpl.setPosition(testInt); });
    }

    /**
     * Testet, was bei Übergabe eines BearbeitungszustandFX mit gleicher ID passiert
     * Methode: equals()
     * ->Erwartet wird der Rückgabewert true
     */
    @Test
    void equalsZustaendeSindGleich(){
        BearbeitungszustandFX bearbeitungszustandFX1 = new BearbeitungszustandFXImpl();
        bearbeitungszustandFX1.setBearbeitungsZustandID(244);

        BearbeitungszustandFX bearbeitungszustandFX2 = new BearbeitungszustandFXImpl();
        bearbeitungszustandFX2.setBearbeitungsZustandID(244);

        boolean ergebnis = bearbeitungszustandFX1.equals(bearbeitungszustandFX2);

        assertEquals(true, ergebnis);
    }

    /**
     * Testet, was bei Übergabe eines BearbeitungszustandFX mit ungleicher ID passiert
     * Methode: equals()
     * ->Erwartet wird der Rückgabewert false
     */
    @Test
    void equalsZustaendeSindUngleich(){
        BearbeitungszustandFX bearbeitungszustandFX1 = new BearbeitungszustandFXImpl();
        bearbeitungszustandFX1.setBearbeitungsZustandID(244);

        BearbeitungszustandFX bearbeitungszustandFX2 = new BearbeitungszustandFXImpl();
        bearbeitungszustandFX2.setBearbeitungsZustandID(249);

        boolean ergebnis = bearbeitungszustandFX1.equals(bearbeitungszustandFX2);

        assertEquals(false, ergebnis);
    }
}