import java.util.*;

public class Kindergarten implements School {

    private Integer id;
    private String name;

    private List<School> childSchool;
    private Object School;

    public Kindergarten(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.childSchool = new ArrayList<>();
    }


    public void addSchool(School school) {
        childSchool.add(school);
    }

    public void removeSchool(School school){
        childSchool.remove(school);
    }

    public void printSchoolName() {

    }
}