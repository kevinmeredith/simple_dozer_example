package net;

import org.dozer.DozerBeanMapper.*;
import org.dozer.*;
import net.*;

public class Runner {
    public static void main(String[] args) {
        Mapper mapper = new DozerBeanMapper();
        Person p = new Person("foo", 55);
        Target t = mapper.map(p, Target.class);
        System.out.println("t: " + t.toString());

        TargetWithExtraField t2 = mapper.map(p, TargetWithExtraField.class);
        System.out.println("t2: " + t2.toString());

        // TargetWithPerson t3 = mapper.map(p, TargetWithPerson.class);
        // System.out.println("t3: " + t3.toString());

        PersonWithDetails pwd = new PersonWithDetails();
        pwd.setName("bar");
        pwd.setAge(11);
        pwd.setIsHungry(true);

        Person mappedPerson = mapper.map(pwd, Person.class);
        System.out.println("mappedPerson: " + mappedPerson.toString());

    }
}