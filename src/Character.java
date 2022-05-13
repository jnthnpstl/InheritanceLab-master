public class Character {
    public String characterName;
    public int level;
    public int healthPoints;
    public int manaPoints;

    /**
     * Create two Constructors
     * 1 - Non Parameterized Constructor
     * 2 - Parameterized Constructor Initializing healthPoints, level, CharacterName and mana
     */
    Character() {

    }
    //initialize the instance variables
    Character(String name, int lvl, int health, int mana){
        characterName = name;
        level = lvl;
        healthPoints = health;
        manaPoints = mana;
    }

    //displays the name of initialized chracter
    public void displayCharacterName() {
        System.out.println("Character Initialized: " + characterName);
    }

    //deducts the enemy health points 
    public void damageTarget(Character enemyCharacter,int damagePoints){
    
        enemyCharacter.healthPoints -= damagePoints;

        //Prompts Character is defeated if HP falls below 0
        if (enemyCharacter.healthPoints <= 0) {
            System.out.println("***Character " + enemyCharacter.characterName + " defeated***");
            levelUp();
            return;
        }

        //prints the remaining health of the enemy
        System.out.println("Enemy character HP Left = " + enemyCharacter.healthPoints);
    }

    //adds 10 levels to the winner
    private void levelUp(){
        level+=10;
        System.out.println(characterName + " Leveled Up!");
    }

    //displays character details per phase
    public void displayCharDetails(){
        System.out.println("\nCharacter Name: " + characterName);
        System.out.println("Level: " + level);
        System.out.println("Health: " + healthPoints);
        System.out.println("Mana: " + manaPoints);
    }
}