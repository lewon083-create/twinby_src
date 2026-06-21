package yads;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class rt1 extends kotlin.jvm.internal.r implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ st1 f42721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f42722c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rt1(st1 st1Var, Map map) {
        super(1);
        this.f42721b = st1Var;
        this.f42722c = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a A[Catch: Exception -> 0x003d, TRY_LEAVE, TryCatch #1 {Exception -> 0x003d, blocks: (B:3:0x0010, B:13:0x002a, B:23:0x003a, B:21:0x0036, B:22:0x0039, B:6:0x0016, B:8:0x001a, B:12:0x0026, B:19:0x0034), top: B:30:0x0010, inners: #0, #2 }] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r9) {
        /*
            r8 = this;
            yads.ro2 r9 = (yads.ro2) r9
            yads.st1 r0 = r8.f42721b
            java.util.Map r1 = r8.f42722c
            yads.z11 r1 = r0.b(r9, r1)
            yads.a21 r0 = r0.f43077c
            r0.getClass()
            r2 = 0
            java.io.InputStream r0 = r1.f45225d     // Catch: java.lang.Exception -> L3d
            if (r0 == 0) goto L16
        L14:
            r3 = r0
            goto L24
        L16:
            byte[] r0 = r1.f45226e     // Catch: java.lang.Exception -> L3d
            if (r0 == 0) goto L22
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch: java.lang.Exception -> L3d
            byte[] r3 = r1.f45226e     // Catch: java.lang.Exception -> L3d
            r0.<init>(r3)     // Catch: java.lang.Exception -> L3d
            goto L14
        L22:
            r0 = 0
            goto L14
        L24:
            if (r3 == 0) goto L3a
            byte[] r0 = hl.d.w(r3)     // Catch: java.lang.Throwable -> L32
            r3.close()     // Catch: java.lang.Exception -> L3d
            if (r0 != 0) goto L30
            goto L3a
        L30:
            r4 = r0
            goto L40
        L32:
            r0 = move-exception
            r4 = r0
            throw r4     // Catch: java.lang.Throwable -> L35
        L35:
            r0 = move-exception
            hl.l.g(r3, r4)     // Catch: java.lang.Exception -> L3d
            throw r0     // Catch: java.lang.Exception -> L3d
        L3a:
            byte[] r0 = new byte[r2]     // Catch: java.lang.Exception -> L3d
            goto L30
        L3d:
            byte[] r0 = new byte[r2]
            goto L30
        L40:
            yads.z11 r0 = new yads.z11
            int r3 = r1.f45222a
            java.util.List r1 = r1.f45223b
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r0.<init>(r3, r1, r4)
            yads.h82 r2 = new yads.h82
            java.util.List r6 = java.util.Collections.unmodifiableList(r1)
            java.util.Map r5 = yads.h82.a(r6)
            r7 = 1
            r2.<init>(r3, r4, r5, r6, r7)
            long r3 = java.lang.System.currentTimeMillis()
            yads.xo2.a(r3, r9, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.rt1.invoke(java.lang.Object):java.lang.Object");
    }
}
