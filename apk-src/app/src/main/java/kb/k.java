package kb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.om1;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends qa.a {
    public static final Parcelable.Creator<k> CREATOR = new i(3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f27350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f27351e;

    public k(int i, int i10, long j10, long j11) {
        this.f27348b = i;
        this.f27349c = i10;
        this.f27350d = j10;
        this.f27351e = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f27348b == kVar.f27348b && this.f27349c == kVar.f27349c && this.f27350d == kVar.f27350d && this.f27351e == kVar.f27351e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f27349c), Integer.valueOf(this.f27348b), Long.valueOf(this.f27351e), Long.valueOf(this.f27350d)});
    }

    public final String toString() {
        int i = this.f27348b;
        int length = String.valueOf(i).length();
        int i10 = this.f27349c;
        int length2 = String.valueOf(i10).length();
        long j10 = this.f27351e;
        int length3 = String.valueOf(j10).length();
        long j11 = this.f27350d;
        StringBuilder sb2 = new StringBuilder(length + 50 + length2 + 18 + length3 + 17 + String.valueOf(j11).length());
        om1.u(sb2, "NetworkLocationStatus: Wifi status: ", i, " Cell status: ", i10);
        pe.a.s(sb2, " elapsed time NS: ", j10, " system time ms: ");
        sb2.append(j11);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.h0(parcel, 1, 4);
        parcel.writeInt(this.f27348b);
        j0.g.h0(parcel, 2, 4);
        parcel.writeInt(this.f27349c);
        j0.g.h0(parcel, 3, 8);
        parcel.writeLong(this.f27350d);
        j0.g.h0(parcel, 4, 8);
        parcel.writeLong(this.f27351e);
        j0.g.m0(parcel, iI0);
    }
}
