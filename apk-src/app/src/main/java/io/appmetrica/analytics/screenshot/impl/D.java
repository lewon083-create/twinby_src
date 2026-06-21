package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class D implements Parcelable {

    @NotNull
    public static final C CREATOR = new C();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F f25419b;

    public D(boolean z5, F f10) {
        this.f25418a = z5;
        this.f25419b = f10;
    }

    public final F a() {
        return this.f25419b;
    }

    public final boolean b() {
        return this.f25418a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableRemoteScreenshotConfig(enabled=" + this.f25418a + ", config=" + this.f25419b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f25418a ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f25419b, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public D(j0 j0Var) {
        boolean zB = j0Var.b();
        k0 k0VarA = j0Var.a();
        this(zB, k0VarA != null ? new F(k0VarA) : null);
    }
}
