public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Wizards and Warlocks");
        

        Wizard Merlin = new Wizard("Merlin");
        Merlin.displayCharacterName();
        Warlock Saruman = new Warlock("Saruman");
        Saruman.displayCharacterName();
        Merlin.fireStorm(Saruman);
        Saruman.lightningLure(Merlin);
        Merlin.displayCharDetails();
        Saruman.displayCharDetails();
        Merlin.theAtomicBomb(Saruman);
        Saruman.ultraExplosion(Merlin);
        Merlin.displayCharDetails();
        Saruman.displayCharDetails();
        Merlin.holyHeal();
        Merlin.theAtomicBomb(Saruman);
        Merlin.displayCharDetails();
    }
}
