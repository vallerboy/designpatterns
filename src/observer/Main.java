package observer;

import java.util.UUID;
import java.util.stream.IntStream;

/**
 * Created by Lenovo on 12.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        BigLotto lotto = new BigLotto();


        IntStream.range(1, 5)
                .mapToObj(s -> new LottoPlayer(UUID.randomUUID().toString()))
                .forEach(s -> lotto.addObserver(s));


        lotto.doLotto();
        System.out.println("Ups, slaba wygrana!");

        lotto.doLotto();
    }
}
