package de.khorm247;

public enum BonusStats {
    STATS_REINCARNATION_EXP("Reincarnation Exp"),
    STATS_WHACK_SCORE("Whack Score Bonus"),
    STATS_POTATOES_EARNED("Potatoes Earned"),
    STATS_SKULLS_EARNED("Skulls Earned"),
    STATS_CALCIUM_EARNED("Calcium Exp"),
    STATS_CLASS_EXP_EARNED("Class Exp"),
    STATS_CONFECTION_EXP_EARNED("Confection Exp"),
    STATS_FERMENTING_EXP_EARNED("Fermenting Exp"),
    STATS_BREWING_EXP_EARNED("Brewing Exp"),
    STATS_ITEM_RATING_BONUS("Item Rating Bonus"),
    STATS_RESIDUE_BONUS("Residue Created"),
    STATS_POOP_CREATED("Poop Created"),
    STATS_MILK_CREATED("Milk Created"),
    STATS_CARD_EXP("Card Exp"),
    STATS_MINING_EXP("Mining Exp"),
    STATS_CARD_POWER("Card Power"),
    STATS_MINING_POWER("Mining Power"),
    STATS_WORM_QUANTITY("Worm Quantity"),
    STATS_LARVA_QUANTITY("Larva Quantity"),
    STATS_LARVA_EFFICIENCY("Larva Efficiency"),
    STATS_HEALTHY_POTATO("Healthy Potato"),
    STATS_GRASSHOPPER_DAMAGE("Grasshopper Damage"),
    STATS_PROTEIN("Protein"),
    ;

    private final String bonusStatName;

    BonusStats(String bonusStatName) {
        this.bonusStatName = bonusStatName;
    }

    public String getBonusStatName() {
        return bonusStatName;
    }

    public static BonusStats fromString(String text) {
        for (BonusStats b : BonusStats.values()) {
            if (b.bonusStatName.equalsIgnoreCase(text)) {
                return b;
            }
        }
        return null;
    }
}
