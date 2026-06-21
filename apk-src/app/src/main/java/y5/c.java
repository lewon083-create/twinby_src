package y5;

import q4.a0;
import q4.k;
import q4.l;
import q4.m;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f36471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a0 f36472b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f36475e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f36473c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f36474d = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f36476f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f36477g = -1;

    /* JADX WARN: Code restructure failed: missing block: B:78:0x021c, code lost:
    
        if (r13 != 65534) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0247  */
    @Override // q4.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(q4.l r26, com.google.android.gms.internal.ads.e2 r27) throws j3.d0 {
        /*
            Method dump skipped, instruction units count: 705
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.c.a(q4.l, com.google.android.gms.internal.ads.e2):int");
    }

    @Override // q4.k
    public final void b(m mVar) {
        this.f36471a = mVar;
        this.f36472b = mVar.P(0, 1);
        mVar.G();
    }

    @Override // q4.k
    public final boolean d(l lVar) {
        return d.a(lVar);
    }

    @Override // q4.k
    public final void seek(long j10, long j11) {
        this.f36473c = j10 == 0 ? 0 : 4;
        b bVar = this.f36475e;
        if (bVar != null) {
            bVar.c(j11);
        }
    }

    @Override // q4.k
    public final void release() {
    }
}
