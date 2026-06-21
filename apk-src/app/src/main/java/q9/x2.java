package q9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x2 extends qa.a {
    public static final Parcelable.Creator<x2> CREATOR = new f1(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f31981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d3 f31983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f31984e;

    public x2(String str, int i, d3 d3Var, int i10) {
        this.f31981b = str;
        this.f31982c = i;
        this.f31983d = d3Var;
        this.f31984e = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) obj;
        return this.f31981b.equals(x2Var.f31981b) && this.f31982c == x2Var.f31982c && this.f31983d.a(x2Var.f31983d);
    }

    public final int hashCode() {
        return Objects.hash(this.f31981b, Integer.valueOf(this.f31982c), this.f31983d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.b0(parcel, 1, this.f31981b);
        j0.g.h0(parcel, 2, 4);
        parcel.writeInt(this.f31982c);
        j0.g.a0(parcel, 3, this.f31983d, i);
        j0.g.h0(parcel, 4, 4);
        parcel.writeInt(this.f31984e);
        j0.g.m0(parcel, iI0);
    }
}
