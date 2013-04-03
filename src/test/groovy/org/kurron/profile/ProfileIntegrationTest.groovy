package org.kurron.profile

import org.junit.Test
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests

/**
 * Integration test to prove out the profile switching.
 */
@ContextConfiguration
class ProfileIntegrationTest extends AbstractJUnit4SpringContextTests
{
    @Test
    public void given_when_then() {
        println 'Hello, world!'
    }

}
