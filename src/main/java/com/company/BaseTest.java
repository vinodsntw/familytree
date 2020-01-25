package com.company;

import org.junit.BeforeClass;

import static com.company.ShanFamilyTreeBuilder.KING_SHAN;
import static com.company.ShanFamilyTreeBuilder.QUEEN_ANGA;

public class BaseTest {

    @BeforeClass
    public static void setUp() throws Exception {
        if (KING_SHAN.isMarriedTo(QUEEN_ANGA.getName())) return;
        ShanFamilyTreeBuilder.build();
    }
}
