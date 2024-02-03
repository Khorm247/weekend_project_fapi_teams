package de.khorm247;

public class Team {
    Pet[] fullTeam = new Pet[6];
    int currentGroundPets = 0;
    int currentFlyingPets = 0;
    final int MAX_GROUND_PETS = 3;
    final int MAX_FLYING_PETS = 3;

    public int getDifferentStatsCount(){
        // return the amount of different Stats
        return 0;
    }

    public void addPetToTeam(Pet pet){
        if(currentGroundPets + 1 < MAX_GROUND_PETS){
            fullTeam[currentGroundPets] = pet;
            currentGroundPets++;
        }
        if(currentFlyingPets + 1 < MAX_FLYING_PETS){
            fullTeam[currentFlyingPets + 3] = pet;
            currentFlyingPets++;
        }
    }

    public boolean isTeamFull(){
        return currentFlyingPets == MAX_FLYING_PETS &&
                currentGroundPets == MAX_GROUND_PETS;
    }
}
