package ob;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v2 extends com.google.android.gms.internal.measurement.x implements i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f30463b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(d3 d3Var, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
        this.f30463b = atomicReference;
    }

    @Override // ob.i0
    public final void G3(List list) {
        AtomicReference atomicReference = this.f30463b;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.measurement.x
    public final boolean c0(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(o3.CREATOR);
        com.google.android.gms.internal.measurement.y.d(parcel);
        G3(arrayListCreateTypedArrayList);
        return true;
    }
}
