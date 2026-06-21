package z3;

import ad.j0;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.h5;
import d8.e0;
import i4.i0;
import i4.u;
import j3.d0;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m3.z;
import p3.c0;
import p3.w;
import t.v0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements m4.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f46014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m4.n f46015c = new m4.n("DefaultHlsPlaylistTracker:MediaPlaylist");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p3.h f46016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l f46017e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f46018f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f46019g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f46020h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f46021j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public IOException f46022k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f46023l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f46024m;

    public b(c cVar, Uri uri) {
        this.f46024m = cVar;
        this.f46014b = uri;
        this.f46016d = ((p3.g) cVar.f46026b.f28630b).createDataSource();
    }

    public static boolean a(b bVar, long j10) {
        bVar.i = SystemClock.elapsedRealtime() + j10;
        Uri uri = bVar.f46014b;
        c cVar = bVar.f46024m;
        if (!uri.equals(cVar.f46035l)) {
            return true;
        }
        List list = cVar.f46034k.f46133e;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            b bVar2 = (b) cVar.f46029e.get(((n) list.get(i)).f46125a);
            bVar2.getClass();
            if (jElapsedRealtime > bVar2.i) {
                Uri uri2 = bVar2.f46014b;
                cVar.f46035l = uri2;
                bVar2.f(cVar.b(uri2));
                return true;
            }
        }
        return false;
    }

    public final Uri b() {
        l lVar = this.f46017e;
        Uri uri = this.f46014b;
        if (lVar != null) {
            k kVar = lVar.f46120v;
            if (kVar.f46098a != -9223372036854775807L || kVar.f46102e) {
                Uri.Builder builderBuildUpon = uri.buildUpon();
                l lVar2 = this.f46017e;
                if (lVar2.f46120v.f46102e) {
                    builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(lVar2.f46109k + ((long) lVar2.f46116r.size())));
                    l lVar3 = this.f46017e;
                    if (lVar3.f46112n != -9223372036854775807L) {
                        j0 j0Var = lVar3.f46117s;
                        int size = j0Var.size();
                        if (!j0Var.isEmpty() && ((g) ad.q.j(j0Var)).f46082n) {
                            size--;
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                k kVar2 = this.f46017e.f46120v;
                if (kVar2.f46098a != -9223372036854775807L) {
                    builderBuildUpon.appendQueryParameter("_HLS_skip", kVar2.f46099b ? "v2" : "YES");
                }
                return builderBuildUpon.build();
            }
        }
        return uri;
    }

    public final void c(boolean z5) {
        f(z5 ? b() : this.f46014b);
    }

    public final void d(Uri uri) {
        c cVar = this.f46024m;
        m4.p pVarA = cVar.f46027c.a(cVar.f46034k, this.f46017e);
        Map map = Collections.EMPTY_MAP;
        h5.m(uri, "The uri must be set.");
        m4.q qVar = new m4.q(this.f46016d, new p3.l(uri, 0L, 1, null, map, 0L, -1L, null, 1), 4, pVarA);
        this.f46015c.f(qVar, this, cVar.f46028d.e(qVar.f28676d));
    }

    @Override // m4.i
    public final void e(m4.k kVar, long j10, long j11) {
        m4.q qVar = (m4.q) kVar;
        p pVar = (p) qVar.f28679g;
        p3.l lVar = qVar.f28675c;
        c0 c0Var = qVar.f28677e;
        u uVar = new u(lVar, c0Var.f31133d, c0Var.f31134e, j10, j11, c0Var.f31132c);
        if (pVar instanceof l) {
            g((l) pVar, uVar);
            this.f46024m.f46031g.d(uVar, 4);
        } else {
            d0 d0VarB = d0.b("Loaded playlist has unexpected type.", null);
            this.f46022k = d0VarB;
            this.f46024m.f46031g.g(uVar, 4, d0VarB, true);
        }
        this.f46024m.f46028d.getClass();
    }

    public final void f(Uri uri) {
        this.i = 0L;
        if (this.f46021j) {
            return;
        }
        m4.n nVar = this.f46015c;
        if (nVar.d() || nVar.c()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f46020h;
        if (jElapsedRealtime >= j10) {
            d(uri);
        } else {
            this.f46021j = true;
            this.f46024m.i.postDelayed(new v0(20, this, uri), j10 - jElapsedRealtime);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0254  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(z3.l r73, i4.u r74) {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.b.g(z3.l, i4.u):void");
    }

    @Override // m4.i
    public final com.google.android.gms.internal.ads.o i(m4.k kVar, long j10, long j11, IOException iOException, int i) {
        m4.q qVar = (m4.q) kVar;
        long j12 = qVar.f28674b;
        int i10 = qVar.f28676d;
        p3.l lVar = qVar.f28675c;
        c0 c0Var = qVar.f28677e;
        Uri uri = c0Var.f31133d;
        u uVar = new u(lVar, uri, c0Var.f31134e, j10, j11, c0Var.f31132c);
        boolean z5 = uri.getQueryParameter("_HLS_msn") != null;
        boolean z10 = iOException instanceof q;
        com.google.android.gms.internal.ads.o oVar = m4.n.f28669f;
        c cVar = this.f46024m;
        if (z5 || z10) {
            int i11 = iOException instanceof w ? ((w) iOException).f31206d : Integer.MAX_VALUE;
            if (z10 || i11 == 400 || i11 == 503) {
                this.f46020h = SystemClock.elapsedRealtime();
                c(false);
                i0 i0Var = cVar.f46031g;
                String str = z.f28608a;
                i0Var.g(uVar, i10, iOException, true);
                return oVar;
            }
        }
        e0 e0Var = new e0(iOException, i, 14);
        Iterator it = cVar.f46030f.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= !((t) it.next()).c(this.f46014b, e0Var, false);
        }
        le.a aVar = cVar.f46028d;
        if (z11) {
            aVar.getClass();
            long jG = le.a.g(e0Var);
            oVar = jG != -9223372036854775807L ? new com.google.android.gms.internal.ads.o(0, jG, false) : m4.n.f28670g;
        }
        boolean zA = oVar.a();
        cVar.f46031g.g(uVar, i10, iOException, !zA);
        if (!zA) {
            aVar.getClass();
        }
        return oVar;
    }

    @Override // m4.i
    public final void m(m4.k kVar, long j10, long j11, boolean z5) {
        m4.q qVar = (m4.q) kVar;
        long j12 = qVar.f28674b;
        p3.l lVar = qVar.f28675c;
        c0 c0Var = qVar.f28677e;
        u uVar = new u(lVar, c0Var.f31133d, c0Var.f31134e, j10, j11, c0Var.f31132c);
        c cVar = this.f46024m;
        cVar.f46028d.getClass();
        cVar.f46031g.c(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // m4.i
    public final void o(m4.k kVar, long j10, long j11, int i) {
        u uVar;
        m4.q qVar = (m4.q) kVar;
        if (i == 0) {
            long j12 = qVar.f28674b;
            uVar = new u(j10, qVar.f28675c);
        } else {
            long j13 = qVar.f28674b;
            p3.l lVar = qVar.f28675c;
            c0 c0Var = qVar.f28677e;
            uVar = new u(lVar, c0Var.f31133d, c0Var.f31134e, j10, j11, c0Var.f31132c);
        }
        this.f46024m.f46031g.h(uVar, qVar.f28676d, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }
}
