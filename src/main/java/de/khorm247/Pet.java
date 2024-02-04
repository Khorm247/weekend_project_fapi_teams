package de.khorm247;

import java.util.ArrayList;
import java.util.List;

public class Pet {
    private String name;
    private List<BonusStat> bonusStatList = new ArrayList<BonusStat>();
    private boolean isFlying;
    private boolean isAvailabe;     // did you find this pet, already?

    public Pet(String name, boolean isFlying, boolean isAvailabe) {
        this.name = name;
        this.isFlying = isFlying;
        this.isAvailabe = isAvailabe;
        //System.out.printf("created %s with 0 Bonuses\n", name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BonusStat> getBonusStatList() {
        return bonusStatList;
    }

    public void printBonusStatList() {
        bonusStatList.forEach(System.out::println);
    }

    public void setBonusStatList(List<BonusStat> bonusStatList) {
        this.bonusStatList = bonusStatList;
    }

    public void addBonus(BonusStat bonusStat){
        bonusStatList.add(bonusStat);
    }
    public void removeBonusByName(String bonusStatName){
        for(BonusStat bonus : bonusStatList) {
            if(bonus.getStatName().equals(bonusStatName)){
                bonusStatList.remove(bonus);
                return;
            }
        }
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }

    public boolean isAvailabe() {
        return isAvailabe;
    }

    public void setAvailabe(boolean availabe) {
        isAvailabe = availabe;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}' +
                bonusStatList.toString();
    }
}
