package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class UserDemographyFactoryTest {

    @Test
    public void buildUserDemography() {
        Date date = new Date();
        UserDemography userDemographyFactory = UserDemographyFactory.
                buildUserDemography(
                        "vansittert5@gmail.com",
                        "Manager",
                        "1",
                        "1",
                        date);
        Assert.assertNotNull(userDemographyFactory);
    }
}