package io.sentry.clientreport;

import io.sentry.util.Objects;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
final class ClientReportKey {

    @NotNull
    private final String category;

    @NotNull
    private final String reason;

    public ClientReportKey(@NotNull String str, @NotNull String str2) {
        this.reason = str;
        this.category = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientReportKey)) {
            return false;
        }
        ClientReportKey clientReportKey = (ClientReportKey) obj;
        return Objects.equals(getReason(), clientReportKey.getReason()) && Objects.equals(getCategory(), clientReportKey.getCategory());
    }

    @NotNull
    public String getCategory() {
        return this.category;
    }

    @NotNull
    public String getReason() {
        return this.reason;
    }

    public int hashCode() {
        return Objects.hash(getReason(), getCategory());
    }
}
