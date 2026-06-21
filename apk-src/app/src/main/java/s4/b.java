package s4;

import com.google.android.gms.internal.ads.b7;
import com.google.android.gms.internal.ads.j0;
import l7.i;
import m3.p;
import m3.z;
import ob.a0;
import q4.k;
import q4.l;
import q4.m;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f32733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f32734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f32735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f32736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f32737e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m f32738f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f32739g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f32740h;
    public e[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f32741j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e f32742k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f32743l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f32744m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f32745n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f32746o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f32747p;

    public b(int i, i iVar) {
        this.f32736d = iVar;
        this.f32735c = (i & 1) == 0;
        this.f32733a = new p(12);
        this.f32734b = new j0();
        this.f32738f = new a0(25);
        this.i = new e[0];
        this.f32744m = -1L;
        this.f32745n = -1L;
        this.f32743l = -1;
        this.f32740h = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:175:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010d  */
    @Override // q4.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(q4.l r24, com.google.android.gms.internal.ads.e2 r25) throws j3.d0 {
        /*
            Method dump skipped, instruction units count: 1110
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.b.a(q4.l, com.google.android.gms.internal.ads.e2):int");
    }

    @Override // q4.k
    public final void b(m mVar) {
        this.f32737e = 0;
        if (this.f32735c) {
            mVar = new b7(mVar, this.f32736d);
        }
        this.f32738f = mVar;
        this.f32741j = -1L;
    }

    @Override // q4.k
    public final boolean d(l lVar) {
        p pVar = this.f32733a;
        lVar.V(pVar.f28589a, 0, 12);
        pVar.M(0);
        if (pVar.o() != 1179011410) {
            return false;
        }
        pVar.N(4);
        return pVar.o() == 541677121;
    }

    @Override // q4.k
    public final void seek(long j10, long j11) {
        this.f32741j = -1L;
        this.f32742k = null;
        for (e eVar : this.i) {
            if (eVar.f32766k == 0) {
                eVar.i = 0;
            } else {
                eVar.i = eVar.f32769n[z.f(eVar.f32768m, j10, true)];
            }
        }
        if (j10 != 0) {
            this.f32737e = 6;
        } else if (this.i.length == 0) {
            this.f32737e = 0;
        } else {
            this.f32737e = 3;
        }
    }

    @Override // q4.k
    public final void release() {
    }
}
