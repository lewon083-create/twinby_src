package qc;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends m2.b {
    public static final Parcelable.Creator<x> CREATOR = new ac.e(8);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f32103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f32104e;

    public x(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f32103d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f32104e = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f32103d) + "}";
    }

    @Override // m2.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.f32103d, parcel, i);
        parcel.writeInt(this.f32104e ? 1 : 0);
    }
}
