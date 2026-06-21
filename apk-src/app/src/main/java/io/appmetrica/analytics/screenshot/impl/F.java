package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class F implements Parcelable {

    @NotNull
    public static final E CREATOR = new E();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0694z f25420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H f25421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B f25422c;

    public F(C0694z c0694z, H h10, B b2) {
        this.f25420a = c0694z;
        this.f25421b = h10;
        this.f25422c = b2;
    }

    public final C0694z a() {
        return this.f25420a;
    }

    public final B b() {
        return this.f25422c;
    }

    public final H c() {
        return this.f25421b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableScreenshotConfig(apiCaptorConfig=" + this.f25420a + ", serviceCaptorConfig=" + this.f25421b + ", contentObserverCaptorConfig=" + this.f25422c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f25420a, i);
        parcel.writeParcelable(this.f25421b, i);
        parcel.writeParcelable(this.f25422c, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public F(k0 k0Var) {
        h0 h0VarA = k0Var.a();
        C0694z c0694z = h0VarA != null ? new C0694z(h0VarA) : null;
        l0 l0VarC = k0Var.c();
        H h10 = l0VarC != null ? new H(l0VarC) : null;
        i0 i0VarB = k0Var.b();
        this(c0694z, h10, i0VarB != null ? new B(i0VarB) : null);
    }
}
