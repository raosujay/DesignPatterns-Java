import java.util.ArrayList;
import java.util.List;

public class SingleCriteria implements Criteria {
    @Override
    public List<Person> filter(List<Person> persons) {
        List<Person> personList = new ArrayList<Person>();
        for(Person p:persons){
            if (p.getStatus().equalsIgnoreCase("single")){
                personList.add(p);
            }
        }
        return personList;
    }
}
