package f;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new com.google.android.material.datepicker.a(5);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IntentSender f16468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Intent f16469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16471e;

    public i(IntentSender intentSender, Intent intent, int i, int i10) {
        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
        this.f16468b = intentSender;
        this.f16469c = intent;
        this.f16470d = i;
        this.f16471e = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f16468b, i);
        dest.writeParcelable(this.f16469c, i);
        dest.writeInt(this.f16470d);
        dest.writeInt(this.f16471e);
    }
}
