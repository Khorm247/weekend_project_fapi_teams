package de.khorm247;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FullPetCollection {

    private List<Pet> fullPetList;

    // Constructor
    public FullPetCollection() {
        this.fullPetList = new ArrayList<>();
        setupFullPetList();
    }

    public List<Pet> getFullPetList() {
        return fullPetList;
    }

    public void setFullPetList(List<Pet> fullPetList) {
        this.fullPetList = fullPetList;
    }

    private void setupFullPetList(){
        List<String> petListAsStringArray = Arrays.stream(getAllPetsData()).toList();
        List<String[]> petListByValue = new ArrayList<>();
        for(String s : petListAsStringArray){
            petListByValue.add(s.split("	"));
        }
        for(String[] str_a : petListByValue){
            // extract PET INFO
            String petName = str_a[0];
            boolean isFlying = str_a[1].equals("Air");
            boolean isAvailable = str_a[2].equals("WAHR");

            // create new Pet and add the bonuses
            Pet petToAdd = new Pet(petName, isFlying, isAvailable);
            int start_index = 3;

            // only add the Bonuses to the List
            for(int i = start_index; i < str_a.length; i++){
                String bonusStatName = str_a[i];
                BonusStats statName = BonusStats.fromString(bonusStatName);
                if(statName == null){
                    System.out.println(bonusStatName);
                    System.out.println("Stat not found: " + bonusStatName);
                    continue;
                }
                //System.out.println(statName);
                petToAdd.addBonus(new BonusStat(statName, 1,0));
            }

            // finally add it to the Pet List
            fullPetList.add(petToAdd);
        }
    }

    public static String[] getAllPetsData(){
        
        String[] s = {"Cocorico	Ground	WAHR	Potatoes Earned",
                "Rico	Air	WAHR	Class Exp",
                "Trevor	Ground	WAHR	Skulls Earned",
                "Bingo	Air	WAHR	Confection Exp",
                "Vidar	Ground	WAHR	Poop Created	Potatoes Earned",
                "Primfeet	Ground	WAHR	Reincarnation Exp",
                "Hiko	Air	WAHR	Milk Created	Skulls Earned",
                "Murphy	Ground	WAHR	Whack Score Bonus	Confection Exp",
                "Aphrodite	Air	WAHR	Residue Created	Poop Created",
                "Nidhogg	Air	WAHR	Item Rating Bonus",
                "Nuts	Ground	WAHR	Calcium Exp	Item Rating Bonus",
                "Cid	Air	WAHR	Worm Quantity	Whack Score Bonus",
                "Flash	Ground	WAHR	Brewing Exp	Class Exp",
                "Tango	Ground	WAHR	Larva Quantity	Reincarnation Exp",
                "Darti	Air	WAHR	Larva Efficiency	Brewing Exp",
                "Alvin	Air	WAHR	Poop Created	Milk Created",
                "Johny Be Good	Ground	WAHR	Larva Quantity	Larva Efficiency",
                "Arizona	Ground	WAHR	Residue Created	Calcium Exp",
                "Suijin	Air	WAHR	Fermenting Exp	Worm Quantity",
                "Nucifera	Air	WAHR	Potatoes Earned	Class Exp	Skulls Earned",
                "Barney	Ground	WAHR	Poop Created	Whack Score Bonus	Larva Quantity",
                "Seth	Air	WAHR	Class Exp	Confection Exp	Fermenting Exp",
                "Plyne	Ground	WAHR	Skulls Earned	Residue Created	Calcium Exp",
                "Zac	Air	WAHR	Potatoes Earned	Milk Created	Worm Quantity",
                "Tock	Ground	WAHR	Class Exp	Item Rating Bonus	Fermenting Exp",
                "The Governess	Air	WAHR	Poop Created	Brewing Exp	Larva Quantity",
                "Swamp King	Ground	WAHR	Skulls Earned	Reincarnation Exp	Residue Created	Larva Efficiency",
                "Itzamna	Air	WAHR	Potatoes Earned	Confection Exp	Whack Score Bonus	Worm Quantity",
                "Julian	Ground	WAHR	Reincarnation Exp	Item Rating Bonus	Residue Created	Fermenting Exp",
                "Yuhuang	Air	WAHR	Class Exp	Skulls Earned	Milk Created	Brewing Exp",
                "Wako	Ground	WAHR	Fermenting Exp	Calcium Exp	Larva Efficiency	Poop Created",
                "Papyru	Air	WAHR	Whack Score Bonus	Larva Quantity	Residue Created	Card Exp",
                "Sigma	Ground	WAHR	Class Exp	Larva Efficiency	Calcium Exp	Worm Quantity",
                "Louna	Air	WAHR	Poop Created	Confection Exp	Reincarnation Exp	Card Power",
                "Babou	Ground	WAHR	Potatoes Earned	Milk Created	Fermenting Exp	Residue Created",
                "Niord	Air	WAHR	Item Rating Bonus	Skulls Earned	Card Exp	Card Power",
                "Mous	Ground	FALSCH	Potatoes Earned	Class Exp	Milk Created	Calcium Exp",
                "Flafy	Air	FALSCH	Skulls Earned	Calcium Exp	Fermenting Exp	Residue Created",
                "Nick	Ground	FALSCH	Potatoes Earned	Worm Quantity	Brewing Exp	Fermenting Exp	Card Power",
                "Cherry	Air	FALSCH	Class Exp	Skulls Earned	Larva Quantity	Item Rating Bonus	Reincarnation Exp",
                "Serket	Ground	WAHR	Whack Score Bonus	Larva Quantity",
                "Fujin	Air	WAHR	Reincarnation Exp	Potatoes Earned",
                "Ulrich	Ground	WAHR	Confection Exp	Calcium Exp",
                "Huginn	Air	WAHR	Worm Quantity	Skulls Earned",
                "Esus	Ground	WAHR	Poop Created	Milk Created",
                "Hera	Air	WAHR	Brewing Exp	Larva Efficiency",
                "Asterios	Ground	WAHR	Class Exp	Larva Quantity",
                "Odile	Air	WAHR	Fermenting Exp	Milk Created",
                "Anubis	Ground	WAHR	Item Rating Bonus	Brewing Exp	Confection Exp",
                "Garuda	Air	WAHR	Residue Created	Worm Quantity	Whack Score Bonus",
                "Tsukuyomi	Air	WAHR	Poop Created	Calcium Exp	Potatoes Earned",
                "Nanbozo	Ground	WAHR	Skulls Earned	Larva Quantity	Brewing Exp",
                "Ra	Air	WAHR	Fermenting Exp	Worm Quantity	Class Exp",
                "Vishnou	Ground	WAHR	Reincarnation Exp	Item Rating Bonus	Larva Efficiency",
                "Icare	Air	WAHR	Milk Created	Confection Exp	Whack Score Bonus",
                "Olaf	Ground	WAHR	Item Rating Bonus	Residue Created	Fermenting Exp",
                "Fafnir	Air	WAHR	Potatoes Earned	Larva Quantity	Calcium Exp",
                "Quetzalcoalt	Ground	WAHR	Reincarnation Exp	Residue Created	Larva Efficiency",
                "Professor Inderwind	Air	WAHR	Calcium Exp	Brewing Exp	Worm Quantity",
                "Dangun	Ground	WAHR	Reincarnation Exp	Item Rating Bonus	Milk Created",
                "Abby	Air	WAHR	Potatoes Earned	Skulls Earned	Confection Exp	Fermenting Exp",
                "Noop	Ground	FALSCH	Confection Exp	Whack Score Bonus	Brewing Exp	Reincarnation Exp",
                "Juba	Ground	WAHR	Class Exp	Poop Created	Milk Created	Brewing Exp",
                "David	Air	WAHR	Calcium Exp	Reincarnation Exp	Residue Created	Card Exp",
                "Viktor	Air	WAHR	Skulls Earned	Worm Quantity	Milk Created	Item Rating Bonus",
                "Darko	Ground	FALSCH	Fermenting Exp	Item Rating Bonus	Residue Created	Card Power",
                "Ubel	Ground	FALSCH	Potatoes Earned	Poop Created	Worm Quantity	Larva Efficiency",
                "Than	Air	FALSCH	Skulls Earned	Whack Score Bonus	Larva Quantity	Card Exp",
                "Hirma	Air	FALSCH	Confection Exp	Poop Created	Larva Efficiency	Milk Created	Brewing Exp",
                "Boletus	Ground	FALSCH	Item Rating Bonus	Residue Created	Fermenting Exp	Card Exp	Card Power"};
        return s;
    }
}
