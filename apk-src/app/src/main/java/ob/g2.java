package ob;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f30129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k2 f30130d;

    public /* synthetic */ g2(k2 k2Var, AtomicReference atomicReference, int i, boolean z5) {
        this.f30128b = i;
        this.f30130d = k2Var;
        this.f30129c = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30128b) {
            case 0:
                AtomicReference atomicReference = this.f30129c;
                synchronized (atomicReference) {
                    try {
                        try {
                            l1 l1Var = (l1) this.f30130d.f15951b;
                            atomicReference.set(Long.valueOf(l1Var.f30263e.J(l1Var.q().I(), d0.f30003c0)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                AtomicReference atomicReference2 = this.f30129c;
                synchronized (atomicReference2) {
                    try {
                        try {
                            l1 l1Var2 = (l1) this.f30130d.f15951b;
                            atomicReference2.set(Double.valueOf(l1Var2.f30263e.L(l1Var2.q().I(), d0.f30009e0)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 2:
                k2 k2Var = this.f30130d;
                z0 z0Var = ((l1) k2Var.f15951b).f30264f;
                l1.h(z0Var);
                Bundle bundleN = z0Var.f30589o.N();
                d3 d3VarN = ((l1) k2Var.f15951b).n();
                AtomicReference atomicReference3 = this.f30129c;
                d3VarN.C();
                d3VarN.D();
                d3VarN.Q(new aa.b(d3VarN, atomicReference3, d3VarN.S(false), bundleN, 16));
                return;
            default:
                d3 d3VarN2 = ((l1) this.f30130d.f15951b).n();
                s3 s3VarA = s3.a(q2.SGTM_CLIENT);
                AtomicReference atomicReference4 = this.f30129c;
                d3VarN2.C();
                d3VarN2.D();
                d3VarN2.Q(new aa.b(d3VarN2, atomicReference4, d3VarN2.S(false), s3VarA, 17));
                return;
        }
    }

    public g2(k2 k2Var, AtomicReference atomicReference, int i) {
        this.f30128b = i;
        switch (i) {
            case 1:
                this.f30129c = atomicReference;
                Objects.requireNonNull(k2Var);
                this.f30130d = k2Var;
                break;
            default:
                this.f30129c = atomicReference;
                Objects.requireNonNull(k2Var);
                this.f30130d = k2Var;
                break;
        }
    }
}
