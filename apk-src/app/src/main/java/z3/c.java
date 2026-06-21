package z3;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import i4.i0;
import i4.u;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.sentry.TransactionOptions;
import j3.c0;
import j3.d0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import m3.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements m4.i {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final yf.a f46025p = new yf.a(6);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m4.d f46026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f46027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final le.a f46028d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i0 f46031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m4.n f46032h;
    public Handler i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public y3.l f46033j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public o f46034k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Uri f46035l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public l f46036m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f46037n;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArrayList f46030f = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f46029e = new HashMap();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f46038o = -9223372036854775807L;

    public c(m4.d dVar, le.a aVar, s sVar) {
        this.f46026b = dVar;
        this.f46027c = sVar;
        this.f46028d = aVar;
    }

    public final l a(boolean z5, Uri uri) {
        HashMap map = this.f46029e;
        l lVar = ((b) map.get(uri)).f46017e;
        if (lVar != null && z5) {
            if (!uri.equals(this.f46035l)) {
                List list = this.f46034k.f46133e;
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        break;
                    }
                    if (uri.equals(((n) list.get(i)).f46125a)) {
                        l lVar2 = this.f46036m;
                        if (lVar2 == null || !lVar2.f46113o) {
                            this.f46035l = uri;
                            b bVar = (b) map.get(uri);
                            l lVar3 = bVar.f46017e;
                            if (lVar3 == null || !lVar3.f46113o) {
                                bVar.f(b(uri));
                            } else {
                                this.f46036m = lVar3;
                                this.f46033j.y(lVar3);
                            }
                        }
                    } else {
                        i++;
                    }
                }
            }
            b bVar2 = (b) map.get(uri);
            l lVar4 = bVar2.f46017e;
            if (!bVar2.f46023l) {
                bVar2.f46023l = true;
                if (lVar4 != null && !lVar4.f46113o) {
                    bVar2.c(true);
                }
            }
        }
        return lVar;
    }

    public final Uri b(Uri uri) {
        h hVar;
        l lVar = this.f46036m;
        if (lVar == null || !lVar.f46120v.f46102e || (hVar = (h) lVar.f46118t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(hVar.f46084b));
        int i = hVar.f46085c;
        if (i != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return builderBuildUpon.build();
    }

    public final boolean c(Uri uri) {
        int i;
        b bVar = (b) this.f46029e.get(uri);
        if (bVar.f46017e == null) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMax = Math.max(TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, z.Z(bVar.f46017e.f46119u));
        l lVar = bVar.f46017e;
        return lVar.f46113o || (i = lVar.f46103d) == 2 || i == 1 || bVar.f46018f + jMax > jElapsedRealtime;
    }

    @Override // m4.i
    public final void e(m4.k kVar, long j10, long j11) {
        o oVar;
        m4.q qVar = (m4.q) kVar;
        p pVar = (p) qVar.f28679g;
        boolean z5 = pVar instanceof l;
        if (z5) {
            String str = pVar.f46139a;
            o oVar2 = o.f46131l;
            Uri uri = Uri.parse(str);
            j3.n nVar = new j3.n();
            nVar.f26281a = CommonUrlParts.Values.FALSE_INTEGER;
            nVar.f26291l = c0.n("application/x-mpegURL");
            List listSingletonList = Collections.singletonList(new n(uri, new j3.o(nVar), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            oVar = new o("", list, listSingletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            oVar = (o) pVar;
        }
        this.f46034k = oVar;
        this.f46035l = ((n) oVar.f46133e.get(0)).f46125a;
        this.f46030f.add(new a(this));
        List list2 = oVar.f46132d;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            Uri uri2 = (Uri) list2.get(i);
            this.f46029e.put(uri2, new b(this, uri2));
        }
        p3.l lVar = qVar.f28675c;
        p3.c0 c0Var = qVar.f28677e;
        u uVar = new u(lVar, c0Var.f31133d, c0Var.f31134e, j10, j11, c0Var.f31132c);
        b bVar = (b) this.f46029e.get(this.f46035l);
        if (z5) {
            bVar.g((l) pVar, uVar);
        } else {
            bVar.c(false);
        }
        this.f46028d.getClass();
        this.f46031g.d(uVar, 4);
    }

    @Override // m4.i
    public final com.google.android.gms.internal.ads.o i(m4.k kVar, long j10, long j11, IOException iOException, int i) {
        long jMin;
        m4.q qVar = (m4.q) kVar;
        long j12 = qVar.f28674b;
        p3.l lVar = qVar.f28675c;
        p3.c0 c0Var = qVar.f28677e;
        u uVar = new u(lVar, c0Var.f31133d, c0Var.f31134e, j10, j11, c0Var.f31132c);
        int i10 = qVar.f28676d;
        this.f46028d.getClass();
        Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = Math.min((i - 1) * 1000, 5000);
                break;
            }
            if ((cause instanceof d0) || (cause instanceof FileNotFoundException) || (cause instanceof p3.t) || (cause instanceof m4.m) || ((cause instanceof p3.i) && ((p3.i) cause).f31158b == 2008)) {
                break;
            }
            cause = cause.getCause();
        }
        jMin = -9223372036854775807L;
        boolean z5 = jMin == -9223372036854775807L;
        this.f46031g.g(uVar, i10, iOException, z5);
        return z5 ? m4.n.f28670g : new com.google.android.gms.internal.ads.o(0, jMin, false);
    }

    @Override // m4.i
    public final void m(m4.k kVar, long j10, long j11, boolean z5) {
        m4.q qVar = (m4.q) kVar;
        long j12 = qVar.f28674b;
        p3.l lVar = qVar.f28675c;
        p3.c0 c0Var = qVar.f28677e;
        u uVar = new u(lVar, c0Var.f31133d, c0Var.f31134e, j10, j11, c0Var.f31132c);
        this.f46028d.getClass();
        this.f46031g.c(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
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
            p3.c0 c0Var = qVar.f28677e;
            uVar = new u(lVar, c0Var.f31133d, c0Var.f31134e, j10, j11, c0Var.f31132c);
        }
        this.f46031g.h(uVar, qVar.f28676d, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }
}
