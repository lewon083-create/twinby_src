package oi;

import java.util.Map;
import kotlin.collections.s;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f30671b;

    public a(String name, Map map) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f30670a = name;
        this.f30671b = map;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        a aVar = (a) obj;
        return com.google.android.gms.internal.auth.g.g(s.f(this.f30670a, this.f30671b), s.f(aVar.f30670a, aVar.f30671b));
    }

    public final int hashCode() {
        return s.f(this.f30670a, this.f30671b).hashCode();
    }

    public final String toString() {
        return "AnalyticsEvent(name=" + this.f30670a + ", parameters=" + this.f30671b + ")";
    }
}
