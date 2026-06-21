package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends qa.a {
    public static final Parcelable.Creator<x> CREATOR = new com.google.android.material.datepicker.a(3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f14895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h1.e f14896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w f14897d;

    public x(Bundle bundle) {
        this.f14895b = bundle;
    }

    public final Map c() {
        if (this.f14896c == null) {
            h1.e eVar = new h1.e(0);
            Bundle bundle = this.f14895b;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        eVar.put(str, str2);
                    }
                }
            }
            this.f14896c = eVar;
        }
        return this.f14896c;
    }

    public final String e() {
        Bundle bundle = this.f14895b;
        String string = bundle.getString("google.message_id");
        return string == null ? bundle.getString("message_id") : string;
    }

    public final w f() {
        if (this.f14897d == null) {
            Bundle bundle = this.f14895b;
            if (fe.c.G(bundle)) {
                this.f14897d = new w(new fe.c(bundle));
            }
        }
        return this.f14897d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.V(parcel, 2, this.f14895b);
        j0.g.m0(parcel, iI0);
    }
}
