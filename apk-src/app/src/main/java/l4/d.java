package l4;

import android.hardware.camera2.CameraDevice;
import g0.a1;
import g0.z0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import t.h2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements m, j1.i, k0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f27832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f27833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f27834e;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f27831b = obj;
        this.f27832c = obj2;
        this.f27833d = obj3;
        this.f27834e = obj4;
    }

    @Override // k0.a
    public ed.d apply(Object obj) {
        h2 h2Var = (h2) this.f27831b;
        CameraDevice cameraDevice = (CameraDevice) this.f27832c;
        v.s sVar = (v.s) this.f27833d;
        List list = (List) this.f27834e;
        if (h2Var.f33101v.f16748a) {
            Iterator it = h2Var.f33082b.l().iterator();
            while (it.hasNext()) {
                ((h2) it.next()).i();
            }
        }
        h2Var.k("start openCaptureSession");
        synchronized (h2Var.f33081a) {
            try {
                if (h2Var.f33092m) {
                    return new k0.l(1, new CancellationException("Opener is disabled"));
                }
                q9.o oVar = h2Var.f33082b;
                synchronized (oVar.f31947b) {
                    ((LinkedHashSet) oVar.f31950e).add(h2Var);
                }
                j1.k kVarW = i0.o.w(new d(h2Var, list, new m7.a(cameraDevice, h2Var.f33083c), sVar));
                h2Var.f33088h = kVarW;
                k0.j.a(kVarW, new ni.i(12, h2Var), hl.d.j());
                return k0.j.f(h2Var.f33088h);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
    @Override // l4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ad.b1 d(int r17, j3.p0 r18, int[] r19) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.d.d(int, j3.p0, int[]):ad.b1");
    }

    @Override // j1.i
    public Object m(j1.h hVar) {
        String str;
        h2 h2Var = (h2) this.f27831b;
        List list = (List) this.f27832c;
        m7.a aVar = (m7.a) this.f27833d;
        v.s sVar = (v.s) this.f27834e;
        synchronized (h2Var.f33081a) {
            synchronized (h2Var.f33081a) {
                synchronized (h2Var.f33081a) {
                    try {
                        List list2 = h2Var.f33090k;
                        if (list2 != null) {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                ((a1) it.next()).b();
                            }
                            h2Var.f33090k = null;
                        }
                    } finally {
                    }
                }
                if (!list.isEmpty()) {
                    int i = 0;
                    do {
                        try {
                            ((a1) list.get(i)).d();
                            i++;
                        } catch (z0 e3) {
                            for (int i10 = i - 1; i10 >= 0; i10--) {
                                ((a1) list.get(i10)).b();
                            }
                            throw e3;
                        }
                    } while (i < list.size());
                }
                h2Var.f33090k = list;
            }
            f2.g.h("The openCaptureSessionCompleter can only set once!", h2Var.i == null);
            h2Var.i = hVar;
            ((u.k) aVar.f28696c).h(sVar);
            str = "openCaptureSession[session=" + h2Var + "]";
        }
        return str;
    }
}
