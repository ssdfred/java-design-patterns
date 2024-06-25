package fr.diginamic.singleton;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class ConfigurationTest {

	@Test
    public void testSingleton() {
        Configuration config1 = Configuration.getInstance();
 

 
        // Verify configuration values
       String dbUrl = config1.getValue("db.url");
        assertEquals("La valeur de db.url doit être correcte", "jdbc:mysql://localhost:3307/imdb", dbUrl);

        String dbUser = config1.getValue("db.user");
        assertEquals( dbUser,"root");

        String dbPassword = config1.getValue("db.password");
        assertEquals("root", dbPassword);
    }

}
