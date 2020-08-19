package com.springjpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name="customer")
public class Costemer implements Serializable
{
    private static final long serialVrsionUID = -3009157732242241606L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="firstname")
    private String firstname;

    @Column(name="lastname")
    private String lastname;

    protected Costemer()
    { } // constructor used by spring jpa

    public Costemer (String firstname, String lastname)
    {
        this.firstname = firstname; // for making costumer instance
        this.lastname =lastname;
    }

    @Override
    public String toString()
    {
        return String.format("Customer[id-%d, firstname='%s', lastname='%s']", id ,firstname ,lastname);
    }
}

