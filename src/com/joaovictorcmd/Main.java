package com.joaovictorcmd;

import com.joaovictorcmd.annotations.Table;
import com.joaovictorcmd.models.User;

public class Main {
    public static void main(String[] args) {

        User user01 = new User("Mariah", 46);
        User user02 = new User("Alex", 32);

        if (user01.getClass().isAnnotationPresent(Table.class)) {
            Table table = user01.getClass().getAnnotation(Table.class);
            System.out.println("Tabela onde " + user01.getName().toUpperCase() + " está: " + table.name());
        }

        if (user02.getClass().isAnnotationPresent(Table.class)) {
            Table table = user02.getClass().getAnnotation(Table.class);
            System.out.println("Tabela onde " + user02.getName().toUpperCase() + " está: " + table.name());
        }

    }
}