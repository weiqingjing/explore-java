package strategy;

/**
 * @author 314654925@qq.com
 * @date 2022/5/19 9:58 AM
 */
public class SpellStrategy implements DragonSlayingStrategy{

    @Override
    public void execute() {
        System.out.println("You cast the spell of disintegration and the dragon vaporizes in a pile of dust!");
    }
}
