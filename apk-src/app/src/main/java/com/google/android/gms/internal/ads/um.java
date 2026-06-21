package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class um extends ug implements en {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable f10982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f10983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f10984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10985e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f10986f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f10987g;

    public um(Drawable drawable, Uri uri, double d10, int i, int i10, HashMap map) {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        this.f10982b = drawable;
        this.f10983c = uri;
        this.f10984d = d10;
        this.f10985e = i;
        this.f10986f = i10;
        this.f10987g = map;
    }

    public static en l4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return iInterfaceQueryLocalInterface instanceof en ? (en) iInterfaceQueryLocalInterface : new dn(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.en
    public final int c() {
        return this.f10986f;
    }

    @Override // com.google.android.gms.internal.ads.en
    public final double g() {
        return this.f10984d;
    }

    @Override // com.google.android.gms.internal.ads.en
    public final int i() {
        return this.f10985e;
    }

    @Override // com.google.android.gms.internal.ads.en
    public final xa.a j() {
        return new xa.b(this.f10982b);
    }

    @Override // com.google.android.gms.internal.ads.en
    public final Map k() {
        return this.f10987g;
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                xa.a aVarJ = j();
                parcel2.writeNoException();
                vg.e(parcel2, aVarJ);
                return true;
            case 2:
                parcel2.writeNoException();
                vg.d(parcel2, this.f10983c);
                return true;
            case 3:
                parcel2.writeNoException();
                parcel2.writeDouble(this.f10984d);
                return true;
            case 4:
                parcel2.writeNoException();
                parcel2.writeInt(this.f10985e);
                return true;
            case 5:
                parcel2.writeNoException();
                parcel2.writeInt(this.f10986f);
                return true;
            case 6:
                parcel2.writeNoException();
                parcel2.writeMap(this.f10987g);
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.en
    public final Uri l() {
        return this.f10983c;
    }
}
