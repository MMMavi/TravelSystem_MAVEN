/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**


/**
 *
 * @author user
 */


@Entity
@Table(name = "PASSENGER")
public class Passenger implements Serializable  {

    @Id
    @GeneratedValue
    @Column(name = "PASSENGER_ID")
    private long id;

    private String FistName;
    private String LastName;

    @OneToMany
    private Set<Booking> booking;

    public Passenger() {
    }

    public Passenger(long id, String FistName, String LastName, Set<Booking> booking) {
        this.id = id;
        this.FistName = FistName;
        this.LastName = LastName;
        this.booking = booking;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFistName() {
        return FistName;
    }

    public void setFistName(String FistName) {
        this.FistName = FistName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public Set<Booking> getBooking() {
        return booking;
    }

    public void setBooking(Set<Booking> booking) {
        this.booking = booking;
    }
    
    

}