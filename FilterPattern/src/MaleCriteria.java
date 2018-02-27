import java.util.ArrayList;
import java.util.List;

public class MaleCriteria implements Criteria {
    @Override
    public List<Person> filter(List<Person> persons) {
        List<Person> personList = new ArrayList<Person>();
        for(Person p:persons){
            if (p.getGender().equalsIgnoreCase("male")){
                personList.add(p);
            }
        }
        return personList;
    }
}
