package c2;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f2197b = new g(new h(new LocaleList(new Locale[0])));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f2198a;

    public g(h hVar) {
        this.f2198a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f2198a.equals(((g) obj).f2198a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2198a.f2199a.hashCode();
    }

    public final String toString() {
        return this.f2198a.f2199a.toString();
    }
}
