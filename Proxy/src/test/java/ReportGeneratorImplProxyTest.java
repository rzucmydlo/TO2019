import static org.junit.jupiter.api.Assertions.*;

import org.testng.annotations.Test;

public class ReportGeneratorImplProxyTest {
    public void testGenerateReport() throws Exception {
        Role accessRole=new Role();
        accessRole.setRole("Manager");
        ReportGenerator proxy=new ReportGeneratorImplProxy(accessRole);
        proxy.displayReportTemplate("Pdf",150);
        proxy.generateComplexReport("Pdf",150);
        proxy.generateSensitiveReport();
    }
}
