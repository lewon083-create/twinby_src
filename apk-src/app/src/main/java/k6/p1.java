package k6;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f27151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f27152b;

    public final void a() {
        int[] iArr = this.f27151a;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f27152b = null;
    }

    public final void b(int i) {
        int[] iArr = this.f27151a;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f27151a = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f27151a = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = this.f27151a;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public final void c(int i) {
        ArrayList arrayList = this.f27152b;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((o1) this.f27152b.get(size)).f27147b >= i) {
                    this.f27152b.remove(size);
                }
            }
        }
        e(i);
    }

    public final o1 d(int i, int i10, int i11) {
        ArrayList arrayList = this.f27152b;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            o1 o1Var = (o1) this.f27152b.get(i12);
            int i13 = o1Var.f27147b;
            if (i13 >= i10) {
                return null;
            }
            if (i13 >= i && (i11 == 0 || o1Var.f27148c == i11 || o1Var.f27150e)) {
                return o1Var;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(int r5) {
        /*
            r4 = this;
            int[] r0 = r4.f27151a
            r1 = -1
            if (r0 != 0) goto L6
            goto L9
        L6:
            int r0 = r0.length
            if (r5 < r0) goto La
        L9:
            return r1
        La:
            java.util.ArrayList r0 = r4.f27152b
            if (r0 != 0) goto L10
        Le:
            r0 = r1
            goto L5e
        L10:
            if (r0 != 0) goto L13
            goto L2b
        L13:
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L19:
            if (r0 < 0) goto L2b
            java.util.ArrayList r2 = r4.f27152b
            java.lang.Object r2 = r2.get(r0)
            k6.o1 r2 = (k6.o1) r2
            int r3 = r2.f27147b
            if (r3 != r5) goto L28
            goto L2c
        L28:
            int r0 = r0 + (-1)
            goto L19
        L2b:
            r2 = 0
        L2c:
            if (r2 == 0) goto L33
            java.util.ArrayList r0 = r4.f27152b
            r0.remove(r2)
        L33:
            java.util.ArrayList r0 = r4.f27152b
            int r0 = r0.size()
            r2 = 0
        L3a:
            if (r2 >= r0) goto L4c
            java.util.ArrayList r3 = r4.f27152b
            java.lang.Object r3 = r3.get(r2)
            k6.o1 r3 = (k6.o1) r3
            int r3 = r3.f27147b
            if (r3 < r5) goto L49
            goto L4d
        L49:
            int r2 = r2 + 1
            goto L3a
        L4c:
            r2 = r1
        L4d:
            if (r2 == r1) goto Le
            java.util.ArrayList r0 = r4.f27152b
            java.lang.Object r0 = r0.get(r2)
            k6.o1 r0 = (k6.o1) r0
            java.util.ArrayList r3 = r4.f27152b
            r3.remove(r2)
            int r0 = r0.f27147b
        L5e:
            if (r0 != r1) goto L6a
            int[] r0 = r4.f27151a
            int r2 = r0.length
            java.util.Arrays.fill(r0, r5, r2, r1)
            int[] r5 = r4.f27151a
            int r5 = r5.length
            return r5
        L6a:
            int r0 = r0 + 1
            int[] r2 = r4.f27151a
            int r2 = r2.length
            int r0 = java.lang.Math.min(r0, r2)
            int[] r2 = r4.f27151a
            java.util.Arrays.fill(r2, r5, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.p1.e(int):int");
    }

    public final void f(int i, int i10) {
        int[] iArr = this.f27151a;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i11 = i + i10;
        b(i11);
        int[] iArr2 = this.f27151a;
        System.arraycopy(iArr2, i, iArr2, i11, (iArr2.length - i) - i10);
        Arrays.fill(this.f27151a, i, i11, -1);
        ArrayList arrayList = this.f27152b;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            o1 o1Var = (o1) this.f27152b.get(size);
            int i12 = o1Var.f27147b;
            if (i12 >= i) {
                o1Var.f27147b = i12 + i10;
            }
        }
    }

    public final void g(int i, int i10) {
        int[] iArr = this.f27151a;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i11 = i + i10;
        b(i11);
        int[] iArr2 = this.f27151a;
        System.arraycopy(iArr2, i11, iArr2, i, (iArr2.length - i) - i10);
        int[] iArr3 = this.f27151a;
        Arrays.fill(iArr3, iArr3.length - i10, iArr3.length, -1);
        ArrayList arrayList = this.f27152b;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            o1 o1Var = (o1) this.f27152b.get(size);
            int i12 = o1Var.f27147b;
            if (i12 >= i) {
                if (i12 < i11) {
                    this.f27152b.remove(size);
                } else {
                    o1Var.f27147b = i12 - i10;
                }
            }
        }
    }
}
