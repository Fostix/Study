package Lessons.OOP.Lesson01.Ex004;

import Lesson01.Ex004.*;
import Lesson01.Ex004.alliance.*;

public class Program {
    public static void main(String[] args) {

        // #region teams
        // Когда героев становится больше

//         int teamCount = 10;
//         Random rand = new Random();
//
//         List<BaseHero> teams = new ArrayList<>();
//         for (int i = 0; i < teamCount; i++) {
//             int val = rand.nextInt(3);
//             switch (val) {
//                 case 0:
//                     teams.add(new Priest());
//                     break;
//                 case 1:
//                     teams.add(new Magician());
//                     break;
//                 case 2:
//                     teams.add(new Druid());
//                     break;
//                 default:
//                     // teams.add(new BaseHero());
//                     break;
//             }
//             System.out.println(teams.get(i).getInfo());
//         }
//
//         System.out.println();

        // #endregion

        // #region ToDo BaseHero

         // BaseHero hero = new BaseHero();
         // System.out.println(hero.getInfo());
         // ToDo BaseHero
         Priest priest = new Priest();
         System.out.println(priest.getInfo());
         Druid druid = new Druid();
         BaseHero druid1 = new Druid();
         System.out.println(druid.getInfo());
         Magician magician = new Magician();
         System.out.println(magician.getInfo());

         priest.attack(magician);
         System.out.println(magician.getInfo());
         priest.attack(magician);
         System.out.println(magician.getInfo());
         druid.healing(magician);
         System.out.println(magician.getInfo());
         ((Druid)(druid1)).healing(magician);
         System.out.println(magician.getInfo());
         druid.healing(magician);
         System.out.println(magician.getInfo());
         druid.healing(magician);
         System.out.println(magician.getInfo());
         druid.healing(magician);
         System.out.println(magician.getInfo());
         druid.healing(magician);
         System.out.println(magician.getInfo());

        // #endregion

        // #region
        BaseHero dh = new Druid();
        /*BaseHero*/
        BaseHero dwarf = new Dwarf();
        Dwarf dwarfOther = new Dwarf();
        dwarfOther.dwarf_method();
        ((Dwarf)dwarf).dwarf_method();
        System.out.println(dwarf.name);
        System.out.println(dwarfOther.name);
        // #endregion
    }
}