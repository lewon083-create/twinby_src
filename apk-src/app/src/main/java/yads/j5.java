package yads;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j5 implements Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39727b;

    @NotNull
    public static final h5 Companion = new h5();

    @NotNull
    public static final Parcelable.Creator<j5> CREATOR = new i5();

    public j5(String str) {
        this.f39727b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j5) && Intrinsics.a(this.f39727b, ((j5) obj).f39727b);
    }

    public final int hashCode() {
        return this.f39727b.hashCode();
    }

    public final String toString() {
        return pe.a.f("AdImpressionData(rawData=", this.f39727b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f39727b);
    }
}
