package strategy;

/**
 * @author 314654925@qq.com
 * @date 2022/5/19 9:57 AM
 */
public class ProjectileStrategy implements DragonSlayingStrategy{

    @Override
    public void execute() {
        System.out.println("You shoot the dragon with the magical crossbow and it falls dead on the ground!");
    }
}
