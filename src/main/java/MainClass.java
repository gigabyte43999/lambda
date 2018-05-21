import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {

    public static void main(String[] arges){


        Optional<Person> optionalString = getPerson();

        ClassRoom classRoom = optionalString.flatMap(Person::getClassRoom).orElse(new ClassRoom("Chan"));

        Optional<String> s = optionalString.flatMap(Person::getClassRoom).map(ClassRoom::getName);

        s.ifPresent(System.out::println);

/*
        Person person = getPerson().get();

        if(person != null)
        {
            ClassRoom classRoom = person.getClassRoom().get();
            if(classRoom !=null){
                System.out.println(classRoom.getName());
            }
        }
*/
    }

    public static Optional<Person> getPerson(){

        Person person = new Person();

        person.setClassRoom(Optional.ofNullable(new ClassRoom("Chan2")));

        return Optional.ofNullable(person);
    }


}
