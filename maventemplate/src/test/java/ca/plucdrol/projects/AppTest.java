package ca.plucdrol.projects;

import junit.framework.TestCase;

public class AppTest
    extends TestCase
{
    public void testApp()
    {
        App app = new App();

        String helloWorld = app.getHelloWorld();

        assertEquals("Hello world", helloWorld);
    }
}
