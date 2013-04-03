package org.kurron.profile

import org.junit.Test
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests

/**
 * Integration test to prove out the profile switching.
 */
@ContextConfiguration
class ProfileIntegrationTest extends AbstractJUnit4SpringContextTests
{
    private final Logger logger = LoggerFactory.getLogger( ProfileIntegrationTest.class )

    @Test
    public void given_when_then() {
        logger.debug( 'Hello, world!' )
    }

}
