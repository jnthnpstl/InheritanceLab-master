public class Warlock extends Character{
    //calls the constructor of the base class
    Warlock(String name){
        super(name, 0, 100, 100);
    }
    //spell attack 1
    public void lightningLure(Character enemyCharacter){
        manaPoints -= 10;
        System.out.println("\n" + characterName + " attacks " + enemyCharacter.characterName + " with Lightning Lure (Damage - 10)");
        int damagePoints = 10;
        damageTarget(enemyCharacter, damagePoints);
    }

    //spell attack 2
    public void ultraExplosion(Character enemyCharacter){
        manaPoints -= 30;
        System.out.println("\n" + characterName + " attacks " + enemyCharacter.characterName + " with Ultra Explosion (Damage - 60)");
        int damagePoints = 60;
        damageTarget(enemyCharacter, damagePoints);
    }

    //recovery spell
    public void lifeSupport(){
        System.out.println("\nSaruman used recovery spell used");
        System.out.println("+30 HP");
        System.out.println("+75 MP");
        healthPoints += 30;
        manaPoints += 75;
    }
}
