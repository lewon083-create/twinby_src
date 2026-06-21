package yads;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class sq2 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<sq2> CREATOR = new qq2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f43057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rv f43058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final by2 f43059d;

    public sq2(boolean z5, rv rvVar, by2 by2Var) {
        this.f43057b = z5;
        this.f43058c = rvVar;
        this.f43059d = by2Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sq2)) {
            return false;
        }
        sq2 sq2Var = (sq2) obj;
        return this.f43057b == sq2Var.f43057b && Intrinsics.a(this.f43058c, sq2Var.f43058c) && Intrinsics.a(this.f43059d, sq2Var.f43059d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f43057b) * 31;
        rv rvVar = this.f43058c;
        int iHashCode2 = (iHashCode + (rvVar == null ? 0 : rvVar.hashCode())) * 31;
        by2 by2Var = this.f43059d;
        return iHashCode2 + (by2Var != null ? by2Var.f37173b.hashCode() : 0);
    }

    public final String toString() {
        return "RewardData(serverSideRewardType=" + this.f43057b + ", clientSideReward=" + this.f43058c + ", serverSideReward=" + this.f43059d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f43057b ? 1 : 0);
        rv rvVar = this.f43058c;
        if (rvVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(rvVar.f42735b);
            parcel.writeString(rvVar.f42736c);
        }
        by2 by2Var = this.f43059d;
        if (by2Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(by2Var.f37173b);
        }
    }
}
