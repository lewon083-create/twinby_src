package m4;

import ad.b1;
import ad.g1;
import ad.j0;
import android.content.Context;
import io.appmetrica.analytics.impl.lp;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import m3.t;
import p3.e0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements e, e0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b1 f28638p = j0.v(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b1 f28639q = j0.v(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b1 f28640r = j0.v(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b1 f28641s = j0.v(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b1 f28642t = j0.v(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final b1 f28643u = j0.v(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static h f28644v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f28645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g1 f28646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f28647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f28648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f28649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s f28650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f28651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f28652h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f28653j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f28654k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f28655l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f28656m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f28657n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f28658o;

    public h(Context context, HashMap map) {
        boolean z5;
        t tVar = t.f28598a;
        this.f28645a = context == null ? null : context.getApplicationContext();
        this.f28646b = g1.a(map);
        this.f28647c = new d(0);
        this.f28650f = new s();
        this.f28648d = tVar;
        this.f28649e = true;
        if (context == null) {
            this.f28657n = 0;
            this.f28655l = 1000000L;
            return;
        }
        m3.o oVarA = m3.o.a(context);
        int iB = oVarA.b();
        this.f28657n = iB;
        this.f28655l = a(iB);
        g gVar = new g(this);
        Executor executorG = m3.b.g();
        CopyOnWriteArrayList<m3.n> copyOnWriteArrayList = oVarA.f28581b;
        for (m3.n nVar : copyOnWriteArrayList) {
            if (nVar.f28576a.get() == null) {
                copyOnWriteArrayList.remove(nVar);
            }
        }
        m3.n nVar2 = new m3.n(oVarA, gVar, executorG);
        synchronized (oVarA.f28582c) {
            oVarA.f28581b.add(nVar2);
            z5 = oVarA.f28584e;
        }
        if (z5) {
            nVar2.f28577b.execute(new lp(12, nVar2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:1149:0x1225  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(int r18) {
        /*
            Method dump skipped, instruction units count: 8770
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.h.a(int):long");
    }

    public final void b(int i, long j10, long j11) {
        int i10;
        long j12;
        long j13;
        if (i == 0 && j10 == 0 && j11 == this.f28656m) {
            return;
        }
        this.f28656m = j11;
        for (c cVar : (CopyOnWriteArrayList) this.f28647c.f28630b) {
            if (cVar.f28629c) {
                i10 = i;
                j12 = j10;
                j13 = j11;
            } else {
                i10 = i;
                j12 = j10;
                j13 = j11;
                cVar.f28627a.post(new b(cVar, i10, j12, j13, 0));
            }
            i = i10;
            j10 = j12;
            j11 = j13;
        }
    }
}
