package de.khorm247;
/*
Farmer against Potatoes Idle Team creator project:

There are a lot of (ground/flying) pets in this game.
Each pet has between 2 and 6 bonus stats and there are
about 20+ different Stats.
You can build different Teams which are always composed of
3 ground and 3 flying pets.

The goal of this project is to be able to find the teams, which
offer you the highest Bonus in a single Stat or to build a team,
which offers the most Bonuses.

Summary:

    Constraints:
    - Teams are always 3 ground and 3 flying pets
    - any pet can only be used once

    Goal:
    - find the team with the most amount of bonuses
    - if there is more than one team, stack the bonuses
    (prioritized by Stat weight)
    (- in the future, allow to select for a specific stat to be stacked
       for example: 6 pets with a Bonus for better loot)
 */
public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet("Fluffy", false, true);
        pet.addBonus(new BonusStat(BonusStats.STATS_GRASSHOPPER_DAMAGE, 1, 0));
        pet.addBonus(new BonusStat(BonusStats.STATS_ITEM_RATING_BONUS, 1, 0));
        pet.addBonus(new BonusStat(BonusStats.STATS_RESIDUE_BONUS, 1, 0));
        pet.addBonus(new BonusStat(BonusStats.STATS_CARD_EXP, 1, 0));
        pet.printBonusStatList();
        }
    }
