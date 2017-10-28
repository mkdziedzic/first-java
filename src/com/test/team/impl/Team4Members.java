package com.test.team.impl;

import com.test.character.Man;
import com.test.team.Team;

import java.util.List;

public class Team4Members implements Team{

    private final String name;

    public Team4Members(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addMember(Man man) {

    }

    @Override
    public void removeMember(Man man) {

    }

    @Override
    public int memberCount() {
        return 0;
    }

    @Override
    public List<Man> getMembers() {
        return null;
    }
}
