package u9;

import a0.u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.om1;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import pa.l0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends qa.a {
    public static final Parcelable.Creator<a> CREATOR = new l0(27);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f34365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f34367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f34368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f34369f;

    public a(String str, int i, int i10, boolean z5, boolean z10) {
        this.f34365b = str;
        this.f34366c = i;
        this.f34367d = i10;
        this.f34368e = z5;
        this.f34369f = z10;
    }

    public static a c() {
        return new a(12451000, 12451000, true);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.b0(parcel, 2, this.f34365b);
        j0.g.h0(parcel, 3, 4);
        parcel.writeInt(this.f34366c);
        j0.g.h0(parcel, 4, 4);
        parcel.writeInt(this.f34367d);
        j0.g.h0(parcel, 5, 4);
        parcel.writeInt(this.f34368e ? 1 : 0);
        j0.g.h0(parcel, 6, 4);
        parcel.writeInt(this.f34369f ? 1 : 0);
        j0.g.m0(parcel, iI0);
    }

    public a(int i, int i10, boolean z5) {
        this(i, i10, 0, z5, false);
    }

    public a(int i, int i10, int i11, boolean z5, boolean z10) {
        String str;
        if (z5) {
            str = CommonUrlParts.Values.FALSE_INTEGER;
        } else {
            str = "1";
        }
        int length = String.valueOf(i).length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + length + 13 + 2);
        om1.u(sb2, "afma-sdk-a-v", i, ".", i10);
        this(u.o(sb2, ".", str), i, i10, z5, z10);
    }
}
