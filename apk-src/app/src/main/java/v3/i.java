package v3;

import i4.b1;
import j3.o;
import m3.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements b1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f34715b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f34717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f34718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public w3.g f34719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f34720g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f34721h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a1.e f34716c = new a1.e(3);
    public long i = -9223372036854775807L;

    public i(w3.g gVar, o oVar, boolean z5) {
        this.f34715b = oVar;
        this.f34719f = gVar;
        this.f34717d = gVar.f35057b;
        b(gVar, z5);
    }

    public final void b(w3.g gVar, boolean z5) {
        int i = this.f34721h;
        long j10 = -9223372036854775807L;
        long j11 = i == 0 ? -9223372036854775807L : this.f34717d[i - 1];
        this.f34718e = z5;
        this.f34719f = gVar;
        long[] jArr = gVar.f35057b;
        this.f34717d = jArr;
        long j12 = this.i;
        if (j12 == -9223372036854775807L) {
            if (j11 != -9223372036854775807L) {
                this.f34721h = z.b(jArr, j11, false);
            }
        } else {
            int iB = z.b(jArr, j12, true);
            this.f34721h = iB;
            if (this.f34718e && iB == this.f34717d.length) {
                j10 = j12;
            }
            this.i = j10;
        }
    }

    @Override // i4.b1
    public final int d(r3.b bVar, r3.e eVar, int i) {
        int i10 = this.f34721h;
        boolean z5 = i10 == this.f34717d.length;
        if (z5 && !this.f34718e) {
            eVar.f7316c = 4;
            return -4;
        }
        if ((i & 2) != 0 || !this.f34720g) {
            bVar.f32189d = this.f34715b;
            this.f34720g = true;
            return -5;
        }
        if (z5) {
            return -3;
        }
        if ((i & 1) == 0) {
            this.f34721h = i10 + 1;
        }
        if ((i & 4) == 0) {
            byte[] bArrX = this.f34716c.x(this.f34719f.f35056a[i10]);
            eVar.t(bArrX.length);
            eVar.f32192f.put(bArrX);
        }
        eVar.f32194h = this.f34717d[i10];
        eVar.f7316c = 1;
        return -4;
    }

    @Override // i4.b1
    public final int h(long j10) {
        int iMax = Math.max(this.f34721h, z.b(this.f34717d, j10, true));
        int i = iMax - this.f34721h;
        this.f34721h = iMax;
        return i;
    }

    @Override // i4.b1
    public final boolean isReady() {
        return true;
    }

    @Override // i4.b1
    public final void a() {
    }
}
