package p2;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f31015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0 f31016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v0 f31017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c7.i f31018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f31019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final pk.c f31020f;

    public l0(File file, s0 serializer, v0 coordinator, c7.i onClose) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        this.f31015a = file;
        this.f31016b = serializer;
        this.f31017c = coordinator;
        this.f31018d = onClose;
        this.f31019e = new AtomicBoolean(false);
        this.f31020f = new pk.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a A[Catch: all -> 0x007b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x007b, blocks: (B:33:0x007a, B:42:0x008b, B:41:0x0088, B:38:0x0083), top: B:52:0x0020, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [p2.l0] */
    /* JADX WARN: Type inference failed for: r0v13, types: [p2.l0] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, p2.j0] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [p2.l0] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [p2.q] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(p2.q r8, oj.c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p2.j0
            if (r0 == 0) goto L13
            r0 = r9
            p2.j0 r0 = (p2.j0) r0
            int r1 = r0.f30995q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30995q = r1
            goto L18
        L13:
            p2.j0 r0 = new p2.j0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f30993o
            nj.a r1 = nj.a.f29512b
            int r2 = r0.f30995q
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            boolean r8 = r0.f30992n
            p2.g0 r1 = r0.f30991m
            p2.l0 r0 = r0.f30990l
            com.google.android.gms.internal.measurement.h5.E(r9)     // Catch: java.lang.Throwable -> L2e
            goto L6a
        L2e:
            r9 = move-exception
            goto L83
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            com.google.android.gms.internal.measurement.h5.E(r9)
            java.util.concurrent.atomic.AtomicBoolean r9 = r7.f31019e
            boolean r9 = r9.get()
            if (r9 != 0) goto L99
            pk.c r9 = r7.f31020f
            boolean r9 = r9.d()
            p2.g0 r2 = new p2.g0     // Catch: java.lang.Throwable -> L8c
            java.io.File r5 = r7.f31015a     // Catch: java.lang.Throwable -> L8c
            p2.s0 r6 = r7.f31016b     // Catch: java.lang.Throwable -> L8c
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L8c
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> L7d
            r0.f30990l = r7     // Catch: java.lang.Throwable -> L7d
            r0.f30991m = r2     // Catch: java.lang.Throwable -> L7d
            r0.f30992n = r9     // Catch: java.lang.Throwable -> L7d
            r0.f30995q = r3     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r8 = r8.invoke(r2, r5, r0)     // Catch: java.lang.Throwable -> L7d
            if (r8 != r1) goto L65
            return r1
        L65:
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r7
            r1 = r2
        L6a:
            r1.close()     // Catch: java.lang.Throwable -> L6f
            r1 = r4
            goto L70
        L6f:
            r1 = move-exception
        L70:
            if (r1 != 0) goto L7a
            if (r8 == 0) goto L79
            pk.c r8 = r0.f31020f
            r8.e(r4)
        L79:
            return r9
        L7a:
            throw r1     // Catch: java.lang.Throwable -> L7b
        L7b:
            r9 = move-exception
            goto L91
        L7d:
            r8 = move-exception
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r7
            r1 = r2
        L83:
            r1.close()     // Catch: java.lang.Throwable -> L87
            goto L8b
        L87:
            r1 = move-exception
            ij.d.a(r9, r1)     // Catch: java.lang.Throwable -> L7b
        L8b:
            throw r9     // Catch: java.lang.Throwable -> L7b
        L8c:
            r8 = move-exception
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r7
        L91:
            if (r8 == 0) goto L98
            pk.c r8 = r0.f31020f
            r8.e(r4)
        L98:
            throw r9
        L99:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "StorageConnection has already been disposed."
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.l0.a(p2.q, oj.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e9 A[Catch: all -> 0x012e, IOException -> 0x0130, TRY_ENTER, TryCatch #3 {IOException -> 0x0130, blocks: (B:44:0x00e9, B:46:0x00ef, B:48:0x0101, B:52:0x010d, B:53:0x012d, B:49:0x0106, B:61:0x013d, B:68:0x014a, B:67:0x0147), top: B:84:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013d A[Catch: all -> 0x012e, IOException -> 0x0130, TRY_ENTER, TRY_LEAVE, TryCatch #3 {IOException -> 0x0130, blocks: (B:44:0x00e9, B:46:0x00ef, B:48:0x0101, B:52:0x010d, B:53:0x012d, B:49:0x0106, B:61:0x013d, B:68:0x014a, B:67:0x0147), top: B:84:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(p2.d0 r12, oj.c r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.l0.b(p2.d0, oj.c):java.lang.Object");
    }

    @Override // p2.a
    public final void close() {
        this.f31019e.set(true);
        this.f31018d.invoke();
    }
}
