package strategy;
/**
 * @author weiqingjing@jd.com
 * @date 2022/5/19 9:56 AM
 */

public class MeleeStrategy  implements DragonSlayingStrategy{

    @Override
    public void execute() {
        System.out.println("With your Excalibur you sever the dragon's head!");
    }
}
