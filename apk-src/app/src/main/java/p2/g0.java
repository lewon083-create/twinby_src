package p2;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class g0 implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f30977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0 f30978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f30979c;

    public g0(File file, s0 serializer) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f30977a = file;
        this.f30978b = serializer;
        this.f30979c = new AtomicBoolean(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [p2.g0] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, p2.g0] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [p2.g0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(p2.g0 r7, oj.c r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof p2.f0
            if (r0 == 0) goto L13
            r0 = r8
            p2.f0 r0 = (p2.f0) r0
            int r1 = r0.f30969p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30969p = r1
            goto L18
        L13:
            p2.f0 r0 = new p2.f0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f30967n
            nj.a r1 = nj.a.f29512b
            int r2 = r0.f30969p
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r7 = r0.f30965l
            java.io.Closeable r7 = (java.io.Closeable) r7
            com.google.android.gms.internal.measurement.h5.E(r8)     // Catch: java.lang.Throwable -> L30
            goto L9e
        L30:
            r8 = move-exception
            goto La6
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            java.io.FileInputStream r7 = r0.f30966m
            java.lang.Object r2 = r0.f30965l
            p2.g0 r2 = (p2.g0) r2
            com.google.android.gms.internal.measurement.h5.E(r8)     // Catch: java.lang.Throwable -> L45
            goto L6c
        L45:
            r8 = move-exception
            goto L77
        L47:
            com.google.android.gms.internal.measurement.h5.E(r8)
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.f30979c
            boolean r8 = r8.get()
            if (r8 != 0) goto Lb1
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L7d
            java.io.File r2 = r7.f30977a     // Catch: java.io.FileNotFoundException -> L7d
            r8.<init>(r2)     // Catch: java.io.FileNotFoundException -> L7d
            p2.s0 r2 = r7.f30978b     // Catch: java.lang.Throwable -> L72
            r0.f30965l = r7     // Catch: java.lang.Throwable -> L72
            r0.f30966m = r8     // Catch: java.lang.Throwable -> L72
            r0.f30969p = r4     // Catch: java.lang.Throwable -> L72
            java.lang.Object r2 = r2.b(r8, r0)     // Catch: java.lang.Throwable -> L72
            if (r2 != r1) goto L68
            goto L9a
        L68:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L6c:
            hl.l.g(r7, r5)     // Catch: java.io.FileNotFoundException -> L70
            return r8
        L70:
            r7 = r2
            goto L7d
        L72:
            r2 = move-exception
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L77:
            throw r8     // Catch: java.lang.Throwable -> L78
        L78:
            r4 = move-exception
            hl.l.g(r7, r8)     // Catch: java.io.FileNotFoundException -> L70
            throw r4     // Catch: java.io.FileNotFoundException -> L70
        L7d:
            java.io.File r8 = r7.f30977a
            p2.s0 r2 = r7.f30978b
            boolean r8 = r8.exists()
            if (r8 == 0) goto Lac
            java.io.FileInputStream r8 = new java.io.FileInputStream
            java.io.File r7 = r7.f30977a
            r8.<init>(r7)
            r0.f30965l = r8     // Catch: java.lang.Throwable -> La2
            r0.f30966m = r5     // Catch: java.lang.Throwable -> La2
            r0.f30969p = r3     // Catch: java.lang.Throwable -> La2
            java.lang.Object r7 = r2.b(r8, r0)     // Catch: java.lang.Throwable -> La2
            if (r7 != r1) goto L9b
        L9a:
            return r1
        L9b:
            r6 = r8
            r8 = r7
            r7 = r6
        L9e:
            hl.l.g(r7, r5)
            return r8
        La2:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        La6:
            throw r8     // Catch: java.lang.Throwable -> La7
        La7:
            r0 = move-exception
            hl.l.g(r7, r8)
            throw r0
        Lac:
            java.lang.Object r7 = r2.a()
            return r7
        Lb1:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "This scope has already been closed."
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.g0.a(p2.g0, oj.c):java.lang.Object");
    }

    @Override // p2.a
    public final void close() {
        this.f30979c.set(true);
    }
}
