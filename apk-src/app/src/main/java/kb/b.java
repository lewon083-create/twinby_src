package kb;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import pa.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends qa.a {
    public static final Parcelable.Creator<b> CREATOR = new com.google.android.material.datepicker.a(26);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f27328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f27330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gb.i f27331e;

    public b(long j10, int i, boolean z5, gb.i iVar) {
        this.f27328b = j10;
        this.f27329c = i;
        this.f27330d = z5;
        this.f27331e = iVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f27328b == bVar.f27328b && this.f27329c == bVar.f27329c && this.f27330d == bVar.f27330d && c0.m(this.f27331e, bVar.f27331e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f27328b), Integer.valueOf(this.f27329c), Boolean.valueOf(this.f27330d)});
    }

    public final String toString() {
        String str;
        StringBuilder sbJ = pe.a.j("LastLocationRequest[");
        long j10 = this.f27328b;
        if (j10 != Long.MAX_VALUE) {
            sbJ.append("maxAge=");
            gb.m.a(j10, sbJ);
        }
        int i = this.f27329c;
        if (i != 0) {
            sbJ.append(", ");
            if (i == 0) {
                str = "GRANULARITY_PERMISSION_LEVEL";
            } else if (i == 1) {
                str = "GRANULARITY_COARSE";
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException();
                }
                str = "GRANULARITY_FINE";
            }
            sbJ.append(str);
        }
        if (this.f27330d) {
            sbJ.append(", bypass");
        }
        gb.i iVar = this.f27331e;
        if (iVar != null) {
            sbJ.append(", impersonation=");
            sbJ.append(iVar);
        }
        sbJ.append(']');
        return sbJ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.h0(parcel, 1, 8);
        parcel.writeLong(this.f27328b);
        j0.g.h0(parcel, 2, 4);
        parcel.writeInt(this.f27329c);
        j0.g.h0(parcel, 3, 4);
        parcel.writeInt(this.f27330d ? 1 : 0);
        j0.g.a0(parcel, 5, this.f27331e, i);
        j0.g.m0(parcel, iI0);
    }
}
