package mk;

import hk.r0;
import hk.s0;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f28945b = AtomicIntegerFieldUpdater.newUpdater(v.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r0[] f28946a;

    public final void a(r0 r0Var) {
        r0Var.d((s0) this);
        r0[] r0VarArr = this.f28946a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f28945b;
        if (r0VarArr == null) {
            r0VarArr = new r0[4];
            this.f28946a = r0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= r0VarArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(r0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            r0VarArr = (r0[]) objArrCopyOf;
            this.f28946a = r0VarArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        r0VarArr[i] = r0Var;
        r0Var.f20703c = i;
        c(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final hk.r0 b(int r9) {
        /*
            r8 = this;
            hk.r0[] r0 = r8.f28946a
            kotlin.jvm.internal.Intrinsics.b(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = mk.v.f28945b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.d(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            kotlin.jvm.internal.Intrinsics.b(r4)
            r5 = r0[r2]
            kotlin.jvm.internal.Intrinsics.b(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.d(r9, r2)
            r8.c(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            hk.r0[] r5 = r8.f28946a
            kotlin.jvm.internal.Intrinsics.b(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            kotlin.jvm.internal.Intrinsics.b(r6)
            r7 = r5[r4]
            kotlin.jvm.internal.Intrinsics.b(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            kotlin.jvm.internal.Intrinsics.b(r4)
            r5 = r5[r2]
            kotlin.jvm.internal.Intrinsics.b(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.d(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            kotlin.jvm.internal.Intrinsics.b(r9)
            r2 = 0
            r9.d(r2)
            r9.f20703c = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: mk.v.b(int):hk.r0");
    }

    public final void c(int i) {
        while (i > 0) {
            r0[] r0VarArr = this.f28946a;
            Intrinsics.b(r0VarArr);
            int i10 = (i - 1) / 2;
            r0 r0Var = r0VarArr[i10];
            Intrinsics.b(r0Var);
            r0 r0Var2 = r0VarArr[i];
            Intrinsics.b(r0Var2);
            if (r0Var.compareTo(r0Var2) <= 0) {
                return;
            }
            d(i, i10);
            i = i10;
        }
    }

    public final void d(int i, int i10) {
        r0[] r0VarArr = this.f28946a;
        Intrinsics.b(r0VarArr);
        r0 r0Var = r0VarArr[i10];
        Intrinsics.b(r0Var);
        r0 r0Var2 = r0VarArr[i];
        Intrinsics.b(r0Var2);
        r0VarArr[i] = r0Var;
        r0VarArr[i10] = r0Var2;
        r0Var.f20703c = i;
        r0Var2.f20703c = i10;
    }
}
