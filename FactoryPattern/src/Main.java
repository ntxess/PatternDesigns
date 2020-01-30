public class Main {
    public static void main(String[] args) {
        EnemyFactory virusFactory = new VirusFactory();
        EnemyFactory heelFactory  = new HeelFactory();

        Entity virus = virusFactory.createEnemy();
        Entity heelNavi = heelFactory.createEnemy();

        System.out.println("=======================");

        System.out.println(virus.getName());
        System.out.println(virus.getHP());
        virus.attack();

        System.out.println("OK");
        System.out.println("=======================");

        System.out.println(heelNavi.getName());
        System.out.println(heelNavi.getHP());
        heelNavi.attack();

        System.out.println("OK");
        System.out.println("=======================");
    }
}
