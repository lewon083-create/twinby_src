package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.om1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class H implements Parcelable {

    @NotNull
    public static final G CREATOR = new G();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f25424b;

    public H(boolean z5, long j10) {
        this.f25423a = z5;
        this.f25424b = j10;
    }

    public final long a() {
        return this.f25424b;
    }

    public final boolean b() {
        return this.f25423a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParcelableServiceCaptorConfig(enabled=");
        sb2.append(this.f25423a);
        sb2.append(", delaySeconds=");
        return om1.m(sb2, this.f25424b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f25423a ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f25424b);
    }

    public H(l0 l0Var) {
        this(l0Var.b(), l0Var.a());
    }
}
