package gk;

import fh.zf;
import ij.y;
import ij.z;
import java.io.Serializable;
import k3.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements Comparable, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zf f20150d = new zf();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f20151e = new a(0, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f20152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f20153c;

    public a(long j10, long j11) {
        this.f20152b = j10;
        this.f20153c = j11;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        a other = (a) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        long j10 = other.f20152b;
        long j11 = this.f20152b;
        if (j11 != j10) {
            y yVar = z.f21362c;
            return Long.compare(j11 ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE);
        }
        y yVar2 = z.f21362c;
        return Long.compare(this.f20153c ^ Long.MIN_VALUE, other.f20153c ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f20152b == aVar.f20152b && this.f20153c == aVar.f20153c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f20152b ^ this.f20153c);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        f.l(this.f20152b, bArr, 0, 0, 4);
        bArr[8] = 45;
        f.l(this.f20152b, bArr, 9, 4, 6);
        bArr[13] = 45;
        f.l(this.f20152b, bArr, 14, 6, 8);
        bArr[18] = 45;
        f.l(this.f20153c, bArr, 19, 0, 2);
        bArr[23] = 45;
        f.l(this.f20153c, bArr, 24, 2, 8);
        return a0.g(bArr);
    }
}
