package com.google.android.gms.internal.measurement;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends x implements n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ob.b3 f13712b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(a1 a1Var, ob.b3 b3Var) {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
        this.f13712b = b3Var;
    }

    @Override // com.google.android.gms.internal.measurement.x
    public final boolean c0(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        i();
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.n0
    public final void i() {
        this.f13712b.run();
    }
}
