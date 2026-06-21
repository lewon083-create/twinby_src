package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import j0.g;
import pa.c0;
import qa.a;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class SignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new com.google.android.material.datepicker.a(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GoogleSignInAccount f2616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2617d;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f2616c = googleSignInAccount;
        c0.g(str, "8.3 and 8.4 SDKs require non-null email");
        this.f2615b = str;
        c0.g(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.f2617d = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = g.i0(parcel, 20293);
        g.b0(parcel, 4, this.f2615b);
        g.a0(parcel, 7, this.f2616c, i);
        g.b0(parcel, 8, this.f2617d);
        g.m0(parcel, iI0);
    }
}
