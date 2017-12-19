package models;



import play.db.jpa.JPASupport;
import play.db.jpa.GenericModel;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("deprecation")
@Entity
//@Table(name = "table_news")
public class News extends GenericModel {
    @Id
    @Column(name="C_ID")
    public Long cId;
    @Column(name="C_TITLE")
    public String cTitle;

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