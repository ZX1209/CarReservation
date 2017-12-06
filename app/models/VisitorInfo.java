package models;


import play.db.jpa.JPASupport;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "visitorinfo")
public class VisitorInfo extends JPASupport {
    @Id
    @Column(name="VisitorID")
    private Long visitorID;
    @Column(name="VisitorName")
    private String visitorName;

    @Column(name="VisitorPhone")
    private Long visitorPhone;

    @Column(name="PlateNum")
    private String plateNum;

    @Column(name="UserID")
    private String userID;








}