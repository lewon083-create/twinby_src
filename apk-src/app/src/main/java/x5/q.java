package x5;

import android.util.SparseArray;
import com.google.android.gms.internal.ads.e2;
import com.google.android.gms.internal.ads.e9;
import com.google.android.gms.internal.ads.p1;
import com.google.android.gms.internal.ads.r9;
import com.google.android.gms.internal.ads.y2;
import io.sentry.SentryOptions;
import kotlin.KotlinVersion;
import m3.w;
import ob.y;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements q4.k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f35943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f35944f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f35945g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f35946h;
    public v4.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public q4.m f35947j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f35948k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f35939a = new w(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m3.p f35941c = new m3.p(4096);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f35940b = new SparseArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f35942d = new o(0);

    @Override // q4.k
    public final int a(q4.l lVar, e2 e2Var) {
        int i;
        int i10;
        long j10;
        f hVar;
        long j11;
        this.f35947j.getClass();
        long length = lVar.getLength();
        int i11 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j12 = -9223372036854775807L;
        o oVar = this.f35942d;
        if (i11 != 0 && !oVar.f35927d) {
            w wVar = oVar.f35925b;
            m3.p pVar = oVar.f35926c;
            if (!oVar.f35929f) {
                long length2 = lVar.getLength();
                int iMin = (int) Math.min(20000L, length2);
                long j13 = length2 - ((long) iMin);
                if (lVar.getPosition() != j13) {
                    e2Var.f4793b = j13;
                    return 1;
                }
                pVar.J(iMin);
                lVar.L();
                lVar.V(pVar.f28589a, 0, iMin);
                int i12 = pVar.f28590b;
                int i13 = pVar.f28591c - 4;
                while (true) {
                    if (i13 < i12) {
                        break;
                    }
                    if (o.b(i13, pVar.f28589a) == 442) {
                        pVar.M(i13 + 4);
                        long jC = o.c(pVar);
                        if (jC != -9223372036854775807L) {
                            j12 = jC;
                            break;
                        }
                    }
                    i13--;
                }
                oVar.f35931h = j12;
                oVar.f35929f = true;
                return 0;
            }
            if (oVar.f35931h == -9223372036854775807L) {
                oVar.a(lVar);
                return 0;
            }
            if (oVar.f35928e) {
                long j14 = oVar.f35930g;
                if (j14 == -9223372036854775807L) {
                    oVar.a(lVar);
                    return 0;
                }
                oVar.i = wVar.c(oVar.f35931h) - wVar.b(j14);
                oVar.a(lVar);
                return 0;
            }
            int iMin2 = (int) Math.min(20000L, lVar.getLength());
            long j15 = 0;
            if (lVar.getPosition() != j15) {
                e2Var.f4793b = j15;
                return 1;
            }
            pVar.J(iMin2);
            lVar.L();
            lVar.V(pVar.f28589a, 0, iMin2);
            int i14 = pVar.f28590b;
            int i15 = pVar.f28591c;
            while (true) {
                if (i14 >= i15 - 3) {
                    j11 = -9223372036854775807L;
                    break;
                }
                if (o.b(i14, pVar.f28589a) == 442) {
                    pVar.M(i14 + 4);
                    long jC2 = o.c(pVar);
                    if (jC2 != -9223372036854775807L) {
                        j11 = jC2;
                        break;
                    }
                }
                i14++;
            }
            oVar.f35930g = j11;
            oVar.f35928e = true;
            return 0;
        }
        if (this.f35948k) {
            i = i11;
            i10 = 4;
        } else {
            this.f35948k = true;
            long j16 = oVar.i;
            if (j16 != -9223372036854775807L) {
                i = i11;
                i10 = 4;
                v4.b bVar = new v4.b(new y(25), new x0.v(oVar.f35925b), j16, j16 + 1, 0L, length, 188L, 1000);
                this.i = bVar;
                this.f35947j.j((q4.c) bVar.f10460b);
            } else {
                i = i11;
                i10 = 4;
                this.f35947j.j(new q4.o(j16));
            }
        }
        v4.b bVar2 = this.i;
        if (bVar2 != null && ((p1) bVar2.f10462d) != null) {
            return bVar2.a(lVar, e2Var);
        }
        lVar.L();
        long jZ = i != 0 ? length - lVar.z() : -1L;
        if (jZ != -1 && jZ < 4) {
            return -1;
        }
        m3.p pVar2 = this.f35941c;
        if (!lVar.y(pVar2.f28589a, 0, i10, true)) {
            return -1;
        }
        pVar2.M(0);
        int iM = pVar2.m();
        if (iM == 441) {
            return -1;
        }
        if (iM == 442) {
            lVar.V(pVar2.f28589a, 0, 10);
            pVar2.M(9);
            lVar.M((pVar2.z() & 7) + 14);
            return 0;
        }
        if (iM == 443) {
            lVar.V(pVar2.f28589a, 0, 2);
            pVar2.M(0);
            lVar.M(pVar2.G() + 6);
            return 0;
        }
        if (((iM & (-256)) >> 8) != 1) {
            lVar.M(1);
            return 0;
        }
        int i16 = iM & KotlinVersion.MAX_COMPONENT_VALUE;
        SparseArray sparseArray = this.f35940b;
        p pVar3 = (p) sparseArray.get(i16);
        if (!this.f35943e) {
            if (pVar3 == null) {
                if (i16 == 189) {
                    hVar = new b("video/mp2p");
                    this.f35944f = true;
                    this.f35946h = lVar.getPosition();
                } else if ((iM & 224) == 192) {
                    hVar = new e9(0, 1, null, "video/mp2p");
                    this.f35944f = true;
                    this.f35946h = lVar.getPosition();
                } else if ((iM & 240) == 224) {
                    hVar = new h(null, "video/mp2p");
                    this.f35945g = true;
                    this.f35946h = lVar.getPosition();
                } else {
                    hVar = null;
                }
                if (hVar != null) {
                    hVar.e(this.f35947j, new r9(i16, 256));
                    pVar3 = new p(hVar, this.f35939a);
                    sparseArray.put(i16, pVar3);
                }
            }
            if (lVar.getPosition() > ((this.f35944f && this.f35945g) ? this.f35946h + 8192 : SentryOptions.MAX_EVENT_SIZE_BYTES)) {
                this.f35943e = true;
                this.f35947j.G();
            }
        }
        lVar.V(pVar2.f28589a, 0, 2);
        pVar2.M(0);
        int iG = pVar2.G() + 6;
        if (pVar3 == null) {
            lVar.M(iG);
            return 0;
        }
        pVar2.J(iG);
        lVar.readFully(pVar2.f28589a, 0, iG);
        pVar2.M(6);
        f fVar = pVar3.f35932a;
        y2 y2Var = pVar3.f35934c;
        pVar2.k(y2Var.f12462b, 0, 3);
        y2Var.q(0);
        y2Var.t(8);
        pVar3.f35935d = y2Var.h();
        pVar3.f35936e = y2Var.h();
        y2Var.t(6);
        pVar2.k(y2Var.f12462b, 0, y2Var.i(8));
        y2Var.q(0);
        w wVar2 = pVar3.f35933b;
        pVar3.f35938g = 0L;
        if (pVar3.f35935d) {
            y2Var.t(4);
            long jI = ((long) y2Var.i(3)) << 30;
            y2Var.t(1);
            long jI2 = jI | ((long) (y2Var.i(15) << 15));
            y2Var.t(1);
            long jI3 = jI2 | ((long) y2Var.i(15));
            y2Var.t(1);
            if (pVar3.f35937f || !pVar3.f35936e) {
                j10 = jI3;
            } else {
                y2Var.t(4);
                long jI4 = ((long) y2Var.i(3)) << 30;
                y2Var.t(1);
                long jI5 = ((long) (y2Var.i(15) << 15)) | jI4;
                y2Var.t(1);
                long jI6 = jI5 | ((long) y2Var.i(15));
                y2Var.t(1);
                wVar2.b(jI6);
                pVar3.f35937f = true;
                j10 = jI3;
            }
            pVar3.f35938g = wVar2.b(j10);
        }
        fVar.i(4, pVar3.f35938g);
        fVar.c(pVar2);
        fVar.f(false);
        pVar2.L(pVar2.f28589a.length);
        return 0;
    }

    @Override // q4.k
    public final void b(q4.m mVar) {
        this.f35947j = mVar;
    }

    @Override // q4.k
    public final boolean d(q4.l lVar) {
        byte[] bArr = new byte[14];
        q4.h hVar = (q4.h) lVar;
        hVar.y(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            hVar.a(bArr[13] & 7, false);
            hVar.y(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // q4.k
    public final void seek(long j10, long j11) {
        long j12;
        SparseArray sparseArray = this.f35940b;
        w wVar = this.f35939a;
        synchronized (wVar) {
            j12 = wVar.f28603b;
        }
        boolean z5 = j12 == -9223372036854775807L;
        if (!z5) {
            long jD = wVar.d();
            z5 = (jD == -9223372036854775807L || jD == 0 || jD == j11) ? false : true;
        }
        if (z5) {
            wVar.f(j11);
        }
        v4.b bVar = this.i;
        if (bVar != null) {
            bVar.c(j11);
        }
        for (int i = 0; i < sparseArray.size(); i++) {
            p pVar = (p) sparseArray.valueAt(i);
            pVar.f35937f = false;
            pVar.f35932a.a();
        }
    }

    @Override // q4.k
    public final void release() {
    }
}
