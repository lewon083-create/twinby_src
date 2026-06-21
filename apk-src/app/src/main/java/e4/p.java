package e4;

import android.net.Uri;
import i4.z0;
import java.io.IOException;
import java.net.BindException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements m4.i, z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f16169c;

    public /* synthetic */ p(int i, Object obj) {
        this.f16168b = i;
        this.f16169c = obj;
    }

    @Override // i4.z0
    public void a() {
        s sVar = (s) this.f16169c;
        sVar.f16181c.post(new o(sVar, 1));
    }

    public void c(androidx.datastore.preferences.protobuf.m mVar) {
        s sVar = (s) this.f16169c;
        if (!(mVar instanceof u) || sVar.f16200w) {
            sVar.f16190m = mVar;
        } else {
            s.d(sVar);
        }
    }

    public void d(long j10, ad.j0 j0Var) {
        e eVar;
        ArrayList arrayList = new ArrayList(j0Var.size());
        for (int i = 0; i < j0Var.size(); i++) {
            String path = ((d0) j0Var.get(i)).f16063c.getPath();
            path.getClass();
            arrayList.add(path);
        }
        for (int i10 = 0; i10 < ((s) this.f16169c).f16185g.size(); i10++) {
            if (!arrayList.contains(((q) ((s) this.f16169c).f16185g.get(i10)).f16171b.f16065c.f16211b.getPath())) {
                v vVar = (v) ((s) this.f16169c).f16186h.f491c;
                vVar.f16206n = false;
                vVar.x();
                if (((s) this.f16169c).e()) {
                    s sVar = (s) this.f16169c;
                    sVar.f16195r = true;
                    sVar.f16192o = -9223372036854775807L;
                    sVar.f16191n = -9223372036854775807L;
                    sVar.f16193p = -9223372036854775807L;
                }
            }
        }
        for (int i11 = 0; i11 < j0Var.size(); i11++) {
            d0 d0Var = (d0) j0Var.get(i11);
            s sVar2 = (s) this.f16169c;
            Uri uri = d0Var.f16063c;
            ArrayList arrayList2 = sVar2.f16184f;
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList2.size()) {
                    eVar = null;
                    break;
                }
                if (!((r) arrayList2.get(i12)).f16177d) {
                    q qVar = ((r) arrayList2.get(i12)).f16174a;
                    if (qVar.f16171b.f16065c.f16211b.equals(uri)) {
                        eVar = qVar.f16171b;
                        break;
                    }
                }
                i12++;
            }
            if (eVar != null) {
                long j11 = d0Var.f16061a;
                if (j11 != -9223372036854775807L) {
                    f fVar = eVar.i;
                    fVar.getClass();
                    if (!fVar.f16093h) {
                        eVar.i.i = j11;
                    }
                }
                int i13 = d0Var.f16062b;
                f fVar2 = eVar.i;
                fVar2.getClass();
                if (!fVar2.f16093h) {
                    eVar.i.f16094j = i13;
                }
                if (((s) this.f16169c).e()) {
                    s sVar3 = (s) this.f16169c;
                    if (sVar3.f16192o == sVar3.f16191n) {
                        long j12 = d0Var.f16061a;
                        eVar.f16073l = j10;
                        eVar.f16074m = j12;
                    }
                }
            }
        }
        if (!((s) this.f16169c).e()) {
            s sVar4 = (s) this.f16169c;
            long j13 = sVar4.f16193p;
            if (j13 == -9223372036854775807L || !sVar4.f16200w) {
                return;
            }
            sVar4.seekToUs(j13);
            ((s) this.f16169c).f16193p = -9223372036854775807L;
            return;
        }
        s sVar5 = (s) this.f16169c;
        long j14 = sVar5.f16192o;
        long j15 = sVar5.f16191n;
        if (j14 == j15) {
            sVar5.f16192o = -9223372036854775807L;
            sVar5.f16191n = -9223372036854775807L;
        } else {
            sVar5.f16192o = -9223372036854775807L;
            sVar5.seekToUs(j15);
        }
    }

    @Override // m4.i
    public final void e(m4.k kVar, long j10, long j11) {
        boolean z5;
        switch (this.f16168b) {
            case 0:
                e eVar = (e) kVar;
                s sVar = (s) this.f16169c;
                long bufferedPositionUs = sVar.getBufferedPositionUs();
                ArrayList arrayList = sVar.f16184f;
                if (bufferedPositionUs == 0) {
                    if (sVar.f16200w) {
                        return;
                    }
                    s.d(sVar);
                    return;
                }
                int i = 0;
                while (true) {
                    if (i < arrayList.size()) {
                        r rVar = (r) arrayList.get(i);
                        if (rVar.f16174a.f16171b == eVar) {
                            rVar.a();
                        } else {
                            i++;
                        }
                    }
                }
                sVar.f16183e.f16160p = 1;
                return;
            case 1:
                m4.d dVar = (m4.d) this.f16169c;
                synchronized (n4.b.f29098b) {
                    z5 = n4.b.f29099c;
                    break;
                }
                if (z5) {
                    dVar.i();
                    return;
                } else {
                    ((v3.f) dVar.f28630b).A(new IOException(new ConcurrentModificationException()));
                    return;
                }
            default:
                m4.q qVar = (m4.q) kVar;
                v3.f fVar = (v3.f) this.f16169c;
                long j12 = qVar.f28674b;
                p3.l lVar = qVar.f28675c;
                p3.c0 c0Var = qVar.f28677e;
                i4.u uVar = new i4.u(lVar, c0Var.f31133d, c0Var.f31134e, j10, j11, c0Var.f31132c);
                fVar.f34689n.getClass();
                fVar.f34693r.d(uVar, qVar.f28676d);
                fVar.L = ((Long) qVar.f28679g).longValue() - j10;
                fVar.B(true);
                return;
        }
    }

    public void f(String str, IOException iOException) {
        ((s) this.f16169c).f16189l = iOException == null ? new IOException(str) : new IOException(str, iOException);
    }

    @Override // m4.i
    public final com.google.android.gms.internal.ads.o i(m4.k kVar, long j10, long j11, IOException iOException, int i) {
        switch (this.f16168b) {
            case 0:
                e eVar = (e) kVar;
                s sVar = (s) this.f16169c;
                if (!sVar.f16197t) {
                    sVar.f16189l = iOException;
                } else if (iOException.getCause() instanceof BindException) {
                    int i10 = sVar.f16199v;
                    sVar.f16199v = i10 + 1;
                    if (i10 < 3) {
                    }
                } else {
                    sVar.f16190m = new androidx.datastore.preferences.protobuf.m(eVar.f16065c.f16211b.toString(), iOException);
                }
                break;
            case 1:
                ((v3.f) ((m4.d) this.f16169c).f28630b).A(iOException);
                break;
            default:
                m4.q qVar = (m4.q) kVar;
                v3.f fVar = (v3.f) this.f16169c;
                i4.i0 i0Var = fVar.f34693r;
                long j12 = qVar.f28674b;
                p3.l lVar = qVar.f28675c;
                p3.c0 c0Var = qVar.f28677e;
                i0Var.g(new i4.u(lVar, c0Var.f31133d, c0Var.f31134e, j10, j11, c0Var.f31132c), qVar.f28676d, iOException, true);
                fVar.f34689n.getClass();
                fVar.A(iOException);
                break;
        }
        return m4.n.f28669f;
    }

    @Override // m4.i
    public final void m(m4.k kVar, long j10, long j11, boolean z5) {
        switch (this.f16168b) {
            case 0:
                break;
            case 1:
                break;
            default:
                ((v3.f) this.f16169c).z((m4.q) kVar, j10, j11);
                break;
        }
    }

    private final void b(m4.k kVar, long j10, long j11, boolean z5) {
    }
}
