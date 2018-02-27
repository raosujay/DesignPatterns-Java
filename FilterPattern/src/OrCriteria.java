import java.util.ArrayList;
import java.util.List;

public class OrCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    public OrCriteria() {
    }

    @Override
    public List<Person> filter(List<Person> persons) {

        List<Person> ps0 = criteria.filter(persons);
        List<Person> ps1 = otherCriteria.filter(persons);
        for (Person p:ps1){
            if (!ps0.contains(p)){
                ps0.add(p);
            }
        }
        return ps0;
    }
}
