package gl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final nl.j f20165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final nl.j f20166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final nl.j f20167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final nl.j f20168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final nl.j f20169h;
    public static final nl.j i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nl.j f20170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nl.j f20171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20172c;

    static {
        nl.j jVar = nl.j.f29541e;
        f20165d = l7.i.f(StringUtils.PROCESS_POSTFIX_DELIMITER);
        f20166e = l7.i.f(":status");
        f20167f = l7.i.f(":method");
        f20168g = l7.i.f(":path");
        f20169h = l7.i.f(":scheme");
        i = l7.i.f(":authority");
    }

    public c(nl.j name, nl.j value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f20170a = name;
        this.f20171b = value;
        this.f20172c = value.a() + name.a() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.a(this.f20170a, cVar.f20170a) && Intrinsics.a(this.f20171b, cVar.f20171b);
    }

    public final int hashCode() {
        return this.f20171b.hashCode() + (this.f20170a.hashCode() * 31);
    }

    public final String toString() {
        return this.f20170a.h() + ": " + this.f20171b.h();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(String name, String value) {
        this(l7.i.f(name), l7.i.f(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        nl.j jVar = nl.j.f29541e;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(nl.j name, String value) {
        this(name, l7.i.f(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        nl.j jVar = nl.j.f29541e;
    }
}
