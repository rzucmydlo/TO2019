
public class ReportGeneratorImplProxy implements ReportGenerator{
    ReportGenerator reportGeneratorImpl;
    private Role accessRole;
    public ReportGeneratorImplProxy(Role accessRole){
        this.accessRole=accessRole;
    }

    public void displayReportTemplate(String reportFormat,int reportEntries) {
        System.out.println("ReportGeneratorImplProxy: Displaying blank report template in " + reportFormat + " format with " + reportEntries + " entries");
    }


    public void  generateComplexReport(String reportFormat,int reportEntries){
        if(reportGeneratorImpl==null)
            reportGeneratorImpl = new ReportGeneratorImpl();
        reportGeneratorImpl.generateComplexReport(reportFormat,reportEntries);
    }

    public void generateSensitiveReport(){
        if(accessRole.getRole().equals("Manager")){
            if(reportGeneratorImpl==null)
                reportGeneratorImpl = new ReportGeneratorImpl();
            reportGeneratorImpl.generateSensitiveReport();
        }
        else{
            System.out.println("You are not authorized to access this reports.");
        }
    }
}
