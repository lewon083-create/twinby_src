package h1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import l7.o;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ boolean f20332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ long[] f20333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object[] f20334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ int f20335e;

    public g() {
        int i;
        int i10 = 4;
        while (true) {
            i = 80;
            if (i10 >= 32) {
                break;
            }
            int i11 = (1 << i10) - 12;
            if (80 <= i11) {
                i = i11;
                break;
            }
            i10++;
        }
        int i12 = i / 8;
        this.f20333c = new long[i12];
        this.f20334d = new Object[i12];
    }

    public final void a() {
        int i = this.f20335e;
        Object[] objArr = this.f20334d;
        for (int i10 = 0; i10 < i; i10++) {
            objArr[i10] = null;
        }
        this.f20335e = 0;
        this.f20332b = false;
    }

    public final Object b(long j10) {
        Object obj;
        int iB = i1.a.b(this.f20333c, this.f20335e, j10);
        if (iB < 0 || (obj = this.f20334d[iB]) == h.f20336a) {
            return null;
        }
        return obj;
    }

    public final long c(int i) {
        int i10;
        if (i < 0 || i >= (i10 = this.f20335e)) {
            throw new IllegalArgumentException(o.i(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.f20332b) {
            long[] jArr = this.f20333c;
            Object[] objArr = this.f20334d;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != h.f20336a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f20332b = false;
            this.f20335e = i11;
        }
        return this.f20333c[i];
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        Intrinsics.c(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        g gVar = (g) objClone;
        gVar.f20333c = (long[]) this.f20333c.clone();
        gVar.f20334d = (Object[]) this.f20334d.clone();
        return gVar;
    }

    public final void d(long j10, Object obj) {
        Object obj2 = h.f20336a;
        int iB = i1.a.b(this.f20333c, this.f20335e, j10);
        if (iB >= 0) {
            this.f20334d[iB] = obj;
            return;
        }
        int i = ~iB;
        int i10 = this.f20335e;
        if (i < i10) {
            Object[] objArr = this.f20334d;
            if (objArr[i] == obj2) {
                this.f20333c[i] = j10;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f20332b) {
            long[] jArr = this.f20333c;
            if (i10 >= jArr.length) {
                Object[] objArr2 = this.f20334d;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj3 = objArr2[i12];
                    if (obj3 != obj2) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr2[i11] = obj3;
                            objArr2[i12] = null;
                        }
                        i11++;
                    }
                }
                this.f20332b = false;
                this.f20335e = i11;
                i = ~i1.a.b(this.f20333c, i11, j10);
            }
        }
        int i13 = this.f20335e;
        if (i13 >= this.f20333c.length) {
            int i14 = (i13 + 1) * 8;
            int i15 = 4;
            while (true) {
                if (i15 >= 32) {
                    break;
                }
                int i16 = (1 << i15) - 12;
                if (i14 <= i16) {
                    i14 = i16;
                    break;
                }
                i15++;
            }
            int i17 = i14 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f20333c, i17);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(this, newSize)");
            this.f20333c = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f20334d, i17);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f20334d = objArrCopyOf;
        }
        int i18 = this.f20335e - i;
        if (i18 != 0) {
            long[] destination = this.f20333c;
            int i19 = i + 1;
            Intrinsics.checkNotNullParameter(destination, "<this>");
            Intrinsics.checkNotNullParameter(destination, "destination");
            System.arraycopy(destination, i, destination, i19, i18);
            Object[] objArr3 = this.f20334d;
            kotlin.collections.o.f(objArr3, i19, objArr3, i, this.f20335e);
        }
        this.f20333c[i] = j10;
        this.f20334d[i] = obj;
        this.f20335e++;
    }

    public final int e() {
        if (this.f20332b) {
            int i = this.f20335e;
            long[] jArr = this.f20333c;
            Object[] objArr = this.f20334d;
            int i10 = 0;
            for (int i11 = 0; i11 < i; i11++) {
                Object obj = objArr[i11];
                if (obj != h.f20336a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.f20332b = false;
            this.f20335e = i10;
        }
        return this.f20335e;
    }

    public final Object f(int i) {
        int i10;
        if (i < 0 || i >= (i10 = this.f20335e)) {
            throw new IllegalArgumentException(o.i(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.f20332b) {
            long[] jArr = this.f20333c;
            Object[] objArr = this.f20334d;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != h.f20336a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f20332b = false;
            this.f20335e = i11;
        }
        return this.f20334d[i];
    }

    public final String toString() {
        if (e() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f20335e * 28);
        sb2.append('{');
        int i = this.f20335e;
        for (int i10 = 0; i10 < i; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(c(i10));
            sb2.append('=');
            Object objF = f(i10);
            if (objF != sb2) {
                sb2.append(objF);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
