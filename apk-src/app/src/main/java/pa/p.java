package pa;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements na.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f31418c = new p(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f31419b;

    public /* synthetic */ p(String str) {
        this.f31419b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            return c0.m(this.f31419b, ((p) obj).f31419b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31419b});
    }
}
