package com.mkyong.examples;

public class MessageBuilder {

    public String getMessage(String name) {

        StringBuilder result = new StringBuilder();
        System.out.println("Prueba");

        if (name == null || name.trim().length() == 0) {

            result.append("Please provide a name!");

        } else {

            result.append("Hello " + name);

        }
        return result.toString();
    }

}
