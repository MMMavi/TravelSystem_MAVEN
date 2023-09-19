/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author user
 */
@Entity
@Table(name = "BOOKING")
public class Booking {

    @Id
    @GeneratedValue
    @Column(name = "BOOKING_ID")
    private long id;
    private Date dateDepart;
    private String villeDepart;
    private String villeArrivee;
    private Passenger passenger;

    public Booking() {
    }

   public Booking(long id, Date dateDepart, String villeDepart, String villeArrivee, Passenger passenger) {
     this.id = id;
     this.dateDepart = dateDepart;
     this.villeDepart = villeDepart;
     this.villeArrivee = villeArrivee;
     this.passenger = passenger;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(Date dateDepart) {
        this.dateDepart = dateDepart;
    }

    public String getVilleDepart() {
        return villeDepart;
    }

    public void setVilleDepart(String villeDepart) {
        this.villeDepart = villeDepart;
    }

    public String getVilleArrivee() {
        return villeArrivee;
    }

    public void setVilleArrivee(String villeArrivee) {
        this.villeArrivee = villeArrivee;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
    
    
}