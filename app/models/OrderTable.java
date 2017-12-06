package models;


import play.db.jpa.JPASupport;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ordertable")
public class OrderTable extends JPASupport {
    @Id
    @Column(name="UserID")
    private Long userID;
    @Column(name="VistorID")
    private Long vistorID;

    @Column(name="UserName")
    private String username;
    @Column(name="VistorName")
    private String vistorName;

    @Column(name="OrderDate")
    private String orderDate;

    @Column(name="InTime")
    private String inTime;

    @Column(name="OutTime")
    private String outTime;


}