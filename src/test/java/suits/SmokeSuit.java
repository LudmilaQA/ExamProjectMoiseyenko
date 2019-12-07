package suits;

import loginTest.LoginWithPageObjectTest;
import orderTest.OrderTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import womanFavouritesTest.WomanFavouritesTest;
import womanTest.WomanTest;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                LoginWithPageObjectTest.class,
                WomanTest.class,
                WomanFavouritesTest.class,
                OrderTest.class
        }
)

public class SmokeSuit {
}
