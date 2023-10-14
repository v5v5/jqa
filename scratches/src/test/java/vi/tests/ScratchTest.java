package vi.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import vi.Application;
import vi.components.ScratchComponent;

@SpringBootTest(classes = Application.class)
class ScratchTest {

    @Autowired
    private ScratchComponent scratchComponent;

    @Test
    void test() {
        scratchComponent.operate();
        var expected = 1;
        var actual = 1;
        Assertions.assertEquals(expected, actual);
    }
}
