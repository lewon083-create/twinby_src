package yads;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ce1 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ce1> CREATOR = new be1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f37350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f37351d;

    public ce1(String str, String str2, boolean z5) {
        this.f37349b = str;
        this.f37350c = str2;
        this.f37351d = z5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ce1)) {
            return false;
        }
        ce1 ce1Var = (ce1) obj;
        return Intrinsics.a(this.f37349b, ce1Var.f37349b) && Intrinsics.a(this.f37350c, ce1Var.f37350c) && this.f37351d == ce1Var.f37351d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f37351d) + k4.a(this.f37350c, this.f37349b.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.f37349b;
        String str2 = this.f37350c;
        boolean z5 = this.f37351d;
        StringBuilder sbJ = t.z.j("JavaScriptResource(apiFramework=", str, ", url=", str2, ", browserOptional=");
        sbJ.append(z5);
        sbJ.append(")");
        return sbJ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f37349b);
        parcel.writeString(this.f37350c);
        parcel.writeInt(this.f37351d ? 1 : 0);
    }
}
