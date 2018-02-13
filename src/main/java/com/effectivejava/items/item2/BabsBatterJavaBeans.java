package com.effectivejava.items.item2;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class BabsBatterJavaBeans implements Player {

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    int pid;
    String firstName;
    String lastName;
    String teamName;
    String position;

    BabsBatterJavaBeans() { }

    public static Comparator<BabsBatterJavaBeans> byName =
            Comparator.comparing(BabsBatterJavaBeans::getLastName);

    @Override
    public String toString() {
        List<String> strings = new LinkedList<>();
        strings.add(String.valueOf(pid)); strings.add(firstName); strings.add(lastName); strings.add(teamName);
        strings.add(position);
        return String.join(":", strings);
    }
}
