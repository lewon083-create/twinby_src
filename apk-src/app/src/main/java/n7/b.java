package n7;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.b30;
import com.google.android.gms.internal.ads.om1;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k0.i;
import l7.n;
import m7.d;
import m7.l;
import q7.c;
import u7.j;
import v7.h;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements d, q7.b, m7.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f29165j = n.i("GreedyScheduler");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f29166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f29167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f29168d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f29170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f29171g;
    public Boolean i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f29169e = new HashSet();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f29172h = new Object();

    public b(Context context, b30 b30Var, x7.b bVar, l lVar) {
        this.f29166b = context;
        this.f29167c = lVar;
        this.f29168d = new c(context, bVar, this);
        this.f29170f = new a(this, (m7.a) b30Var.f3574h);
    }

    @Override // m7.d
    public final void a(j... jVarArr) {
        if (this.i == null) {
            this.i = Boolean.valueOf(h.a(this.f29166b, this.f29167c.f28731c));
        }
        if (!this.i.booleanValue()) {
            n.g().h(f29165j, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.f29171g) {
            this.f29167c.f28735g.a(this);
            this.f29171g = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (j jVar : jVarArr) {
            long jA = jVar.a();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jVar.f34331b == 1) {
                if (jCurrentTimeMillis < jA) {
                    a aVar = this.f29170f;
                    if (aVar != null) {
                        m7.a aVar2 = aVar.f29163b;
                        HashMap map = aVar.f29164c;
                        Runnable runnable = (Runnable) map.remove(jVar.f34330a);
                        if (runnable != null) {
                            ((Handler) aVar2.f28696c).removeCallbacks(runnable);
                        }
                        i iVar = new i(16, aVar, jVar, false);
                        map.put(jVar.f34330a, iVar);
                        ((Handler) aVar2.f28696c).postDelayed(iVar, jVar.a() - System.currentTimeMillis());
                    }
                } else if (jVar.b()) {
                    l7.c cVar = jVar.f34338j;
                    if (cVar.f28013c) {
                        n.g().e(f29165j, "Ignoring WorkSpec " + jVar + ", Requires device idle.", new Throwable[0]);
                    } else if (cVar.f28018h.f28021a.size() > 0) {
                        n.g().e(f29165j, "Ignoring WorkSpec " + jVar + ", Requires ContentUri triggers.", new Throwable[0]);
                    } else {
                        hashSet.add(jVar);
                        hashSet2.add(jVar.f34330a);
                    }
                } else {
                    n.g().e(f29165j, om1.k("Starting work for ", jVar.f34330a), new Throwable[0]);
                    this.f29167c.S(jVar.f34330a, null);
                }
            }
        }
        synchronized (this.f29172h) {
            try {
                if (!hashSet.isEmpty()) {
                    n.g().e(f29165j, "Starting tracking for [" + TextUtils.join(StringUtils.COMMA, hashSet2) + "]", new Throwable[0]);
                    this.f29169e.addAll(hashSet);
                    this.f29168d.b(this.f29169e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // m7.d
    public final boolean b() {
        return false;
    }

    @Override // m7.b
    public final void c(String str, boolean z5) {
        synchronized (this.f29172h) {
            try {
                Iterator it = this.f29169e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    j jVar = (j) it.next();
                    if (jVar.f34330a.equals(str)) {
                        n.g().e(f29165j, "Stopping tracking for " + str, new Throwable[0]);
                        this.f29169e.remove(jVar);
                        this.f29168d.b(this.f29169e);
                        break;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // m7.d
    public final void d(String str) {
        Runnable runnable;
        Boolean bool = this.i;
        l lVar = this.f29167c;
        if (bool == null) {
            this.i = Boolean.valueOf(h.a(this.f29166b, lVar.f28731c));
        }
        boolean zBooleanValue = this.i.booleanValue();
        String str2 = f29165j;
        if (!zBooleanValue) {
            n.g().h(str2, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.f29171g) {
            lVar.f28735g.a(this);
            this.f29171g = true;
        }
        n.g().e(str2, om1.k("Cancelling work ID ", str), new Throwable[0]);
        a aVar = this.f29170f;
        if (aVar != null && (runnable = (Runnable) aVar.f29164c.remove(str)) != null) {
            ((Handler) aVar.f29163b.f28696c).removeCallbacks(runnable);
        }
        lVar.T(str);
    }

    @Override // q7.b
    public final void e(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            n.g().e(f29165j, om1.k("Constraints not met: Cancelling work ID ", str), new Throwable[0]);
            this.f29167c.T(str);
        }
    }

    @Override // q7.b
    public final void f(List list) {
        for (String str : (ArrayList) list) {
            n.g().e(f29165j, om1.k("Constraints met: Scheduling work ID ", str), new Throwable[0]);
            this.f29167c.S(str, null);
        }
    }
}
