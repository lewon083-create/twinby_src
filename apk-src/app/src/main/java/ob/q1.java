package ob;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g4 f30363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f30364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r1 f30365e;

    public /* synthetic */ q1(r1 r1Var, g4 g4Var, Bundle bundle, int i) {
        this.f30362b = i;
        this.f30363c = g4Var;
        this.f30364d = bundle;
        this.f30365e = r1Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        switch (this.f30362b) {
            case 0:
                r1 r1Var = this.f30365e;
                r1Var.f30382b.B();
                return r1Var.f30382b.c0(this.f30364d, this.f30363c);
            default:
                r1 r1Var2 = this.f30365e;
                r1Var2.f30382b.B();
                return r1Var2.f30382b.c0(this.f30364d, this.f30363c);
        }
    }
}
