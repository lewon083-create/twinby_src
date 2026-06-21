package cj;

import com.google.android.gms.internal.measurement.d4;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f2340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f2341d;

    public j(long j10, long j11, long j12, long j13) {
        this.f2338a = j10;
        this.f2339b = j11;
        this.f2340c = j12;
        this.f2341d = j13;
    }

    public final List a() {
        return kotlin.collections.s.f(Long.valueOf(this.f2338a), Long.valueOf(this.f2339b), Long.valueOf(this.f2340c), Long.valueOf(this.f2341d));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return d4.d(a(), ((j) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        StringBuilder sbN = gf.a.n("InitializationEvent(duration=", ", width=", this.f2338a);
        sbN.append(this.f2339b);
        pe.a.s(sbN, ", height=", this.f2340c, ", rotationCorrection=");
        return pe.a.h(sbN, this.f2341d, ")");
    }
}
