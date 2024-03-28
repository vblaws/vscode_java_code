package practiceCode.bookP132to2;

import org.junit.Test;

public class flies extends Insect implements Flyable {

    public flies() {
        super();
    }

    public flies(int legs) {
        super(legs);

    }

    @Override
    public void flyable() {
        System.out.println("苍蝇可以在天空中飞行");
    }

    @Override
    public void reproduce() {
        System.out.println("苍蝇的繁殖方式是产卵");
    }

}
