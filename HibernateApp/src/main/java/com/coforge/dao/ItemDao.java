package com.coforge.dao;
 
import java.util.List;
 
import org.hibernate.Session;
import org.hibernate.Transaction;
 
import com.coforge.entities.Item;
import com.coforge.util.HibernateUtil;
 
public class ItemDao implements ItemDaoInterface {
 
    @Override
    public List<Item> getAllItems() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Item", Item.class).list();
        }
    }
 
    @Override
    public void insertItem(Item item) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            session.persist(item);
            tx.commit();
            System.out.println("Item inserted");
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }
 
    @Override
    public void updateItem(Item item) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            session.update(item);
            tx.commit();
            System.out.println("Item updated");
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }
 
    @Override
    public void deleteItem(long id) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            Item item = session.get(Item.class, id);
            if (item != null) {
                session.delete(item);
                System.out.println("Item deleted");
            }
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }
 
    @Override
    public Item getById(long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Item.class, id);
        }
    }
}
 