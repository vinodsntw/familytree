package com.company;

import java.util.ArrayList;
import java.util.List;

enum RelationShips{
    MaternalAunt,
    MaternalUncle
}

public class CommandHelper {
    public List<Person> GetRelationShip(String personName, RelationShips relationShip){
        Person p = null;
        p = ShanFamilyTreeBuilder.getFamilyMember(personName);

        if(p!=null){
            switch(relationShip) {
                case MaternalAunt: return p.getMaternalAunts();
                case MaternalUncle: return p.getMaternalUncles();
            }
        }
        return new ArrayList<>();
    }
}
