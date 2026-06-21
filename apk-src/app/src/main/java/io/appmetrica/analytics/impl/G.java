package io.appmetrica.analytics.impl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22362c;

    public G(int i, int i10, int i11) {
        this.f22360a = i;
        this.f22361b = i10;
        this.f22362c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!G.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.impl.id.AdvIdGetterController.CanTrackIdentifiers");
        }
        G g10 = (G) obj;
        return this.f22360a == g10.f22360a && this.f22361b == g10.f22361b && this.f22362c == g10.f22362c;
    }

    public final int hashCode() {
        return L7.a(this.f22362c) + ((L7.a(this.f22361b) + (L7.a(this.f22360a) * 31)) * 31);
    }

    public final String toString() {
        return "CanTrackIdentifiers(canTrackGaid=" + H.a(this.f22360a) + ", canTrackHoaid=" + H.a(this.f22361b) + ", canTrackYandexAdvId=" + H.a(this.f22362c) + ')';
    }
}
