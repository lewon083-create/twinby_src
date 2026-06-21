package n5;

import ad.b1;
import ad.h0;
import ad.j0;
import ad.p;
import ad.z0;
import com.google.android.gms.internal.measurement.h5;
import java.util.List;
import m3.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p f29106d = new p(new b(0), z0.f899c);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f29107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f29108c;

    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(ad.b1 r19) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.c.<init>(ad.b1):void");
    }

    @Override // n5.e
    public final int d(long j10) {
        int iB = z.b(this.f29108c, j10, false);
        if (iB < this.f29107b.size()) {
            return iB;
        }
        return -1;
    }

    @Override // n5.e
    public final long f(int i) {
        h5.h(i < this.f29107b.size());
        return this.f29108c[i];
    }

    @Override // n5.e
    public final List h(long j10) {
        int iF = z.f(this.f29108c, j10, false);
        if (iF != -1) {
            return (j0) this.f29107b.get(iF);
        }
        h0 h0Var = j0.f818c;
        return b1.f768f;
    }

    @Override // n5.e
    public final int l() {
        return this.f29107b.size();
    }
}
