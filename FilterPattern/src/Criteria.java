import java.util.List;

public interface Criteria {

    List<Person> filter(List<Person> persons);
}
