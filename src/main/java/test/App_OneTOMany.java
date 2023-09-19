/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import model.*;
import java.util.*;
import org.hibernate.Criteria;

import util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import util.HibernateUtil;

public class App_OneTOMany {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // test
        Configuration config = new Configuration();
        config.configure();
        // local SessionFactory bean created
        SessionFactory sessionFactory = config.buildSessionFactory();

        Session session = sessionFactory.openSession();
            session.beginTransaction();
        
        Passenger pass = new Passenger();
        pass.setFistName("Mavikana  ");
        pass.setLastName("Moutandou ");
        session.save(pass);
      
        String hql = "FROM Passenger";
        Query query = session.createQuery(hql);
        List<Passenger> results = query.list();
        for (Passenger p : results) {
            System.out.println(" passenger id  " + p.getId());
        }
        
        
        
        Criteria cr = session.createCriteria(Passenger.class);
        List<Passenger> results1 = cr.list();
         for (Passenger p : results1) {
            System.out.println(" Passenger id  from criteria " + p.getId());
        }
        
        session.close();
        sessionFactory.close();
        System.exit(0);
    }
    
    
}
