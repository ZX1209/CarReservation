package models;


import play.db.jpa.JPASupport;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "test_ordertable")
public class OrderTable extends JPASupport {
    @Id
    @Column(name="UserID")
    public Long userID;
    @Column(name="VistorID")
    public Long vistorID;

    @Column(name="UserName")
    public String username;
    @Column(name="VistorName")
    public String vistorName;

    @Column(name="OrderDate")
    public Date orderDate;

    @Column(name="InTime")
    public Date inTime;

    @Column(name="OutTime")
    public Date outTime;
    
    public OrderTable(Long userID,String username,String vistorName) {
        this.userID = userID;
       // this.vistorID = vistorID;
        this.username = username;
        this.vistorName = vistorName;
        this.orderDate = new java.util.Date();
        //this.inTime = NULL;
        //this.outTime = NULL;	
    }


}