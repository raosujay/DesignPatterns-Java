import java.util.ArrayList;
import java.util.List;

public class FilterPatternDemo {
    public static void main(String[] args){
        Person p1 = new Person("name1","male","single");
        Person p2 = new Person("name2","female","single");
        Person p3 = new Person("name3","male","single");
        Person p4 = new Person("name4","male","married");
        Person p5 = new Person("name5","female","married");
        Person p6 = new Person("name6","male","married");

        List<Person> ps = new ArrayList<Person>();
        ps.add(p1);
        ps.add(p2);
        ps.add(p3);
        ps.add(p4);
        ps.add(p5);
        ps.add(p6);

        Criteria maleCriteria = new MaleCriteria();
        Criteria femaleCriteria = new FemaleCriteria();
        Criteria singleCriteria = new SingleCriteria();
        Criteria marriedCriteria = new MarriedCriteria();
        Criteria andCriteria = new AndCriteria(singleCriteria,maleCriteria);
        Criteria orCriteria = new OrCriteria(marriedCriteria,femaleCriteria);

        System.out.println("male person:");
        printPerson(maleCriteria.filter(ps));
        System.out.println();

        System.out.println("female person:");
        printPerson(femaleCriteria.filter(ps));
        System.out.println();

        System.out.println("single person:");
        printPerson(singleCriteria.filter(ps));
        System.out.println();

        System.out.println("married person:");
        printPerson(marriedCriteria.filter(ps));
        System.out.println();

        System.out.println("single and male person:");
        printPerson(andCriteria.filter(ps));
        System.out.println();

        System.out.println("married or female person:");
        printPerson(orCriteria.filter(ps));
        System.out.println();
    }

    private static void printPerson(List<Person> ps){
        for(Person p:ps){
            System.out.println(p.toString());
        }
    }

}
