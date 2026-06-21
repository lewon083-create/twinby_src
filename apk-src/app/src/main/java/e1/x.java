package e1;

import g0.s1;
import g0.t1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements k, t1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f16004b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z0.b f16005c = z0.b.f45783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f16006d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c0 f16007e;

    public x(c0 c0Var) {
        this.f16007e = c0Var;
    }

    @Override // g0.t1
    public final ed.d A() {
        return i0.o.w(new u(this, 0));
    }

    @Override // g0.t1
    public final void J(Executor executor, s1 s1Var) {
        this.f16007e.i.execute(new a1.c(this, s1Var, executor));
    }

    public final void a(boolean z5) {
        z0.b bVar = z0.b.f45783c;
        z0.b bVar2 = z5 ? z0.b.f45782b : bVar;
        if (this.f16005c == bVar2) {
            return;
        }
        this.f16005c = bVar2;
        if (bVar2 == bVar) {
            ArrayList arrayList = this.f16006d;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ed.d) it.next()).cancel(true);
            }
            arrayList.clear();
        }
        for (Map.Entry entry : this.f16004b.entrySet()) {
            try {
                ((Executor) entry.getValue()).execute(new a0.d(26, entry, bVar2));
            } catch (RejectedExecutionException e3) {
                com.google.android.gms.internal.auth.g.l(this.f16007e.f15917a, "Unable to post to the supplied executor.", e3);
            }
        }
    }

    @Override // g0.t1
    public final void v(s1 s1Var) {
        this.f16007e.i.execute(new a0.d(27, this, s1Var));
    }
}
