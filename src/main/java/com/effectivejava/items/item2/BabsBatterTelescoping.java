package com.effectivejava.items.item2;

import java.util.LinkedList;
import java.util.List;

public class BabsBatterTelescoping implements Player {
    final int pid;
    final String firstName;
    final String lastName;
    final String teamName;
    final String position;

    BabsBatterTelescoping(int pid) {
        this(pid, null, null);
    }

    BabsBatterTelescoping(int pid, String firstName, String lastName) {

        this(pid, firstName, lastName, null );
    }

    BabsBatterTelescoping(int pid, String firstName, String lastName,
                          String teamName) {
        this(pid, firstName, lastName, teamName, null );
    }


    BabsBatterTelescoping(int pid, String firstName, String lastName,
                          String teamName, String position) {
        this.pid = pid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.teamName = teamName;
        this.position = position;
    }

    @Override
    public String toString() {
        List<String> strings = new LinkedList<>();
        strings.add(String.valueOf(pid)); strings.add(firstName);
        strings.add(lastName); strings.add(teamName);
        strings.add(position);
        return String.join(":", strings);
    }
}
