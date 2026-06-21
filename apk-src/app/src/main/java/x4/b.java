package x4;

import com.google.android.gms.internal.ads.e2;
import com.google.android.gms.internal.measurement.h5;
import q4.h;
import q4.k;
import q4.l;
import q4.m;
import q4.v;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f35774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f35775b;

    public b(int i) {
        boolean z5 = (i & 1) != 0;
        this.f35775b = z5;
        if (z5) {
            this.f35774a = new v(-1, -1, "image/heif");
        } else {
            this.f35774a = new a();
        }
    }

    @Override // q4.k
    public final int a(l lVar, e2 e2Var) {
        return this.f35774a.a(lVar, e2Var);
    }

    @Override // q4.k
    public final void b(m mVar) {
        this.f35774a.b(mVar);
    }

    @Override // q4.k
    public final boolean d(l lVar) {
        return this.f35775b ? h5.C((h) lVar, false) : this.f35774a.d(lVar);
    }

    @Override // q4.k
    public final void release() {
        this.f35774a.release();
    }

    @Override // q4.k
    public final void seek(long j10, long j11) {
        this.f35774a.seek(j10, j11);
    }
}
