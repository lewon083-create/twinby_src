package qb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import j0.g;
import java.util.ArrayList;
import java.util.List;
import na.l;
import pa.l0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends qa.a implements l {
    public static final Parcelable.Creator<e> CREATOR = new l0(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f31991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f31992c;

    public e(String str, ArrayList arrayList) {
        this.f31991b = arrayList;
        this.f31992c = str;
    }

    @Override // na.l
    public final Status getStatus() {
        return this.f31992c != null ? Status.f2629f : Status.f2632j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = g.i0(parcel, 20293);
        g.d0(parcel, 1, this.f31991b);
        g.b0(parcel, 2, this.f31992c);
        g.m0(parcel, iI0);
    }
}
