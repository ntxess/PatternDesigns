public class HeelFactory implements EnemyFactory {
    @Override
    public Entity createEnemy()
    {
        return new HeelNavi();
    }
}
