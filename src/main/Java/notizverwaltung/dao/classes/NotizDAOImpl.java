package notizverwaltung.dao.classes;

import notizverwaltung.dao.interfaces.NotizDAO;
import notizverwaltung.model.classes.NotizImpl;
import notizverwaltung.model.interfaces.Notiz;

import java.util.List;


/**
 * @author Shenna RWP
 */
public class NotizDAOImpl extends ObjectDAOImpl implements NotizDAO
{
    public NotizDAOImpl() {
        super();
    }

    @Override
    public int addNotiz(Notiz notiz, int notizblockID) {
        initTransaction();
        transaction.begin();

        entityManager.persist(notiz);
        transaction.commit();
        int notizID = notiz.getNotizID();

        finishTransaction();
        return notizID;
    }

    @Override
    public Notiz getNotiz(int notizID) {
        initTransaction();
        transaction.begin();

        Notiz notiz = entityManager.find(Notiz.class, notizID);
        if(notiz == null) {
            finishTransaction();
            throw new IllegalArgumentException("Notiz existiert nicht!");
        }

        finishTransaction();
        return notiz;
    }

    @Override
    public List<Notiz> getAlleNotizen() {
        initTransaction();
        transaction.begin();

        List<Notiz> listNotiz = entityManager.createQuery("SELECT n FROM NotizImpl n").getResultList();
        transaction.commit();

        finishTransaction();
        return listNotiz;
    }

    @Override
    public void updateNotiz(NotizImpl notiz) {

    }

    @Override
    public void deleteNotiz(int notizID) {
        initTransaction();
        transaction.begin();

        Notiz notiz = entityManager.find(Notiz.class, notizID);
        if(notiz == null) {
            finishTransaction();
            throw new IllegalArgumentException("Notiz existiert nicht!");
        }
        entityManager.remove(notiz);
        transaction.commit();

        finishTransaction();
    }


}