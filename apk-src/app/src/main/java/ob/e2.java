package ob;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f30094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k2 f30095d;

    public e2(k2 k2Var, AtomicReference atomicReference, int i) {
        this.f30093b = i;
        switch (i) {
            case 1:
                this.f30094c = atomicReference;
                Objects.requireNonNull(k2Var);
                this.f30095d = k2Var;
                break;
            case 2:
                this.f30094c = atomicReference;
                Objects.requireNonNull(k2Var);
                this.f30095d = k2Var;
                break;
            default:
                this.f30094c = atomicReference;
                Objects.requireNonNull(k2Var);
                this.f30095d = k2Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30093b) {
            case 0:
                AtomicReference atomicReference = this.f30094c;
                synchronized (atomicReference) {
                    try {
                        try {
                            l1 l1Var = (l1) this.f30095d.f15951b;
                            atomicReference.set(Boolean.valueOf(l1Var.f30263e.M(l1Var.q().I(), d0.f29997a0)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                AtomicReference atomicReference2 = this.f30094c;
                synchronized (atomicReference2) {
                    try {
                        try {
                            l1 l1Var2 = (l1) this.f30095d.f15951b;
                            atomicReference2.set(l1Var2.f30263e.I(l1Var2.q().I(), d0.f30000b0));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            default:
                AtomicReference atomicReference3 = this.f30094c;
                synchronized (atomicReference3) {
                    try {
                        try {
                            l1 l1Var3 = (l1) this.f30095d.f15951b;
                            atomicReference3.set(Integer.valueOf(l1Var3.f30263e.K(l1Var3.q().I(), d0.f30006d0)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
        }
    }
}
