public class Main {
    public static void main(String[] args) {
        EntityFactory foeFact = new FoeFactory();
        EntityFactory frdFact = new FriendFactory();

        Entity megaman = frdFact.createNavi();
        Entity virus1 = frdFact.createVirus();
        Entity virus2 = frdFact.createVirus();

        System.out.println(megaman.getName() + ": ");
        System.out.println("\t" + megaman.getHP() + "\n\t" + megaman.getCustomizable());
        megaman.attack();

        System.out.println("\n=======================================");

        System.out.println(virus1.getName() + ": ");
        System.out.println("\t" + virus1.getHP() + "\n\t" + virus1.getCustomizable());
        virus1.attack();

        System.out.println("\n=======================================");

        System.out.println(virus2.getName() + ": ");
        System.out.println("\t" + virus2.getHP() + "\n\t" + virus2.getCustomizable());
        virus2.attack();

        System.out.println("\n=======================================");

        Entity bass = foeFact.createNavi();
        Entity virus3 = foeFact.createVirus();
        Entity virus4 = foeFact.createVirus();

        System.out.println(bass.getName() + ": ");
        System.out.println("\t" + bass.getHP() + "\n\t" + bass.getCustomizable());
        bass.attack();

        System.out.println("\n=======================================");

        System.out.println(virus3.getName() + ": ");
        System.out.println("\t" + virus3.getHP() + "\n\t" + virus3.getCustomizable());
        virus3.attack();

        System.out.println("\n=======================================");

        System.out.println(virus4.getName() + ": ");
        System.out.println("\t" + virus4.getHP() + "\n\t" + virus4.getCustomizable());
        virus4.attack();
    }
}
