
public class PrimarySchool implements School {

    private Integer id;
    private String name;

    public PrimarySchool(int i, String primary_school) {
    }

    public void printSchoolName() {
        System.out.println(getClass().getSimpleName());
    }

    // standard constructor, getters, setters
}
