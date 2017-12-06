package models;


import play.db.jpa.JPASupport;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userinfo")
public class UserInfo extends JPASupport {
    @Id
    @Column(name="UserID")
    private Long userID;
    @Column(name="UserName")
    private String userName;

    @Column(name="Department")
    private String departMent;

    @Column(name="Phone")
    private Long phone;



}