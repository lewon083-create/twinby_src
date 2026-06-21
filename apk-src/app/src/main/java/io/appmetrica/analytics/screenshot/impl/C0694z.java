package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0694z implements Parcelable {

    @NotNull
    public static final C0693y CREATOR = new C0693y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25519a;

    public C0694z(boolean z5) {
        this.f25519a = z5;
    }

    public final boolean a() {
        return this.f25519a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableApiCaptorConfig(enabled=" + this.f25519a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f25519a ? (byte) 1 : (byte) 0);
    }

    public C0694z(h0 h0Var) {
        this(h0Var.a());
    }
}
