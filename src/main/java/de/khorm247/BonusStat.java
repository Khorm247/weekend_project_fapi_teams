package de.khorm247;

public class BonusStat {
    private String statName;
    private float statWeight = 1; // ToDo: fine tuning, for now all stats are equally weighted
    private float amount = 0; // ToDo: add starting value, for now this is ignored

    public BonusStat(String statName, float statWeight, float amount) {
        this.statName = statName;
        this.statWeight = statWeight;
        this.amount = amount;
    }

    public String getStatName() {
        return statName;
    }

    public void setStatName(String statName) {
        this.statName = statName;
    }

    public float getStatWeight() {
        return statWeight;
    }

    public void setStatWeight(float statWeight) {
        this.statWeight = statWeight;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return statName;
    }
}
