package p2;

import com.google.android.gms.internal.ads.xw0;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pk.c f31089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k6.t0 f31090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k6.t0 f31091c;

    public v0(String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.f31089a = new pk.c();
        this.f31090b = new k6.t0(8);
        this.f31091c = new k6.t0(new xw0(2, null, 1));
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.f31090b.f27180c).get());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.jvm.functions.Function1 r8, oj.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p2.t0
            if (r0 == 0) goto L13
            r0 = r9
            p2.t0 r0 = (p2.t0) r0
            int r1 = r0.f31073p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31073p = r1
            goto L18
        L13:
            p2.t0 r0 = new p2.t0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f31071n
            nj.a r1 = nj.a.f29512b
            int r2 = r0.f31073p
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L45
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r8 = r0.f31069l
            pk.a r8 = (pk.a) r8
            com.google.android.gms.internal.measurement.h5.E(r9)     // Catch: java.lang.Throwable -> L2f
            goto L67
        L2f:
            r9 = move-exception
            goto L71
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            pk.c r8 = r0.f31070m
            java.lang.Object r2 = r0.f31069l
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            com.google.android.gms.internal.measurement.h5.E(r9)
            r9 = r8
            r8 = r2
            goto L57
        L45:
            com.google.android.gms.internal.measurement.h5.E(r9)
            r0.f31069l = r8
            pk.c r9 = r7.f31089a
            r0.f31070m = r9
            r0.f31073p = r4
            java.lang.Object r2 = r9.c(r0)
            if (r2 != r1) goto L57
            goto L63
        L57:
            r0.f31069l = r9     // Catch: java.lang.Throwable -> L6d
            r0.f31070m = r5     // Catch: java.lang.Throwable -> L6d
            r0.f31073p = r3     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L6d
            if (r8 != r1) goto L64
        L63:
            return r1
        L64:
            r6 = r9
            r9 = r8
            r8 = r6
        L67:
            pk.c r8 = (pk.c) r8
            r8.e(r5)
            return r9
        L6d:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L71:
            pk.c r8 = (pk.c) r8
            r8.e(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.v0.b(kotlin.jvm.functions.Function1, oj.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(kotlin.jvm.functions.Function2 r7, oj.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p2.u0
            if (r0 == 0) goto L13
            r0 = r8
            p2.u0 r0 = (p2.u0) r0
            int r1 = r0.f31083p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31083p = r1
            goto L18
        L13:
            p2.u0 r0 = new p2.u0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f31081n
            nj.a r1 = nj.a.f29512b
            int r2 = r0.f31083p
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            boolean r7 = r0.f31080m
            pk.c r0 = r0.f31079l
            com.google.android.gms.internal.measurement.h5.E(r8)     // Catch: java.lang.Throwable -> L2c
            goto L53
        L2c:
            r8 = move-exception
            goto L5d
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            com.google.android.gms.internal.measurement.h5.E(r8)
            pk.c r8 = r6.f31089a
            boolean r2 = r8.d()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L59
            r0.f31079l = r8     // Catch: java.lang.Throwable -> L59
            r0.f31080m = r2     // Catch: java.lang.Throwable -> L59
            r0.f31083p = r3     // Catch: java.lang.Throwable -> L59
            java.lang.Object r7 = r7.invoke(r5, r0)     // Catch: java.lang.Throwable -> L59
            if (r7 != r1) goto L50
            return r1
        L50:
            r0 = r8
            r8 = r7
            r7 = r2
        L53:
            if (r7 == 0) goto L58
            r0.e(r4)
        L58:
            return r8
        L59:
            r7 = move-exception
            r0 = r8
            r8 = r7
            r7 = r2
        L5d:
            if (r7 == 0) goto L62
            r0.e(r4)
        L62:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.v0.c(kotlin.jvm.functions.Function2, oj.c):java.lang.Object");
    }
}
