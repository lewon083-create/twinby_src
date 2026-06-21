package yads;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class rv implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<rv> CREATOR = new qv();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f42736c;

    public rv(int i, String str) {
        this.f42735b = i;
        this.f42736c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rv)) {
            return false;
        }
        rv rvVar = (rv) obj;
        return this.f42735b == rvVar.f42735b && Intrinsics.a(this.f42736c, rvVar.f42736c);
    }

    public final int hashCode() {
        return this.f42736c.hashCode() + (Integer.hashCode(this.f42735b) * 31);
    }

    public final String toString() {
        return "ClientSideReward(rewardAmount=" + this.f42735b + ", rewardType=" + this.f42736c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f42735b);
        parcel.writeString(this.f42736c);
    }
}
