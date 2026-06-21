package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class jh extends ug implements q9.v0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f6844c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l9.d f6845b;

    public jh(l9.d dVar) {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
        this.f6845b = dVar;
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        vg.f(parcel);
        r0(string, string2);
        parcel2.writeNoException();
        return true;
    }

    @Override // q9.v0
    public final void r0(String str, String str2) {
        this.f6845b.h(str, str2);
    }
}
