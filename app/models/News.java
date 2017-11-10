package models;


import play.db.jpa.JPASupport;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "table_news")
public class News extends JPASupport {
    @Id
    @Column(name="C_ID")
    private Long cId;
    @Column(name="C_TITLE")
    private String cTitle;

    public String getcTitle() {
        return cTitle;
    }
    public void setcTitle(String cTitle) {
        this.cTitle = cTitle;
    }
    public Long getId() {
        return cId;
    }
    public void setId(Long id) {
        cId = id;
    }
    public News(Long cId,String cTitle) {
        this.cId=cId;
        this.cTitle=cTitle;
    }
}