package io.sentry;

import io.sentry.util.Objects;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class RequestDetails {

    @NotNull
    private final Map<String, String> headers;

    @NotNull
    private final URL url;

    public RequestDetails(@NotNull String str, @NotNull Map<String, String> map) {
        Objects.requireNonNull(str, "url is required");
        Objects.requireNonNull(map, "headers is required");
        try {
            this.url = URI.create(str).toURL();
            this.headers = map;
        } catch (MalformedURLException e3) {
            throw new IllegalArgumentException("Failed to compose the Sentry's server URL.", e3);
        }
    }

    @NotNull
    public Map<String, String> getHeaders() {
        return this.headers;
    }

    @NotNull
    public URL getUrl() {
        return this.url;
    }
}
