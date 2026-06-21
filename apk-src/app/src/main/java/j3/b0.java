package j3;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0[] f26216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f26217b;

    public b0(a0... a0VarArr) {
        this(-9223372036854775807L, a0VarArr);
    }

    public final b0 a(a0... a0VarArr) {
        if (a0VarArr.length == 0) {
            return this;
        }
        String str = m3.z.f28608a;
        a0[] a0VarArr2 = this.f26216a;
        Object[] objArrCopyOf = Arrays.copyOf(a0VarArr2, a0VarArr2.length + a0VarArr.length);
        System.arraycopy(a0VarArr, 0, objArrCopyOf, a0VarArr2.length, a0VarArr.length);
        return new b0(this.f26217b, (a0[]) objArrCopyOf);
    }

    public final b0 b(b0 b0Var) {
        return b0Var == null ? this : a(b0Var.f26216a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b0.class == obj.getClass()) {
            b0 b0Var = (b0) obj;
            if (Arrays.equals(this.f26216a, b0Var.f26216a) && this.f26217b == b0Var.f26217b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f26217b) + (Arrays.hashCode(this.f26216a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("entries=");
        sb2.append(Arrays.toString(this.f26216a));
        long j10 = this.f26217b;
        if (j10 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j10;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public b0(long j10, a0... a0VarArr) {
        this.f26217b = j10;
        this.f26216a = a0VarArr;
    }

    public b0(List list) {
        this((a0[]) list.toArray(new a0[0]));
    }
}
