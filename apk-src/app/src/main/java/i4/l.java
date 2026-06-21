package i4;

import android.os.Handler;
import com.google.android.gms.internal.measurement.h5;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l extends a {
    public final HashMap i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Handler f20944j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p3.e0 f20945k;

    public abstract void A(Object obj, a aVar, j3.o0 o0Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [i4.d0, i4.i] */
    public final void B(final Object obj, a aVar) {
        HashMap map = this.i;
        h5.h(!map.containsKey(obj));
        ?? r12 = new d0() { // from class: i4.i
            @Override // i4.d0
            public final void a(a aVar2, j3.o0 o0Var) {
                this.f20924a.A(obj, aVar2, o0Var);
            }
        };
        j jVar = new j(this, obj);
        map.put(obj, new k(aVar, r12, jVar));
        Handler handler = this.f20944j;
        handler.getClass();
        aVar.getClass();
        i0 i0Var = aVar.f20828d;
        i0Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = i0Var.f20928c;
        h0 h0Var = new h0();
        h0Var.f20919a = handler;
        h0Var.f20920b = jVar;
        copyOnWriteArrayList.add(h0Var);
        this.f20944j.getClass();
        i0 i0Var2 = aVar.f20829e;
        i0Var2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = i0Var2.f20928c;
        x3.d dVar = new x3.d();
        dVar.f35761a = jVar;
        copyOnWriteArrayList2.add(dVar);
        p3.e0 e0Var = this.f20945k;
        t3.j jVar2 = this.f20832h;
        jVar2.getClass();
        aVar.n(r12, e0Var, jVar2);
        if (this.f20827c.isEmpty()) {
            aVar.c(r12);
        }
    }

    @Override // i4.a
    public final void d() {
        for (k kVar : this.i.values()) {
            kVar.f20938a.c(kVar.f20939b);
        }
    }

    @Override // i4.a
    public final void g() {
        for (k kVar : this.i.values()) {
            kVar.f20938a.f(kVar.f20939b);
        }
    }

    @Override // i4.a
    public void l() {
        Iterator it = this.i.values().iterator();
        while (it.hasNext()) {
            ((k) it.next()).f20938a.l();
        }
    }

    @Override // i4.a
    public void t() {
        HashMap map = this.i;
        for (k kVar : map.values()) {
            a aVar = kVar.f20938a;
            j jVar = kVar.f20940c;
            aVar.s(kVar.f20939b);
            aVar.v(jVar);
            aVar.u(jVar);
        }
        map.clear();
    }

    public abstract c0 x(Object obj, c0 c0Var);

    public long y(long j10, Object obj) {
        return j10;
    }

    public int z(int i, Object obj) {
        return i;
    }
}
