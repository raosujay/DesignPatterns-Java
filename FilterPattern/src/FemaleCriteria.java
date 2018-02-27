import java.util.ArrayList;
import java.util.List;

public class FemaleCriteria implements Criteria {
    @Override
    public List<Person> filter(List<Person> persons) {
        List<Person> personList = new ArrayList<Person>();
        for(Person p:persons){
            if (p.getGender().equalsIgnoreCase("Female")){
                personList.add(p);
            }
        }
        return personList;
    }
}
