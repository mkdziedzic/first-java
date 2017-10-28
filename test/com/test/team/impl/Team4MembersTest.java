package com.test.team.impl;

import com.test.team.Team;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Team4MembersTest {

    @Test
    public void testGetName() {
        Team testTeam = new Team4Members("XYZ");
        assertEquals("XYZ",testTeam.getName());
    }
}
