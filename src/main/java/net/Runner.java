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
    }
}