package ob;

import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w2 extends com.google.android.gms.internal.measurement.x implements k0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f30499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d3 f30500c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(d3 d3Var, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
        this.f30499b = atomicReference;
        this.f30500c = d3Var;
    }

    @Override // ob.k0
    public final void V2(t3 t3Var) {
        AtomicReference atomicReference = this.f30499b;
        synchronized (atomicReference) {
            s0 s0Var = ((l1) this.f30500c.f15951b).f30265g;
            l1.k(s0Var);
            s0Var.f30418o.g(Integer.valueOf(t3Var.f30429b.size()), "[sgtm] Got upload batches from service. count");
            atomicReference.set(t3Var);
            atomicReference.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.measurement.x
    public final boolean c0(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        t3 t3Var = (t3) com.google.android.gms.internal.measurement.y.a(parcel, t3.CREATOR);
        com.google.android.gms.internal.measurement.y.d(parcel);
        V2(t3Var);
        return true;
    }
}
