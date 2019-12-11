import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecoratorTest {

    @Test
    void test1() {
        public void whenDecoratorsInjectedAtRuntime_thenConfigSuccess() {
            Deko deko1 = new BubbleLights(new DekoImpl());
            assertEquals(deko1.decorate(),
                    "Deko with Bubble Lights");

            Deko deko2 = new BubbleLights(
                    new BubbleLights(new BubbleLights(new DekoImpl())));
            assertEquals(deko2.decorate(),
                    "Deko with Garland with Garland with Bubble Lights");
        }
    }
}