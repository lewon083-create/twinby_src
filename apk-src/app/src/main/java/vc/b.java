package vc;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements d, IInterface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IBinder f34833b;

    public b(IBinder iBinder) {
        this.f34833b = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f34833b;
    }
}
