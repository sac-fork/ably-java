package io.ably.lib.transport;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DefaultsTest {

    @Test
    public void versions() {
        assertThat(Defaults.ABLY_VERSION, is("1.0"));
    }

    @Test
    public void environmentFallbackHosts() {
        assertThat(Defaults.getEnvironmentFallbackHosts("sandbox"), is(new String[] {
            "sandbox-a-fallback.ably-realtime.com",
            "sandbox-b-fallback.ably-realtime.com",
            "sandbox-c-fallback.ably-realtime.com",
            "sandbox-d-fallback.ably-realtime.com",
            "sandbox-e-fallback.ably-realtime.com"
        }));
    }
}
