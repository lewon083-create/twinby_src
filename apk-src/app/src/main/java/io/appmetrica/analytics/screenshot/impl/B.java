package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.om1;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class B implements Parcelable {

    @NotNull
    public static final A CREATOR = new A();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f25416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f25417c;

    public B(boolean z5, List list, long j10) {
        this.f25415a = z5;
        this.f25416b = list;
        this.f25417c = j10;
    }

    public final long a() {
        return this.f25417c;
    }

    public final boolean b() {
        return this.f25415a;
    }

    public final List c() {
        return this.f25416b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParcelableContentObserverCaptorConfig(enabled=");
        sb2.append(this.f25415a);
        sb2.append(", mediaStoreColumnNames=");
        sb2.append(this.f25416b);
        sb2.append(", detectWindowSeconds=");
        return om1.m(sb2, this.f25417c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f25415a ? (byte) 1 : (byte) 0);
        parcel.writeStringList(this.f25416b);
        parcel.writeLong(this.f25417c);
    }

    public B(i0 i0Var) {
        this(i0Var.b(), i0Var.c(), i0Var.a());
    }
}
