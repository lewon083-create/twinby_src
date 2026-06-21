package io.sentry.transport;

import io.sentry.util.Objects;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
final class ProxyAuthenticator extends Authenticator {

    @NotNull
    private final String password;

    @NotNull
    private final String user;

    public ProxyAuthenticator(@NotNull String str, @NotNull String str2) {
        this.user = (String) Objects.requireNonNull(str, "user is required");
        this.password = (String) Objects.requireNonNull(str2, "password is required");
    }

    @NotNull
    public String getPassword() {
        return this.password;
    }

    @Override // java.net.Authenticator
    @Nullable
    public PasswordAuthentication getPasswordAuthentication() {
        if (getRequestorType() == Authenticator.RequestorType.PROXY) {
            return new PasswordAuthentication(this.user, this.password.toCharArray());
        }
        return null;
    }

    @NotNull
    public String getUser() {
        return this.user;
    }
}
