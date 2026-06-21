package io.sentry.transport;

import java.net.Authenticator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
final class AuthenticatorWrapper {
    private static final AuthenticatorWrapper instance = new AuthenticatorWrapper();

    private AuthenticatorWrapper() {
    }

    public static AuthenticatorWrapper getInstance() {
        return instance;
    }

    public void setDefault(@NotNull Authenticator authenticator) {
        Authenticator.setDefault(authenticator);
    }
}
