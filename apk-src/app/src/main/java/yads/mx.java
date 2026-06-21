package yads;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class mx implements xq {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final wq f41060g = new zl.g0(7);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f41062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f41063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f41064e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f41065f;

    public mx(int i, int i10, int i11, byte[] bArr) {
        this.f41061b = i;
        this.f41062c = i10;
        this.f41063d = i11;
        this.f41064e = bArr;
    }

    public static mx a(Bundle bundle) {
        return new mx(bundle.getInt(Integer.toString(0, 36), -1), bundle.getInt(Integer.toString(1, 36), -1), bundle.getInt(Integer.toString(2, 36), -1), bundle.getByteArray(Integer.toString(3, 36)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mx.class == obj.getClass()) {
            mx mxVar = (mx) obj;
            if (this.f41061b == mxVar.f41061b && this.f41062c == mxVar.f41062c && this.f41063d == mxVar.f41063d && Arrays.equals(this.f41064e, mxVar.f41064e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f41065f == 0) {
            this.f41065f = Arrays.hashCode(this.f41064e) + ((((((this.f41061b + 527) * 31) + this.f41062c) * 31) + this.f41063d) * 31);
        }
        return this.f41065f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(this.f41061b);
        sb2.append(", ");
        sb2.append(this.f41062c);
        sb2.append(", ");
        sb2.append(this.f41063d);
        sb2.append(", ");
        sb2.append(this.f41064e != null);
        sb2.append(")");
        return sb2.toString();
    }
}
