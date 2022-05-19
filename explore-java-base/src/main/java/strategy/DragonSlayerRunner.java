package strategy;

import strategy.LambdaStrategy.Strategy;

/**
 * @author 314654925@qq.com
 * @date 2022/5/19 10:01 AM
 */
public class DragonSlayerRunner {

    public static void main(String[] args) {
        DragonSlayer dragonSlayer = new DragonSlayer(new MeleeStrategy());

        dragonSlayer.goToBattle();
        dragonSlayer.changeStrategy(new ProjectileStrategy());
        dragonSlayer.goToBattle();
        dragonSlayer.changeStrategy(new SpellStrategy());
        dragonSlayer.goToBattle();

        dragonSlayer.changeStrategy(LambdaStrategy.Strategy.MeleeStrategy);
        dragonSlayer.goToBattle();
        dragonSlayer.changeStrategy(LambdaStrategy.Strategy.ProjectileStrategy);
        dragonSlayer.goToBattle();
        dragonSlayer.changeStrategy(LambdaStrategy.Strategy.SpellStrategy);
        dragonSlayer.goToBattle();
    }
}
