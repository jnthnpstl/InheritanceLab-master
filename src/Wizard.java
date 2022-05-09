public class Wizard extends Character{
    Wizard(String name){
        super(name, 0, 100, 100);
    }
    public void fireStorm(Character enemyCharacter){
        manaPoints -= 15;
        System.out.println("\n" + super.characterName + " attacks " + enemyCharacter.characterName + " with Firestorm (Damage - 15)");
        int damagePoints = 15;
        damageTarget(enemyCharacter, damagePoints);
    }

    public void theAtomicBomb(Character enemyCharacter){
        manaPoints -= 25;
        System.out.println("\n" + super.characterName + " attacks " + enemyCharacter.characterName + " with The Atomic Bomb (Damage - 70)");
        int damagePoints = 70;
        damageTarget(enemyCharacter, damagePoints);
    }

    public void holyHeal(){
        System.out.println("\nMerlin used recovery spell");
        System.out.println("+50 HP");
        System.out.println("+50 MP");
        healthPoints += 50;
        manaPoints += 50;
    }
    
}
