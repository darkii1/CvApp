package cvClass;

import java.util.ArrayList;

public class cv {
    personalInfo pI;
    ArrayList<education> eD;
    ArrayList<experience> eX;
    ArrayList<interests> iN;
    ArrayList<language> lA;
    ArrayList<skill> sK;
    summary sU;

/*    public cv(personalInfo pI, experience eX, /*education eD,  interests iN, language lA, skill sK, summary sU) {
        this.pI = pI;
        this.eX = eX;
     /*   this.eD = eD;

        this.iN = iN;
        this.lA = lA;
        this.sK = sK;
        this.sU = sU;
        this.getCV();
    }
*/
    public cv(personalInfo pI, ArrayList<experience> eX,/*ArrayList<education> eD,  ArrayList<interests> iN, ArrayList<language> lA, ArrayList<skill> sK, */summary sU) {
        this.pI = pI;
        this.eX = eX;
       /* this.eD = eD;

        this.iN = iN;
        this.lA = lA;
        this.sK = sK;*/
        this.sU = sU;
        getCV();
    }

    public void getCV()
    {
        pI.getPersonalInfo();
        sU.getSummaryField();
        for (int i = 0; i < eX.size(); i++) {
            eX.get(i).getExp();
        }
        //System.out.print (pI.getPersonalInfo() + sU.getSummaryField() + eX.getAllExp()+"\nMy kek");
    }


}
