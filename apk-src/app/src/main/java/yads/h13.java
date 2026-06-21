package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h13 implements Parcelable {
    public static final Parcelable.Creator<h13> CREATOR = new g13();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f38979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f38980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f38981d;

    public h13(int i, long j10, long j11) {
        ni.a(j10 < j11);
        this.f38979b = j10;
        this.f38980c = j11;
        this.f38981d = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h13.class == obj.getClass()) {
            h13 h13Var = (h13) obj;
            if (this.f38979b == h13Var.f38979b && this.f38980c == h13Var.f38980c && this.f38981d == h13Var.f38981d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f38979b), Long.valueOf(this.f38980c), Integer.valueOf(this.f38981d)});
    }

    public final String toString() {
        long j10 = this.f38979b;
        long j11 = this.f38980c;
        int i = this.f38981d;
        int i10 = lb3.f40466a;
        Locale locale = Locale.US;
        StringBuilder sbN = gf.a.n("Segment: startTimeMs=", ", endTimeMs=", j10);
        sbN.append(j11);
        sbN.append(", speedDivisor=");
        sbN.append(i);
        return sbN.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f38979b);
        parcel.writeLong(this.f38980c);
        parcel.writeInt(this.f38981d);
    }
}
