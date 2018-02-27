import java.util.List;

public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria,Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    public AndCriteria() {
    }

    @Override
    public List<Person> filter(List<Person> persons) {
        List<Person> ps = criteria.filter(persons);
        return otherCriteria.filter(ps);
    }
}
