package org.example.sandbox.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {

        LandCraft grandCherokee = new GrandCherokee();
        LandCraft wrangler = new Wrangler();

        System.out.println(grandCherokee);
        System.out.println(wrangler);

        List<LandCraft> landcraft = new ArrayList<>();
        landcraft.add(grandCherokee);
        landcraft.add(wrangler);

        for (LandCraft lc : landcraft) {
            System.out.print(lc.getClass().getSimpleName());
        }

        landcraft.forEach(System.out::println);


        }
    }
