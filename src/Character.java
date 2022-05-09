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

    Character(String name, int lvl, int health, int mana){
        characterName = name;
        level = lvl;
        healthPoints = health;
        manaPoints = mana;
    }

    
    public void displayCharacterName() {
        System.out.println("Character Initialized: " + characterName);
    }

    
    public void damageTarget(Character enemyCharacter,int damagePoints){
        /**
         * Deduct health points from enemy character
         */
        enemyCharacter.healthPoints -= damagePoints;
        if (enemyCharacter.healthPoints <= 0) {
            System.out.println("Character " + enemyCharacter.characterName + " defeated");
            levelUp();
            return;
        }
        System.out.println("Enemy character HP Left = " + enemyCharacter.healthPoints);

        /**
         * Prompt Character is defeated if HP falls below 0
         * eg. Character Shaman defeated.
         */

    }

    private void levelUp(){
        level+=10;
        System.out.println(characterName + " Leveled Up!");
    }

    public void displayCharDetails(){
        System.out.println("\nCharacter Name: " + characterName);
        System.out.println("Level: " + level);
        System.out.println("Health: " + healthPoints);
        System.out.println("Mana: " + manaPoints);
    }
}