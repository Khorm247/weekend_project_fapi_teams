package de.khorm247;

import java.util.ArrayList;
import java.util.List;

public class Pet {
    private String name;
    private List<BonusStat> bonusStatList = new ArrayList<BonusStat>();
    private boolean isFlying;
    private boolean isAvailabe;     // did you find this pet, already?

    public Pet(String name, List<BonusStat> bonusStatList, boolean isFlying, boolean isAvailabe) {
        this.name = name;
        this.bonusStatList = bonusStatList;
        this.isFlying = isFlying;
        this.isAvailabe = isAvailabe;
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

    public void setBonusStatList(List<BonusStat> bonusStatList) {
        this.bonusStatList = bonusStatList;
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
}
