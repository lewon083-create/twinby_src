package i0;

import androidx.lifecycle.c0;
import androidx.lifecycle.d0;
import com.google.android.gms.internal.measurement.b4;
import e1.y;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends d0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public o.f f20807n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f20808o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hf.a f20809p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public d0 f20810q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f20811r;

    public p(Object obj) {
        hf.a mapFunction = new hf.a(25);
        Intrinsics.checkNotNullParameter(mapFunction, "mapFunction");
        this.f20807n = new o.f();
        this.f20808o = obj;
        this.f20809p = mapFunction;
        this.f20811r = obj;
    }

    @Override // androidx.lifecycle.d0
    public final Object d() {
        d0 d0Var = this.f20810q;
        if (d0Var == null) {
            return this.f20808o;
        }
        Object objD = d0Var.d();
        this.f20809p.getClass();
        return objD;
    }

    @Override // androidx.lifecycle.d0
    public final void g() {
        Iterator it = this.f20807n.iterator();
        while (true) {
            o.b bVar = (o.b) it;
            if (!bVar.hasNext()) {
                return;
            }
            c0 c0Var = (c0) ((Map.Entry) bVar.next()).getValue();
            c0Var.f1542a.f(c0Var);
        }
    }

    @Override // androidx.lifecycle.d0
    public final void h() {
        Iterator it = this.f20807n.iterator();
        while (true) {
            o.b bVar = (o.b) it;
            if (!bVar.hasNext()) {
                return;
            }
            c0 c0Var = (c0) ((Map.Entry) bVar.next()).getValue();
            c0Var.f1542a.j(c0Var);
        }
    }

    public final void l(d0 liveDataSource) {
        c0 c0Var;
        Intrinsics.checkNotNullParameter(liveDataSource, "liveDataSource");
        d0 d0Var = this.f20810q;
        if (d0Var != null && (c0Var = (c0) this.f20807n.c(d0Var)) != null) {
            c0Var.f1542a.j(c0Var);
        }
        this.f20810q = liveDataSource;
        b4.G(new y(25, this, liveDataSource));
    }
}
