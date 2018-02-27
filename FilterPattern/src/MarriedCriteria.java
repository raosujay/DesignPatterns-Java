import java.util.ArrayList;
import java.util.List;

public class MarriedCriteria implements Criteria {
    @Override
    public List<Person> filter(List<Person> persons) {
        List<Person> personList = new ArrayList<Person>();
        for(Person p:persons){
            if (p.getStatus().equalsIgnoreCase("married")){
                personList.add(p);
            }
        }
        return personList;
    }
}
