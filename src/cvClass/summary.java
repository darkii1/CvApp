package cvClass;

public class summary {
    String summaryField;

    public summary(String summaryField) {
        this.summaryField = summaryField;
    }

    public void getSummaryField() {
        System.out.print( "\nSummary: " + summaryField);
    }

    public void setSummaryField(String summaryField) {
        this.summaryField = summaryField;
    }
}
