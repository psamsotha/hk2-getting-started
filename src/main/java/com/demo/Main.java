package com.demo;

import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.hk2.utilities.ServiceLocatorUtilities;

public class Main {

    public static void main(String... args) {
        ServiceLocator locator = ServiceLocatorUtilities.createAndPopulateServiceLocator();
        Teacher t = locator.getService(Teacher.class);
        System.out.println(t.getName());
    }
}
