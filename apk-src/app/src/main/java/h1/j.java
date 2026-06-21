package h1;

import java.util.Arrays;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ int[] f20341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f20342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f20343d;

    public j() {
        int i;
        int i10 = 4;
        while (true) {
            i = 40;
            if (i10 >= 32) {
                break;
            }
            int i11 = (1 << i10) - 12;
            if (40 <= i11) {
                i = i11;
                break;
            }
            i10++;
        }
        int i12 = i / 4;
        this.f20341b = new int[i12];
        this.f20342c = new Object[i12];
    }

    public final void a(int i, Object obj) {
        int i10 = this.f20343d;
        if (i10 != 0 && i <= this.f20341b[i10 - 1]) {
            c(i, obj);
            return;
        }
        if (i10 >= this.f20341b.length) {
            int i11 = (i10 + 1) * 4;
            int i12 = 4;
            while (true) {
                if (i12 >= 32) {
                    break;
                }
                int i13 = (1 << i12) - 12;
                if (i11 <= i13) {
                    i11 = i13;
                    break;
                }
                i12++;
            }
            int i14 = i11 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f20341b, i14);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.f20341b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f20342c, i14);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f20342c = objArrCopyOf;
        }
        this.f20341b[i10] = i;
        this.f20342c[i10] = obj;
        this.f20343d = i10 + 1;
    }

    public final Object b(int i) {
        Object obj;
        Intrinsics.checkNotNullParameter(this, "<this>");
        int iA = i1.a.a(this.f20343d, i, this.f20341b);
        if (iA < 0 || (obj = this.f20342c[iA]) == h.f20337b) {
            return null;
        }
        return obj;
    }

    public final void c(int i, Object obj) {
        int iA = i1.a.a(this.f20343d, i, this.f20341b);
        if (iA >= 0) {
            this.f20342c[iA] = obj;
            return;
        }
        int i10 = ~iA;
        int i11 = this.f20343d;
        if (i10 < i11) {
            Object[] objArr = this.f20342c;
            if (objArr[i10] == h.f20337b) {
                this.f20341b[i10] = i;
                objArr[i10] = obj;
                return;
            }
        }
        if (i11 >= this.f20341b.length) {
            int i12 = (i11 + 1) * 4;
            int i13 = 4;
            while (true) {
                if (i13 >= 32) {
                    break;
                }
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
            int i15 = i12 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f20341b, i15);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.f20341b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f20342c, i15);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f20342c = objArrCopyOf;
        }
        int i16 = this.f20343d;
        if (i16 - i10 != 0) {
            int[] iArr = this.f20341b;
            int i17 = i10 + 1;
            o.e(i17, i10, i16, iArr, iArr);
            Object[] objArr2 = this.f20342c;
            o.f(objArr2, i17, objArr2, i10, this.f20343d);
        }
        this.f20341b[i10] = i;
        this.f20342c[i10] = obj;
        this.f20343d++;
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        Intrinsics.c(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        j jVar = (j) objClone;
        jVar.f20341b = (int[]) this.f20341b.clone();
        jVar.f20342c = (Object[]) this.f20342c.clone();
        return jVar;
    }

    public final String toString() {
        int i = this.f20343d;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(i * 28);
        sb2.append('{');
        int i10 = this.f20343d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(this.f20341b[i11]);
            sb2.append('=');
            Object obj = this.f20342c[i11];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "buffer.toString()");
        return string;
    }
}
