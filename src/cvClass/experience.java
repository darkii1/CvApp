package cvClass;
import java.util.*;
public class experience {
    String companyName;
    String position;
    String department;
    Date beginWork;
    Date endWork;
    String workDescription;

    public experience(String companyName, String position, String department, Date beginWork, Date endWork, String workDescription) {
        this.companyName = companyName;
        this.position = position;
        this.department = department;
        this.beginWork = beginWork;
        this.endWork = endWork;
        this.workDescription = workDescription;
    }

    public void getExp()
    {
        System.out.print("\nCompany where i Worked "+companyName+"\nPosition "+position+"\nDepartment "+department+"\nWorked since: "+beginWork+" Till: "+endWork+"\nDescription "+workDescription);
    }
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
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

    public String getWorkDescription() {
        return workDescription;
    }

    public void setWorkDescription(String workDescription) {
        this.workDescription = workDescription;
    }
}
