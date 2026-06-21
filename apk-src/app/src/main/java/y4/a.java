package y4;

import java.util.Objects;
import m3.p;
import q4.h;
import q4.k;
import q4.l;
import q4.m;
import q4.o;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f36444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f36445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36447e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public z4.b f36449g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l f36450h;
    public com.google.android.gms.ads.identifier.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k5.l f36451j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f36443a = new p(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f36448f = -1;

    /* JADX WARN: Removed duplicated region for block: B:51:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x018d  */
    @Override // q4.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(q4.l r26, com.google.android.gms.internal.ads.e2 r27) throws j3.d0 {
        /*
            Method dump skipped, instruction units count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.a.a(q4.l, com.google.android.gms.internal.ads.e2):int");
    }

    @Override // q4.k
    public final void b(m mVar) {
        this.f36444b = mVar;
    }

    @Override // q4.k
    public final boolean d(l lVar) {
        String strU;
        h hVar = (h) lVar;
        p pVar = this.f36443a;
        pVar.J(2);
        hVar.y(pVar.f28589a, 0, 2, false);
        if (pVar.G() == 65496) {
            while (true) {
                pVar.J(2);
                hVar.y(pVar.f28589a, 0, 2, false);
                int iG = pVar.G();
                this.f36446d = iG;
                if (iG == 65498) {
                    break;
                }
                pVar.J(2);
                hVar.V(pVar.f28589a, 0, 2);
                int iG2 = pVar.G() - 2;
                if (iG2 < 0) {
                    break;
                }
                if (this.f36446d != 65505) {
                    hVar.a(iG2, false);
                } else {
                    pVar.J(iG2);
                    hVar.y(pVar.f28589a, 0, iG2, false);
                    if (Objects.equals(pVar.u(), "http://ns.adobe.com/xap/1.0/") && (strU = pVar.u()) != null) {
                        for (int i = 0; i < 4; i++) {
                            if (strU.contains(c.f36455a[i] + "=\"1\"")) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void e() {
        m mVar = this.f36444b;
        mVar.getClass();
        mVar.G();
        this.f36444b.j(new o(-9223372036854775807L));
        this.f36445c = 6;
    }

    @Override // q4.k
    public final void release() {
        k5.l lVar = this.f36451j;
        if (lVar != null) {
            lVar.getClass();
        }
    }

    @Override // q4.k
    public final void seek(long j10, long j11) {
        if (j10 == 0) {
            this.f36445c = 0;
            this.f36451j = null;
        } else if (this.f36445c == 5) {
            k5.l lVar = this.f36451j;
            lVar.getClass();
            lVar.seek(j10, j11);
        }
    }
}
