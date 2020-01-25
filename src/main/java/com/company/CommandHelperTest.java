package com.company;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CommandHelperTest {



    @BeforeClass
    public static void setupFamily() throws Exception {

        ShanFamilyTreeBuilder.build();
    }
    @Test
    public void testGetRelationsCommandForMaternalUncle(){
        CommandHelper ch = new CommandHelper();
        List<Person> relatives = ch.GetRelationShip("Lavnya" , RelationShips.MaternalUncle);
        List<Person> expectedRelatives = ShanFamilyTreeBuilder.LAVNYA.getMaternalUncles();
        assertEquals(expectedRelatives,relatives );
    }
    @Test
    public void testGetRelationsCommandForMaternalAunt(){
        CommandHelper ch = new CommandHelper();
        List<Person> relatives = ch.GetRelationShip("Lavnya" , RelationShips.MaternalAunt);
        List<Person> expectedRelatives = ShanFamilyTreeBuilder.LAVNYA.getMaternalAunts();
        assertEquals(expectedRelatives,relatives );
    }
}
