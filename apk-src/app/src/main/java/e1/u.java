package e1;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements j1.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f15997c;

    public /* synthetic */ u(x xVar, int i) {
        this.f15996b = i;
        this.f15997c = xVar;
    }

    @Override // j1.i
    public final Object m(final j1.h hVar) {
        switch (this.f15996b) {
            case 0:
                final x xVar = this.f15997c;
                final int i = 0;
                xVar.f16007e.i.execute(new Runnable() { // from class: e1.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                hVar.b(xVar.f16005c);
                                break;
                            default:
                                final x xVar2 = xVar;
                                c0 c0Var = xVar2.f16007e;
                                z0.b bVar = xVar2.f16005c;
                                z0.b bVar2 = z0.b.f45782b;
                                j1.h hVar2 = hVar;
                                if (bVar == bVar2) {
                                    final ed.d dVarA = c0Var.a();
                                    k0.j.g(dVarA, hVar2);
                                    final int i10 = 0;
                                    hVar2.a(new Runnable() { // from class: e1.w
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i10) {
                                                case 0:
                                                    x xVar3 = xVar2;
                                                    xVar3.getClass();
                                                    ed.d dVar = dVarA;
                                                    if (!dVar.cancel(true)) {
                                                        f2.g.h(null, dVar.isDone());
                                                        try {
                                                            ((t) dVar.get()).a();
                                                        } catch (InterruptedException | CancellationException | ExecutionException e3) {
                                                            com.google.android.gms.internal.auth.g.O(xVar3.f16007e.f15917a, "Unable to cancel the input buffer: " + e3);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    xVar2.f16006d.remove(dVarA);
                                                    break;
                                            }
                                        }
                                    }, hl.d.j());
                                    xVar2.f16006d.add(dVarA);
                                    final int i11 = 1;
                                    dVarA.a(new Runnable() { // from class: e1.w
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i11) {
                                                case 0:
                                                    x xVar3 = xVar2;
                                                    xVar3.getClass();
                                                    ed.d dVar = dVarA;
                                                    if (!dVar.cancel(true)) {
                                                        f2.g.h(null, dVar.isDone());
                                                        try {
                                                            ((t) dVar.get()).a();
                                                        } catch (InterruptedException | CancellationException | ExecutionException e3) {
                                                            com.google.android.gms.internal.auth.g.O(xVar3.f16007e.f15917a, "Unable to cancel the input buffer: " + e3);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    xVar2.f16006d.remove(dVarA);
                                                    break;
                                            }
                                        }
                                    }, c0Var.i);
                                } else if (bVar != z0.b.f45783c) {
                                    hVar2.d(new IllegalStateException("Unknown state: " + xVar2.f16005c));
                                } else {
                                    hVar2.d(new IllegalStateException("BufferProvider is not active."));
                                }
                                break;
                        }
                    }
                });
                return "fetchData";
            default:
                final x xVar2 = this.f15997c;
                final int i10 = 1;
                xVar2.f16007e.i.execute(new Runnable() { // from class: e1.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                hVar.b(xVar2.f16005c);
                                break;
                            default:
                                final x xVar22 = xVar2;
                                c0 c0Var = xVar22.f16007e;
                                z0.b bVar = xVar22.f16005c;
                                z0.b bVar2 = z0.b.f45782b;
                                j1.h hVar2 = hVar;
                                if (bVar == bVar2) {
                                    final ed.d dVarA = c0Var.a();
                                    k0.j.g(dVarA, hVar2);
                                    final int i102 = 0;
                                    hVar2.a(new Runnable() { // from class: e1.w
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i102) {
                                                case 0:
                                                    x xVar3 = xVar22;
                                                    xVar3.getClass();
                                                    ed.d dVar = dVarA;
                                                    if (!dVar.cancel(true)) {
                                                        f2.g.h(null, dVar.isDone());
                                                        try {
                                                            ((t) dVar.get()).a();
                                                        } catch (InterruptedException | CancellationException | ExecutionException e3) {
                                                            com.google.android.gms.internal.auth.g.O(xVar3.f16007e.f15917a, "Unable to cancel the input buffer: " + e3);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    xVar22.f16006d.remove(dVarA);
                                                    break;
                                            }
                                        }
                                    }, hl.d.j());
                                    xVar22.f16006d.add(dVarA);
                                    final int i11 = 1;
                                    dVarA.a(new Runnable() { // from class: e1.w
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i11) {
                                                case 0:
                                                    x xVar3 = xVar22;
                                                    xVar3.getClass();
                                                    ed.d dVar = dVarA;
                                                    if (!dVar.cancel(true)) {
                                                        f2.g.h(null, dVar.isDone());
                                                        try {
                                                            ((t) dVar.get()).a();
                                                        } catch (InterruptedException | CancellationException | ExecutionException e3) {
                                                            com.google.android.gms.internal.auth.g.O(xVar3.f16007e.f15917a, "Unable to cancel the input buffer: " + e3);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    xVar22.f16006d.remove(dVarA);
                                                    break;
                                            }
                                        }
                                    }, c0Var.i);
                                } else if (bVar != z0.b.f45783c) {
                                    hVar2.d(new IllegalStateException("Unknown state: " + xVar22.f16005c));
                                } else {
                                    hVar2.d(new IllegalStateException("BufferProvider is not active."));
                                }
                                break;
                        }
                    }
                });
                return "acquireBuffer";
        }
    }
}
