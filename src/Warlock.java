public class Warlock extends Character{
    Warlock(String name){
        super(name, 0, 100, 100);
    }

    public void lightningLure(Character enemyCharacter){
        manaPoints -= 10;
        System.out.println("\n" + super.characterName + " attacks " + enemyCharacter.characterName + " with Lightning Lure (Damage - 10)");
        int damagePoints = 10;
        damageTarget(enemyCharacter, damagePoints);
    }

    public void ultraExplosion(Character enemyCharacter){
        manaPoints -= 30;
        System.out.println("\n" + super.characterName + " attacks " + enemyCharacter.characterName + " with Ultra Explosion (Damage - 60)");
        int damagePoints = 60;
        damageTarget(enemyCharacter, damagePoints);
    }

    public void lifeSupport(){
        System.out.println("\nSaruman used recovery spell used");
        System.out.println("+30 HP");
        System.out.println("+75 MP");
        healthPoints += 30;
        manaPoints += 75;
    }
    
}
