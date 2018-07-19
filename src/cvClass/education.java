package cvClass;
import java.util.*;
public class education {
    String univercityName;
    String degree;
    Date beginWork;
    Date endWork;


    public education(String univercityName, String degree, Date beginWork, Date endWork) {
        this.univercityName = univercityName;
        this.degree = degree;
        this.beginWork = beginWork;
        this.endWork = endWork;
    }

    public String getUnivercityName() {
        return univercityName;
    }

    public void setUnivercityName(String univercityName) {
        this.univercityName = univercityName;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public Date getBeginWork() {
        return beginWork;
    }

    public void setBeginWork(Date beginWork) {
        this.beginWork = beginWork;
    }

    public Date getEndWork() {
        return endWork;
    }

    public void setEndWork(Date endWork) {
        this.endWork = endWork;
    }
}
