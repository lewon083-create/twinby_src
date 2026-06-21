package j3;

import com.google.android.gms.internal.ads.e2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26356a;

    static {
        new q(new e2());
        m3.z.G(0);
        m3.z.G(1);
        m3.z.G(2);
        m3.z.G(3);
        m3.z.G(4);
        m3.z.G(5);
        m3.z.G(6);
        m3.z.G(7);
    }

    public q(e2 e2Var) {
        String str = m3.z.f28608a;
        this.f26356a = e2Var.f4793b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && this.f26356a == ((q) obj).f26356a;
    }

    public final int hashCode() {
        long j10 = this.f26356a;
        return ((((int) 0) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 923521;
    }
}
