package yads;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class er0 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<er0> CREATOR = new dr0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f38248c;

    public er0(String str, long j10) {
        this.f38247b = str;
        this.f38248c = j10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er0)) {
            return false;
        }
        er0 er0Var = (er0) obj;
        return Intrinsics.a(this.f38247b, er0Var.f38247b) && this.f38248c == er0Var.f38248c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f38248c) + (this.f38247b.hashCode() * 31);
    }

    public final String toString() {
        return "FalseClick(url=" + this.f38247b + ", interval=" + this.f38248c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f38247b);
        parcel.writeLong(this.f38248c);
    }
}
