package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class av1 implements Parcelable {
    public static final Parcelable.Creator<av1> CREATOR = new ji(26);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UUID f3435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f3437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f3438f;

    public av1(Parcel parcel) {
        this.f3435c = new UUID(parcel.readLong(), parcel.readLong());
        this.f3436d = parcel.readString();
        String string = parcel.readString();
        String str = cq0.f4293a;
        this.f3437e = string;
        this.f3438f = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof av1)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        av1 av1Var = (av1) obj;
        return Objects.equals(this.f3436d, av1Var.f3436d) && Objects.equals(this.f3437e, av1Var.f3437e) && Objects.equals(this.f3435c, av1Var.f3435c) && Arrays.equals(this.f3438f, av1Var.f3438f);
    }

    public final int hashCode() {
        int i = this.f3434b;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.f3435c.hashCode() * 31;
        String str = this.f3436d;
        int iHashCode2 = Arrays.hashCode(this.f3438f) + gf.a.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f3437e);
        this.f3434b = iHashCode2;
        return iHashCode2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.f3435c;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f3436d);
        parcel.writeString(this.f3437e);
        parcel.writeByteArray(this.f3438f);
    }

    public av1(UUID uuid, String str, byte[] bArr) {
        uuid.getClass();
        this.f3435c = uuid;
        this.f3436d = null;
        this.f3437e = ra.h(str);
        this.f3438f = bArr;
    }
}
