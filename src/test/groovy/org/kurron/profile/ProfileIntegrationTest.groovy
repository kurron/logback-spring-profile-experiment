package org.kurron.profile

import org.junit.Test
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.slf4j.MDC
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests

import java.text.SimpleDateFormat

/**
 * Integration test to prove out the profile switching.
 */
@ContextConfiguration
class ProfileIntegrationTest extends AbstractJUnit4SpringContextTests
{
    private final Logger logger = LoggerFactory.getLogger( ProfileIntegrationTest.class )

    @Autowired
    private MessageGenerator theMessageGenerator;

    @Test
    public void given_when_then() {
        Random random = new Random()
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd kk:mm:ss:SSS")

        MDC.put( "application-type", 'OxBABE' );
        MDC.put( "application-instance", Integer.toHexString( random.nextInt( Integer.MAX_VALUE ) ).toUpperCase() );
        MDC.put( "host-ip", '192.168.1.1' );
        MDC.put( "username", 'logan' );

        10.times {
            MDC.put( "message-code", Integer.toString( random.nextInt( Integer.MAX_VALUE ) ) );
            MDC.put( "work-unit", Integer.toHexString( random.nextInt( Integer.MAX_VALUE ) ).toUpperCase() );
            MDC.put( "time", formatter.format( new Date( System.currentTimeMillis() ) ) );
            MDC.put( "sequence-number", it.toString() );
            logger.error( theMessageGenerator.message() )
        }
    }

}
