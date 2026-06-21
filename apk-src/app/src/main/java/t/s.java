package t;

import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements j1.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f33275c;

    public /* synthetic */ s(c0 c0Var, int i) {
        this.f33274b = i;
        this.f33275c = c0Var;
    }

    @Override // j1.i
    public Object m(final j1.h hVar) {
        switch (this.f33274b) {
            case 0:
                final c0 c0Var = this.f33275c;
                final int i = 0;
                c0Var.f32969d.execute(new Runnable() { // from class: t.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        bb.e eVar;
                        switch (i) {
                            case 0:
                                c0 c0Var2 = c0Var;
                                j1.h hVar2 = hVar;
                                if (c0Var2.f32979o == null) {
                                    if (c0Var2.M != 1) {
                                        c0Var2.f32979o = i0.o.w(new s(c0Var2, 3));
                                    } else {
                                        c0Var2.f32979o = k0.l.f26777d;
                                    }
                                }
                                ed.d dVar = c0Var2.f32979o;
                                switch (z.m(c0Var2.M)) {
                                    case 1:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                        if (!c0Var2.i.a() && ((eVar = (bb.e) c0Var2.L.f32188c) == null || ((AtomicBoolean) eVar.f2020d).get())) {
                                            z = false;
                                        }
                                        c0Var2.L.o();
                                        c0Var2.F(2);
                                        if (z) {
                                            f2.g.h(null, c0Var2.f32981q.isEmpty());
                                            c0Var2.t();
                                        }
                                        break;
                                    case 2:
                                    case 3:
                                    case 4:
                                        f2.g.h(null, c0Var2.f32975k == null);
                                        c0Var2.F(2);
                                        f2.g.h(null, c0Var2.f32981q.isEmpty());
                                        c0Var2.t();
                                        break;
                                    case 9:
                                    case 10:
                                        c0Var2.F(2);
                                        c0Var2.s();
                                        break;
                                    default:
                                        c0Var2.v("release() ignored due to being in state: ".concat(z.n(c0Var2.M)), null);
                                        break;
                                }
                                k0.j.g(dVar, hVar2);
                                break;
                            default:
                                c0 c0Var3 = c0Var;
                                j1.h hVar3 = hVar;
                                x1 x1Var = c0Var3.B;
                                hVar3.b(Boolean.valueOf(x1Var == null ? false : c0Var3.f32967b.N(c0.y(x1Var))));
                                break;
                        }
                    }
                });
                return "Release[request=" + c0Var.f32978n.getAndIncrement() + "]";
            case 1:
                c0 c0Var2 = this.f33275c;
                try {
                    ArrayList arrayList = new ArrayList(c0Var2.f32967b.A().b().f19585c);
                    arrayList.add((b1) c0Var2.C.f31951f);
                    arrayList.add(new v(c0Var2, hVar));
                    c0Var2.f32968c.f33976a.D(c0Var2.f32974j.f33002a, c0Var2.f32969d, hl.l.h(arrayList));
                    return "configAndCloseTask";
                } catch (RuntimeException | u.a e3) {
                    c0Var2.v("Unable to open camera for configAndClose: " + e3.getMessage(), e3);
                    hVar.d(e3);
                    return "configAndCloseTask";
                }
            case 2:
            default:
                final c0 c0Var3 = this.f33275c;
                try {
                    final int i10 = 1;
                    c0Var3.f32969d.execute(new Runnable() { // from class: t.u
                        @Override // java.lang.Runnable
                        public final void run() {
                            bb.e eVar;
                            switch (i10) {
                                case 0:
                                    c0 c0Var22 = c0Var3;
                                    j1.h hVar2 = hVar;
                                    if (c0Var22.f32979o == null) {
                                        if (c0Var22.M != 1) {
                                            c0Var22.f32979o = i0.o.w(new s(c0Var22, 3));
                                        } else {
                                            c0Var22.f32979o = k0.l.f26777d;
                                        }
                                    }
                                    ed.d dVar = c0Var22.f32979o;
                                    switch (z.m(c0Var22.M)) {
                                        case 1:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                            if (!c0Var22.i.a() && ((eVar = (bb.e) c0Var22.L.f32188c) == null || ((AtomicBoolean) eVar.f2020d).get())) {
                                                z = false;
                                            }
                                            c0Var22.L.o();
                                            c0Var22.F(2);
                                            if (z) {
                                                f2.g.h(null, c0Var22.f32981q.isEmpty());
                                                c0Var22.t();
                                            }
                                            break;
                                        case 2:
                                        case 3:
                                        case 4:
                                            f2.g.h(null, c0Var22.f32975k == null);
                                            c0Var22.F(2);
                                            f2.g.h(null, c0Var22.f32981q.isEmpty());
                                            c0Var22.t();
                                            break;
                                        case 9:
                                        case 10:
                                            c0Var22.F(2);
                                            c0Var22.s();
                                            break;
                                        default:
                                            c0Var22.v("release() ignored due to being in state: ".concat(z.n(c0Var22.M)), null);
                                            break;
                                    }
                                    k0.j.g(dVar, hVar2);
                                    break;
                                default:
                                    c0 c0Var32 = c0Var3;
                                    j1.h hVar3 = hVar;
                                    x1 x1Var = c0Var32.B;
                                    hVar3.b(Boolean.valueOf(x1Var == null ? false : c0Var32.f32967b.N(c0.y(x1Var))));
                                    break;
                            }
                        }
                    });
                    return "isMeteringRepeatingAttached";
                } catch (RejectedExecutionException unused) {
                    hVar.d(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
                    return "isMeteringRepeatingAttached";
                }
            case 3:
                c0 c0Var4 = this.f33275c;
                f2.g.h("Camera can only be released once, so release completer should be null on creation.", c0Var4.f32980p == null);
                c0Var4.f32980p = hVar;
                return "Release[camera=" + c0Var4 + "]";
        }
    }
}
