
public class HighSchool implements School {

    private Integer id;
    private String name;

    public HighSchool(int i, String high_school) {
    }

    public void printSchoolName() {
        System.out.println(getClass().getSimpleName());
    }

    // standard constructor, getters, setters
}
