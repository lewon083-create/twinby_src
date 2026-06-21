package x5;

import com.google.android.gms.internal.ads.r9;
import m3.w;
import m3.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f35949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m3.p f35950b = new m3.p(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f35952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f35953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f35954f;

    public s(r rVar) {
        this.f35949a = rVar;
    }

    @Override // x5.v
    public final void a() {
        this.f35954f = true;
    }

    @Override // x5.v
    public final void b(w wVar, q4.m mVar, r9 r9Var) {
        this.f35949a.b(wVar, mVar, r9Var);
        this.f35954f = true;
    }

    @Override // x5.v
    public final void c(int i, m3.p pVar) {
        boolean z5 = (i & 1) != 0;
        int iZ = z5 ? pVar.f28590b + pVar.z() : -1;
        if (this.f35954f) {
            if (!z5) {
                return;
            }
            this.f35954f = false;
            pVar.M(iZ);
            this.f35952d = 0;
        }
        while (pVar.a() > 0) {
            int i10 = this.f35952d;
            m3.p pVar2 = this.f35950b;
            if (i10 < 3) {
                if (i10 == 0) {
                    int iZ2 = pVar.z();
                    pVar.M(pVar.f28590b - 1);
                    if (iZ2 == 255) {
                        this.f35954f = true;
                        return;
                    }
                }
                int iMin = Math.min(pVar.a(), 3 - this.f35952d);
                pVar.k(pVar2.f28589a, this.f35952d, iMin);
                int i11 = this.f35952d + iMin;
                this.f35952d = i11;
                if (i11 == 3) {
                    pVar2.M(0);
                    pVar2.L(3);
                    pVar2.N(1);
                    int iZ3 = pVar2.z();
                    int iZ4 = pVar2.z();
                    this.f35953e = (iZ3 & 128) != 0;
                    int i12 = (((iZ3 & 15) << 8) | iZ4) + 3;
                    this.f35951c = i12;
                    byte[] bArr = pVar2.f28589a;
                    if (bArr.length < i12) {
                        pVar2.c(Math.min(4098, Math.max(i12, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(pVar.a(), this.f35951c - this.f35952d);
                pVar.k(pVar2.f28589a, this.f35952d, iMin2);
                int i13 = this.f35952d + iMin2;
                this.f35952d = i13;
                int i14 = this.f35951c;
                if (i13 != i14) {
                    continue;
                } else {
                    if (!this.f35953e) {
                        pVar2.L(i14);
                    } else {
                        if (z.n(0, i14, -1, pVar2.f28589a) != 0) {
                            this.f35954f = true;
                            return;
                        }
                        pVar2.L(this.f35951c - 4);
                    }
                    pVar2.M(0);
                    this.f35949a.c(pVar2);
                    this.f35952d = 0;
                }
            }
        }
    }
}
