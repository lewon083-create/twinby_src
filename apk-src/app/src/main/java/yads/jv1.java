package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class jv1 implements us1 {
    public static final Parcelable.Creator<jv1> CREATOR = new iv1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f39991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f39992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f39993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f39994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f39995f;

    public jv1(long j10, long j11, long j12, long j13, long j14) {
        this.f39991b = j10;
        this.f39992c = j11;
        this.f39993d = j12;
        this.f39994e = j13;
        this.f39995f = j14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jv1.class == obj.getClass()) {
            jv1 jv1Var = (jv1) obj;
            if (this.f39991b == jv1Var.f39991b && this.f39992c == jv1Var.f39992c && this.f39993d == jv1Var.f39993d && this.f39994e == jv1Var.f39994e && this.f39995f == jv1Var.f39995f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f39991b;
        long j11 = this.f39992c;
        int i = (((((int) (j10 ^ (j10 >>> 32))) + 527) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f39993d;
        int i10 = (i + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f39994e;
        int i11 = (i10 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f39995f;
        return i11 + ((int) ((j14 >>> 32) ^ j14));
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f39991b + ", photoSize=" + this.f39992c + ", photoPresentationTimestampUs=" + this.f39993d + ", videoStartPosition=" + this.f39994e + ", videoSize=" + this.f39995f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f39991b);
        parcel.writeLong(this.f39992c);
        parcel.writeLong(this.f39993d);
        parcel.writeLong(this.f39994e);
        parcel.writeLong(this.f39995f);
    }

    public jv1(Parcel parcel) {
        this.f39991b = parcel.readLong();
        this.f39992c = parcel.readLong();
        this.f39993d = parcel.readLong();
        this.f39994e = parcel.readLong();
        this.f39995f = parcel.readLong();
    }
}
