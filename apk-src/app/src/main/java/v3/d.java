package v3;

import com.google.android.gms.internal.measurement.h5;
import j3.m0;
import j3.o0;
import j3.t;
import j3.x;
import m3.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f34675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f34676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f34677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f34678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f34679f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f34680g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f34681h;
    public final w3.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x f34682j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t f34683k;

    public d(long j10, long j11, long j12, int i, long j13, long j14, long j15, w3.c cVar, x xVar, t tVar) {
        h5.r(cVar.f35032d == (tVar != null));
        this.f34675b = j10;
        this.f34676c = j11;
        this.f34677d = j12;
        this.f34678e = i;
        this.f34679f = j13;
        this.f34680g = j14;
        this.f34681h = j15;
        this.i = cVar;
        this.f34682j = xVar;
        this.f34683k = tVar;
    }

    @Override // j3.o0
    public final int b(Object obj) {
        int iIntValue;
        if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.f34678e) >= 0 && iIntValue < h()) {
            return iIntValue;
        }
        return -1;
    }

    @Override // j3.o0
    public final m0 f(int i, m0 m0Var, boolean z5) {
        h5.l(i, h());
        w3.c cVar = this.i;
        String str = z5 ? cVar.b(i).f35060a : null;
        Integer numValueOf = z5 ? Integer.valueOf(this.f34678e + i) : null;
        long jD = cVar.d(i);
        long jM = z.M(cVar.b(i).f35061b - cVar.b(0).f35061b) - this.f34679f;
        m0Var.getClass();
        m0Var.h(str, numValueOf, 0, jD, jM, j3.c.f26218c, false);
        return m0Var;
    }

    @Override // j3.o0
    public final int h() {
        return this.i.f35040m.size();
    }

    @Override // j3.o0
    public final Object l(int i) {
        h5.l(i, h());
        return Integer.valueOf(this.f34678e + i);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
    @Override // j3.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j3.n0 m(int r23, j3.n0 r24, long r25) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.d.m(int, j3.n0, long):j3.n0");
    }

    @Override // j3.o0
    public final int o() {
        return 1;
    }
}
