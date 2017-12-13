package models;


import play.db.jpa.JPASupport;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name = "test_ordertable")
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
    public String orderDate;

    @Column(name="InTime")
    public String inTime;

    @Column(name="OutTime")
    public String outTime;
    
    public OrderTable(Long userID, Long vistorID, String username,String vistorName,String orderDate,String inTime,String outTime) {
        this.userID = userID;
        this.vistorID = vistorID;
        this.username = username;
        this.vistorName = vistorName;
        this.orderDate = orderDate;
        this.inTime = inTime;
        this.outTime = outTime;	
    }


}