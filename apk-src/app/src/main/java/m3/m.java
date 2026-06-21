package m3;

import com.google.android.gms.internal.ads.uv1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f28572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public uv1 f28573b = new uv1(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f28574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f28575d;

    public m(Object obj) {
        this.f28572a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        return this.f28572a.equals(((m) obj).f28572a);
    }

    public final int hashCode() {
        return this.f28572a.hashCode();
    }
}
