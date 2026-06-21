package dd;

import com.google.android.gms.internal.measurement.h5;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f15768d = new a(new int[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f15769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15770c;

    public a(int[] iArr) {
        int length = iArr.length;
        this.f15769b = iArr;
        this.f15770c = length;
    }

    public final boolean equals(Object obj) {
        a aVar;
        int i;
        int i10;
        if (obj == this) {
            return true;
        }
        if ((obj instanceof a) && (i10 = this.f15770c) == (i = (aVar = (a) obj).f15770c)) {
            for (int i11 = 0; i11 < i10; i11++) {
                h5.l(i11, i10);
                int i12 = this.f15769b[i11];
                h5.l(i11, i);
                if (i12 == aVar.f15769b[i11]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (int i = 0; i < this.f15770c; i++) {
            iHashCode = (iHashCode * 31) + Integer.hashCode(this.f15769b[i]);
        }
        return iHashCode;
    }

    public final String toString() {
        int i = this.f15770c;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(i * 5);
        sb2.append('[');
        int[] iArr = this.f15769b;
        sb2.append(iArr[0]);
        for (int i10 = 1; i10 < i; i10++) {
            sb2.append(", ");
            sb2.append(iArr[i10]);
        }
        sb2.append(']');
        return sb2.toString();
    }
}
