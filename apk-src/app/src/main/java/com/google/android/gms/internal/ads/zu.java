package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class zu extends qa.a {
    public static final Parcelable.Creator<zu> CREATOR = new ji(15);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13123c;

    public zu(String str, int i) {
        this.f13122b = str;
        this.f13123c = i;
    }

    public static zu a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new zu(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zu)) {
            return false;
        }
        zu zuVar = (zu) obj;
        return pa.c0.m(this.f13122b, zuVar.f13122b) && pa.c0.m(Integer.valueOf(this.f13123c), Integer.valueOf(zuVar.f13123c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13122b, Integer.valueOf(this.f13123c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.b0(parcel, 2, this.f13122b);
        j0.g.h0(parcel, 3, 4);
        parcel.writeInt(this.f13123c);
        j0.g.m0(parcel, iI0);
    }
}
