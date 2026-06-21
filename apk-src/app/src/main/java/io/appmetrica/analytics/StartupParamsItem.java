package io.appmetrica.analytics;

import a0.u;
import androidx.annotation.NonNull;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class StartupParamsItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StartupParamsItemStatus f21473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f21474c;

    public StartupParamsItem(String str, @NonNull StartupParamsItemStatus startupParamsItemStatus, String str2) {
        this.f21472a = str;
        this.f21473b = startupParamsItemStatus;
        this.f21474c = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && StartupParamsItem.class == obj.getClass()) {
            StartupParamsItem startupParamsItem = (StartupParamsItem) obj;
            if (Objects.equals(this.f21472a, startupParamsItem.f21472a) && this.f21473b == startupParamsItem.f21473b && Objects.equals(this.f21474c, startupParamsItem.f21474c)) {
                return true;
            }
        }
        return false;
    }

    public String getErrorDetails() {
        return this.f21474c;
    }

    public String getId() {
        return this.f21472a;
    }

    @NonNull
    public StartupParamsItemStatus getStatus() {
        return this.f21473b;
    }

    public int hashCode() {
        return Objects.hash(this.f21472a, this.f21473b, this.f21474c);
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("StartupParamsItem{id='");
        sb2.append(this.f21472a);
        sb2.append("', status=");
        sb2.append(this.f21473b);
        sb2.append(", errorDetails='");
        return u.o(sb2, this.f21474c, "'}");
    }
}
