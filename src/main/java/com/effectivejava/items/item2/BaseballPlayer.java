package com.effectivejava.items.item2;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public abstract class BaseballPlayer implements Player {
    final int pid;
    final String firstName;
    final String lastName;
    final String teamName;
    final String position;

    abstract static class Builder<T extends Builder<T>> {
        private String firstName;
        private String lastName;
        private String teamName;
        private String position;
        private int pid;

        public Builder() {
        }

        public T teamName(String val) {
            teamName = Optional.ofNullable(val).orElseThrow(
                    IllegalArgumentException::new);
            return self();
        }

        public T firstName(String val) {
            firstName = val;
            return self();
        }

        public T lastName(String val) {
            lastName = val;
            return self();
        }

        public T position(String val) {
            position = val;
            return self();
        }

        public T pid(int val) {
            pid = val;
            return self();
        }

        abstract BaseballPlayer build();

        // Subclasses must imolement this method to return "this"
        protected abstract T self();
    }

    BaseballPlayer(Builder<?> builder) {
        teamName  =
                Optional.ofNullable(builder.teamName).orElse("FreeAgent");
        firstName =
                Optional.ofNullable(builder.firstName).orElseThrow(IllegalArgumentException::new);
        lastName =
                Optional.ofNullable(builder.lastName).orElseThrow(IllegalArgumentException::new);
        pid =
                Optional.ofNullable(builder.pid).orElseThrow(IllegalArgumentException::new);
        position =
                Optional.ofNullable(builder.position).orElseThrow(IllegalArgumentException::new);

        // Validate the baseball player has a team or FA
        Objects.requireNonNull(teamName);
    }

    @Override
    public String toString() {
        List<String> strings = new LinkedList<>();
        strings.add(String.valueOf(pid)); strings.add(firstName); strings.add(lastName); strings.add(teamName);
        return String.join(":", strings);
    }
}
