package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class mp extends ug {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jx f7964b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mp(np npVar, jx jxVar) {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
        this.f7964b = jxVar;
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) vg.b(parcel, ParcelFileDescriptor.CREATOR);
        vg.f(parcel);
        this.f7964b.b(parcelFileDescriptor);
        return true;
    }
}
