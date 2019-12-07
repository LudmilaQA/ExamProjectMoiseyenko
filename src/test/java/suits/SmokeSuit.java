package suits;

import loginTest.LoginWithPageObjectTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import womanFavouritesTest.WomanFavouritesTest;
import womanTest.WomanTest;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                LoginWithPageObjectTest.class,
                WomanTest.class,
                WomanFavouritesTest.class
        }
)

public class SmokeSuit {
}
