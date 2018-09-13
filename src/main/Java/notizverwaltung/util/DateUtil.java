package notizverwaltung.util;


import notizverwaltung.validators.ObjectValidator;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import static notizverwaltung.validators.ObjectValidator.checkObObjectNullIst;

/**
 * Stellt statische Methoden zum bearbeiten von "Date"-Objekten bzw. "LocalDate"-Objekten zur Verfügung
 *
 */
public class DateUtil {

    /**
     * Konvertiert localDate-Objekt zu einem Date-Objekt
     *
     * @param localDate
     * @author "JB Nizet", Michelle Blau
     * @return
     */
    public static Date convertLocalDate(LocalDate localDate){
        ObjectValidator.checkObObjectNullIst(localDate);
        Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        return date;
    }

    public static LocalDate convertLocalDateInDate (Date date){
        return null;
    }
}
