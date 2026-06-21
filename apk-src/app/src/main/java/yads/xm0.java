package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class xm0 implements us1 {
    public static final Parcelable.Creator<xm0> CREATOR;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final nx0 f44761h;
    public static final nx0 i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f44764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f44765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f44766f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44767g;

    static {
        mx0 mx0Var = new mx0();
        mx0Var.f41075k = "application/id3";
        f44761h = new nx0(mx0Var);
        mx0 mx0Var2 = new mx0();
        mx0Var2.f41075k = "application/x-scte35";
        i = new nx0(mx0Var2);
        CREATOR = new wm0();
    }

    public xm0(Parcel parcel) {
        this.f44762b = (String) lb3.a((Object) parcel.readString());
        this.f44763c = (String) lb3.a((Object) parcel.readString());
        this.f44764d = parcel.readLong();
        this.f44765e = parcel.readLong();
        this.f44766f = (byte[]) lb3.a((Object) parcel.createByteArray());
    }

    @Override // yads.us1
    public final nx0 a() {
        String str = this.f44762b;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return i;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f44761h;
            default:
                return null;
        }
    }

    @Override // yads.us1
    public final byte[] b() {
        if (a() != null) {
            return this.f44766f;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xm0.class == obj.getClass()) {
            xm0 xm0Var = (xm0) obj;
            if (this.f44764d == xm0Var.f44764d && this.f44765e == xm0Var.f44765e && lb3.a(this.f44762b, xm0Var.f44762b) && lb3.a(this.f44763c, xm0Var.f44763c) && Arrays.equals(this.f44766f, xm0Var.f44766f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f44767g == 0) {
            String str = this.f44762b;
            int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
            String str2 = this.f44763c;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j10 = this.f44764d;
            int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f44765e;
            this.f44767g = Arrays.hashCode(this.f44766f) + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
        }
        return this.f44767g;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f44762b + ", id=" + this.f44765e + ", durationMs=" + this.f44764d + ", value=" + this.f44763c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f44762b);
        parcel.writeString(this.f44763c);
        parcel.writeLong(this.f44764d);
        parcel.writeLong(this.f44765e);
        parcel.writeByteArray(this.f44766f);
    }

    public xm0(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f44762b = str;
        this.f44763c = str2;
        this.f44764d = j10;
        this.f44765e = j11;
        this.f44766f = bArr;
    }
}
