package ma;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import pa.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends qa.a {
    public static final Parcelable.Creator<d> CREATOR = new kb.i(6);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f28770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f28771e;

    public d(String str, int i, long j10, boolean z5) {
        this.f28768b = str;
        this.f28769c = i;
        this.f28770d = j10;
        this.f28771e = z5;
    }

    public final long c() {
        long j10 = this.f28770d;
        return j10 == -1 ? this.f28769c : j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (c0.m(this.f28768b, dVar.f28768b) && c() == dVar.c() && this.f28771e == dVar.f28771e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f28768b, Long.valueOf(c()), Boolean.valueOf(this.f28771e)});
    }

    public final String toString() {
        l6.i iVar = new l6.i(this);
        iVar.b(this.f28768b, "name");
        iVar.b(Long.valueOf(c()), "version");
        iVar.b(Boolean.valueOf(this.f28771e), "is_fully_rolled_out");
        return iVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.b0(parcel, 1, this.f28768b);
        j0.g.h0(parcel, 2, 4);
        parcel.writeInt(this.f28769c);
        long jC = c();
        j0.g.h0(parcel, 3, 8);
        parcel.writeLong(jC);
        j0.g.h0(parcel, 4, 4);
        parcel.writeInt(this.f28771e ? 1 : 0);
        j0.g.m0(parcel, iI0);
    }

    public d(String str, long j10) {
        this(str, -1, j10, false);
    }
}
