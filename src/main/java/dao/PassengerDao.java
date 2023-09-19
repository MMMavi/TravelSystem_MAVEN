/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

 

import java.util.List;
import model.Passenger;

import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;



public class PassengerDao {
    public void savePassenger(Passenger passenger) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(passenger);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public List < Passenger > getPassenger() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Passenger", Passenger.class).list();
        }
    }
}