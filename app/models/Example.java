package models;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;


import play.db.jpa.GenericModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

//[Example] 标注为jpa托管对象,,连接数据库操作
@Entity
public class Example extends  GenericModel{
    @Id
    public String userId;
    public String userName;



    public String carId;
    public String visitorId;
    public String visitorName;

    public Date orderTime;
    public Date carInTime;
    public Date carOutTime;


    public Example(String userid, String username, String carid, String visitorid, String visitorname, Date carintime, Date carouttime){
        this.userId=userid;
        this.userName=username;
        this.carId=carid;
        this.visitorId=visitorid;
        this.visitorName=visitorname;
        this.orderTime=new Date();//Date
        this.carInTime=carintime;
        this.carOutTime=carouttime;

    }

    //以后写下获取参数

}


