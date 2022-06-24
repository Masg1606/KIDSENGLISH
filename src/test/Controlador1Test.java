import org.junit.Test;

class Controlador1Test {

    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    @beforeEach
    void setUp() {
        Controlador1 ctrl1 = new Controlador1();
    }

    @Test
    void testExit() {
        ctrl1.Exit(null);
        exit.expectSystemExitWithStatus(0);
    }
}
