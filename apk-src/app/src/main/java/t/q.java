package t;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f33230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f33231d;

    public /* synthetic */ q(c0 c0Var, ArrayList arrayList, int i) {
        this.f33229b = i;
        this.f33230c = c0Var;
        this.f33231d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        bb.e eVar;
        switch (this.f33229b) {
            case 0:
                c0 c0Var = this.f33230c;
                ArrayList arrayList = this.f33231d;
                o oVar = c0Var.f32973h;
                try {
                    c0Var.I(arrayList);
                    return;
                } finally {
                    oVar.s();
                }
            default:
                c0 c0Var2 = this.f33230c;
                ArrayList<c> arrayList2 = this.f33231d;
                ArrayList arrayList3 = new ArrayList();
                boolean z5 = false;
                for (c cVar : arrayList2) {
                    if (c0Var2.f32967b.N(cVar.f32960a)) {
                        ((LinkedHashMap) c0Var2.f32967b.f324d).remove(cVar.f32960a);
                        arrayList3.add(cVar.f32960a);
                        if (cVar.f32961b == a0.a2.class) {
                            z5 = true;
                        }
                    }
                }
                if (arrayList3.isEmpty()) {
                    return;
                }
                c0Var2.v("Use cases [" + TextUtils.join(", ", arrayList3) + "] now DETACHED for camera", null);
                if (z5) {
                    c0Var2.f32973h.f33178h.f33256e = null;
                }
                c0Var2.r();
                if (c0Var2.f32967b.E().isEmpty()) {
                    o oVar2 = c0Var2.f32973h;
                    p2 p2Var = oVar2.f33182m;
                    boolean z10 = p2Var.f33223d;
                    p2Var.f33223d = false;
                    oVar2.D(false);
                } else {
                    c0Var2.N();
                    c0Var2.M();
                }
                if (!c0Var2.f32967b.C().isEmpty()) {
                    c0Var2.L();
                    c0Var2.E();
                    if (c0Var2.M == 10) {
                        c0Var2.D();
                        return;
                    }
                    return;
                }
                c0Var2.f32973h.s();
                c0Var2.E();
                c0Var2.f32973h.C(false);
                c0Var2.f32977m = c0Var2.B();
                c0Var2.v("Closing camera.", null);
                switch (z.m(c0Var2.M)) {
                    case 3:
                    case 4:
                        f2.g.h(null, c0Var2.f32975k == null);
                        c0Var2.F(3);
                        return;
                    case 5:
                    default:
                        c0Var2.v("close() ignored due to being in state: ".concat(z.n(c0Var2.M)), null);
                        return;
                    case 6:
                    case 7:
                    case 8:
                        if (c0Var2.i.a() || ((eVar = (bb.e) c0Var2.L.f32188c) != null && !((AtomicBoolean) eVar.f2020d).get())) {
                            z = true;
                        }
                        c0Var2.L.o();
                        c0Var2.F(6);
                        if (z) {
                            f2.g.h(null, c0Var2.f32981q.isEmpty());
                            c0Var2.t();
                            return;
                        }
                        return;
                    case 9:
                    case 10:
                        c0Var2.F(6);
                        c0Var2.s();
                        return;
                }
        }
    }
}
