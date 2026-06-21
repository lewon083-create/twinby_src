package s3;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b1 f32457b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ad.o0 f32458a;

    static {
        m4.d dVar = new m4.d();
        dVar.f28630b = ad.o0.q(2, 1, 5);
        f32457b = new b1(dVar);
    }

    public b1(m4.d dVar) {
        this.f32458a = (ad.o0) dVar.f28630b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b1) && this.f32458a.equals(((b1) obj).f32458a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.f32458a, null, null, bool, bool, bool, bool, bool);
    }
}
