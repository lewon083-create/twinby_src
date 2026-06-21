package io.sentry;

import io.sentry.util.Objects;
import java.net.URI;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class RequestDetailsResolver {
    private static final String SENTRY_AUTH = "X-Sentry-Auth";
    private static final String USER_AGENT = "User-Agent";

    @NotNull
    private final Dsn dsn;

    @Nullable
    private final String sentryClientName;

    public RequestDetailsResolver(@NotNull String str, @Nullable String str2) {
        Objects.requireNonNull(str, "dsn is required");
        this.dsn = new Dsn(str);
        this.sentryClientName = str2;
    }

    @NotNull
    public RequestDetails resolve() {
        URI sentryUri = this.dsn.getSentryUri();
        String string = sentryUri.resolve(sentryUri.getPath() + "/envelope/").toString();
        String publicKey = this.dsn.getPublicKey();
        String secretKey = this.dsn.getSecretKey();
        StringBuilder sb2 = new StringBuilder("Sentry sentry_version=7,sentry_client=");
        sb2.append(this.sentryClientName);
        sb2.append(",sentry_key=");
        sb2.append(publicKey);
        sb2.append((secretKey == null || secretKey.length() <= 0) ? "" : ",sentry_secret=".concat(secretKey));
        String string2 = sb2.toString();
        HashMap map = new HashMap();
        map.put(USER_AGENT, this.sentryClientName);
        map.put(SENTRY_AUTH, string2);
        return new RequestDetails(string, map);
    }

    public RequestDetailsResolver(@NotNull SentryOptions sentryOptions) {
        Objects.requireNonNull(sentryOptions, "options is required");
        this.dsn = sentryOptions.retrieveParsedDsn();
        this.sentryClientName = sentryOptions.getSentryClientName();
    }
}
