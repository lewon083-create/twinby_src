package yads;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d6 implements xq {
    public static final wq i = new zf.a(17);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f37631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Uri[] f37633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f37634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f37635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f37636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f37637h;

    public d6(long j10, int i10, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z5) {
        ni.a(iArr.length == uriArr.length);
        this.f37631b = j10;
        this.f37632c = i10;
        this.f37634e = iArr;
        this.f37633d = uriArr;
        this.f37635f = jArr;
        this.f37636g = j11;
        this.f37637h = z5;
    }

    public static d6 a(Bundle bundle) {
        long j10 = bundle.getLong(Integer.toString(0, 36));
        int i10 = bundle.getInt(Integer.toString(1, 36), -1);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(2, 36));
        int[] intArray = bundle.getIntArray(Integer.toString(3, 36));
        long[] longArray = bundle.getLongArray(Integer.toString(4, 36));
        long j11 = bundle.getLong(Integer.toString(5, 36));
        boolean z5 = bundle.getBoolean(Integer.toString(6, 36));
        int[] iArr = intArray;
        if (iArr == null) {
            iArr = new int[0];
        }
        Uri[] uriArr = parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]);
        if (longArray == null) {
            longArray = new long[0];
        }
        return new d6(j10, i10, iArr, uriArr, longArray, j11, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d6.class == obj.getClass()) {
            d6 d6Var = (d6) obj;
            if (this.f37631b == d6Var.f37631b && this.f37632c == d6Var.f37632c && Arrays.equals(this.f37633d, d6Var.f37633d) && Arrays.equals(this.f37634e, d6Var.f37634e) && Arrays.equals(this.f37635f, d6Var.f37635f) && this.f37636g == d6Var.f37636g && this.f37637h == d6Var.f37637h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f37632c * 31;
        long j10 = this.f37631b;
        int iHashCode = (Arrays.hashCode(this.f37635f) + ((Arrays.hashCode(this.f37634e) + ((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f37633d)) * 31)) * 31)) * 31;
        long j11 = this.f37636g;
        return ((iHashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f37637h ? 1 : 0);
    }

    public final int a(int i10) {
        int i11;
        int i12 = i10 + 1;
        while (true) {
            int[] iArr = this.f37634e;
            if (i12 >= iArr.length || this.f37637h || (i11 = iArr[i12]) == 0 || i11 == 1) {
                break;
            }
            i12++;
        }
        return i12;
    }

    public final d6 a() {
        int[] iArr = this.f37634e;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = this.f37635f;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        return new d6(this.f37631b, 0, iArrCopyOf, (Uri[]) Arrays.copyOf(this.f37633d, 0), jArrCopyOf, this.f37636g, this.f37637h);
    }
}
