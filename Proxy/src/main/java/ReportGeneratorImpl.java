
public class ReportGeneratorImpl implements ReportGenerator {
    public ReportGeneratorImpl()
    {
        System.out.println("ReportGeneratorImpl instance created");
    }

    public void displayReportTemplate(String reportFormat,int reportEntries) {
    }

    public void  generateComplexReport(String reportFormat, int reportEntries){
        System.out.println("ReportGeneratorImpl: Generating complex report in "+reportFormat+" format with "+ reportEntries+" entries");
    }

    public void  generateSensitiveReport(){
        System.out.println("ReportGeneratorImpl: Generating report");
    }
}
