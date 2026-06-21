package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ru extends ug {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10066c;

    public ru(String str, int i) {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
        this.f10065b = str;
        this.f10066c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ru)) {
            return false;
        }
        ru ruVar = (ru) obj;
        if (pa.c0.m(this.f10065b, ruVar.f10065b)) {
            if (pa.c0.m(Integer.valueOf(this.f10066c), Integer.valueOf(ruVar.f10066c))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f10065b);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f10066c);
        return true;
    }
}
