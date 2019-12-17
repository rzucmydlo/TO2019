import static org.junit.jupiter.api.Assertions.*;

public class CompositeTest {
    public static void main(String args[]) {
        School primarySchool= new PrimarySchool(
                1, "Primary school");
        School highSchool = new HighSchool(
                2, "High school");

        Kindergarten kindergarten = new Kindergarten(
                3, "Kindergarten");

        kindergarten.addSchool(primarySchool);
        kindergarten.addSchool(highSchool);

        kindergarten.printSchoolName();
    }
}
