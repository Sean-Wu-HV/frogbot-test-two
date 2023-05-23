package org.sean;

/**
 * Hello world!
 *
 */
import org.apache.logging.log4j.core.config.Configurator;
public class App 
{
    public static void main( String[] args )
    {
        // Initialize Log4j with default configuration
        Configurator.initialize(null, "log4j2-default.xml");

        System.out.println( "Hello log4j!" );
        Log4jExample ex = new Log4jExample();
        ex.runLog4j();
    }
}
