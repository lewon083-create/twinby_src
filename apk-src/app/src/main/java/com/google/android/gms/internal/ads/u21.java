package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u21 extends ug {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ni.i f10795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v21 f10796c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u21(v21 v21Var, ni.i iVar) {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
        this.f10796c = v21Var;
        this.f10795b = iVar;
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        yi0 yi0Var;
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) vg.b(parcel, Bundle.CREATOR);
        vg.f(parcel);
        int i10 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        int i11 = bundle.getInt("uiMode", 0);
        byte b2 = (byte) (((byte) (0 | 1)) | 1);
        if (string == null) {
            string = null;
        }
        byte b10 = (byte) (b2 | 2);
        if (b10 != 3) {
            StringBuilder sb2 = new StringBuilder();
            if ((b10 & 1) == 0) {
                sb2.append(" statusCode");
            }
            if ((b10 & 2) == 0) {
                sb2.append(" uiMode");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
        }
        this.f10795b.E(new r21(i10, string, i11));
        if (i10 == 8157 && (yi0Var = this.f10796c.f11218a) != null) {
            v21.f11216c.a("unbind LMD display overlay service", new Object[0]);
            yi0Var.i(new kr0(12, yi0Var));
        }
        return true;
    }
}
