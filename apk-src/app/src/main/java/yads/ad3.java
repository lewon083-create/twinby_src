package yads;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ad3 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ad3> CREATOR = new yc3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zc3 f36692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f36693c;

    public ad3(zc3 zc3Var, float f10) {
        this.f36692b = zc3Var;
        this.f36693c = f10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zc3 zc3Var = this.f36692b;
        parcel.writeInt(zc3Var != null ? zc3Var.ordinal() : -1);
        parcel.writeFloat(this.f36693c);
    }
}
