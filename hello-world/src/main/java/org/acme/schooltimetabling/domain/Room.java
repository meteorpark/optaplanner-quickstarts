package org.acme.schooltimetabling.domain;

import lombok.Getter;

@Getter
public class Room {

    private String name;

    public Room(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
