package p2;

import com.google.android.gms.internal.ads.cx0;
import hk.b1;
import hk.c1;
import hk.k1;
import hk.q1;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f30951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f30952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hk.a0 f30953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k6.t0 f30954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pk.c f30955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f30956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q1 f30957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m7.a f30958h;
    public final com.google.firebase.messaging.y i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ij.p f30959j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ij.p f30960k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final s7.g f30961l;

    public e0(i0 storage, List initTasksList, c corruptionHandler, hk.a0 scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        Intrinsics.checkNotNullParameter(corruptionHandler, "corruptionHandler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f30951a = storage;
        this.f30952b = corruptionHandler;
        this.f30953c = scope;
        this.f30954d = new k6.t0(new e6.b(this, null));
        this.f30955e = new pk.c();
        this.f30958h = new m7.a(12);
        com.google.firebase.messaging.y yVar = new com.google.firebase.messaging.y();
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        yVar.f14902e = this;
        yVar.f14899b = new pk.c();
        yVar.f14900c = new hk.r();
        yVar.f14901d = CollectionsKt.R(initTasksList);
        this.i = yVar;
        this.f30959j = ij.h.b(new n(this, 1));
        this.f30960k = ij.h.b(new n(this, 0));
        g6.b onComplete = new g6.b(3, this);
        cx0 consumeMessage = new cx0(this, (mj.a) null, 11);
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        b0 onUndeliveredElement = b0.f30933f;
        Intrinsics.checkNotNullParameter(onUndeliveredElement, "onUndeliveredElement");
        Intrinsics.checkNotNullParameter(consumeMessage, "consumeMessage");
        s7.g gVar = new s7.g();
        gVar.f32795b = scope;
        gVar.f32796c = consumeMessage;
        gVar.f32797d = jk.j.a(Integer.MAX_VALUE, null, 6);
        gVar.f32798e = new k6.t0(8);
        c1 c1Var = (c1) scope.e().get(b1.f20637b);
        if (c1Var != null) {
            int i = 1;
            ((k1) c1Var).E(true, new hk.n0(i, new d6.a(i, onComplete, gVar)));
        }
        this.f30961l = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(p2.e0 r4, oj.c r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof p2.s
            if (r0 == 0) goto L13
            r0 = r5
            p2.s r0 = (p2.s) r0
            int r1 = r0.f31062p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31062p = r1
            goto L18
        L13:
            p2.s r0 = new p2.s
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f31060n
            nj.a r1 = nj.a.f29512b
            int r2 = r0.f31062p
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            pk.c r4 = r0.f31059m
            p2.e0 r0 = r0.f31058l
            com.google.android.gms.internal.measurement.h5.E(r5)
            r5 = r4
            r4 = r0
            goto L47
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            com.google.android.gms.internal.measurement.h5.E(r5)
            pk.c r5 = r4.f30955e
            r0.f31058l = r4
            r0.f31059m = r5
            r0.f31062p = r3
            java.lang.Object r0 = r5.c(r0)
            if (r0 != r1) goto L47
            return r1
        L47:
            r0 = 0
            int r1 = r4.f30956f     // Catch: java.lang.Throwable -> L58
            int r1 = r1 + (-1)
            r4.f30956f = r1     // Catch: java.lang.Throwable -> L58
            if (r1 != 0) goto L5c
            hk.q1 r1 = r4.f30957g     // Catch: java.lang.Throwable -> L58
            if (r1 == 0) goto L5a
            r1.a(r0)     // Catch: java.lang.Throwable -> L58
            goto L5a
        L58:
            r4 = move-exception
            goto L64
        L5a:
            r4.f30957g = r0     // Catch: java.lang.Throwable -> L58
        L5c:
            kotlin.Unit r4 = kotlin.Unit.f27471a     // Catch: java.lang.Throwable -> L58
            r5.e(r0)
            kotlin.Unit r4 = kotlin.Unit.f27471a
            return r4
        L64:
            r5.e(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.e0.b(p2.e0, oj.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(2:4|(1:6)(1:7))(0)|8|(1:71)|(8:(1:(1:(2:18|19))(3:20|21|22))|13|14|51|64|(1:66)(1:67)|68|69)(5:23|70|24|(3:26|73|27)(3:37|(1:39)(1:40)|(2:42|(2:44|(1:46))(2:55|56))(2:57|(2:59|60)(2:61|62)))|50)|47|75|48) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        if (r9 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        r8 = r11;
        r11 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b7, code lost:
    
        if (r9 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bd, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v7, types: [kotlin.jvm.functions.Function2, oj.i] */
    /* JADX WARN: Type inference failed for: r2v8, types: [kotlin.jvm.functions.Function2, oj.i] */
    /* JADX WARN: Type inference failed for: r9v0, types: [p2.e0] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [p2.e0] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(p2.e0 r9, p2.p0 r10, oj.c r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.e0.c(p2.e0, p2.p0, oj.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(p2.e0 r4, oj.c r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof p2.u
            if (r0 == 0) goto L13
            r0 = r5
            p2.u r0 = (p2.u) r0
            int r1 = r0.f31078p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31078p = r1
            goto L18
        L13:
            p2.u r0 = new p2.u
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f31076n
            nj.a r1 = nj.a.f29512b
            int r2 = r0.f31078p
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            pk.c r4 = r0.f31075m
            p2.e0 r0 = r0.f31074l
            com.google.android.gms.internal.measurement.h5.E(r5)
            r5 = r4
            r4 = r0
            goto L47
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            com.google.android.gms.internal.measurement.h5.E(r5)
            pk.c r5 = r4.f30955e
            r0.f31074l = r4
            r0.f31075m = r5
            r0.f31078p = r3
            java.lang.Object r0 = r5.c(r0)
            if (r0 != r1) goto L47
            return r1
        L47:
            r0 = 0
            int r1 = r4.f30956f     // Catch: java.lang.Throwable -> L5e
            int r1 = r1 + r3
            r4.f30956f = r1     // Catch: java.lang.Throwable -> L5e
            if (r1 != r3) goto L60
            hk.a0 r1 = r4.f30953c     // Catch: java.lang.Throwable -> L5e
            p2.o r2 = new p2.o     // Catch: java.lang.Throwable -> L5e
            r2.<init>(r4, r0, r3)     // Catch: java.lang.Throwable -> L5e
            r3 = 3
            hk.q1 r1 = hk.c0.m(r1, r0, r2, r3)     // Catch: java.lang.Throwable -> L5e
            r4.f30957g = r1     // Catch: java.lang.Throwable -> L5e
            goto L60
        L5e:
            r4 = move-exception
            goto L68
        L60:
            kotlin.Unit r4 = kotlin.Unit.f27471a     // Catch: java.lang.Throwable -> L5e
            r5.e(r0)
            kotlin.Unit r4 = kotlin.Unit.f27471a
            return r4
        L68:
            r5.e(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.e0.d(p2.e0, oj.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(p2.e0 r8, boolean r9, mj.a r10) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.e0.e(p2.e0, boolean, mj.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009f A[Catch: b -> 0x005f, TryCatch #2 {b -> 0x005f, blocks: (B:19:0x005a, B:54:0x00ff, B:24:0x0068, B:51:0x00e0, B:32:0x0085, B:40:0x009f, B:42:0x00a5, B:36:0x008e, B:48:0x00cd), top: B:81:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013c A[Catch: all -> 0x0169, TryCatch #1 {all -> 0x0169, blocks: (B:61:0x012a, B:63:0x013c, B:64:0x0144), top: B:80:0x012a }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0144 A[Catch: all -> 0x0169, TRY_LEAVE, TryCatch #1 {all -> 0x0169, blocks: (B:61:0x012a, B:63:0x013c, B:64:0x0144), top: B:80:0x012a }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(p2.e0 r9, boolean r10, oj.c r11) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.e0.f(p2.e0, boolean, oj.c):java.lang.Object");
    }

    @Override // p2.h
    public final Object a(Function2 function2, oj.c cVar) {
        y0 y0Var = (y0) cVar.getContext().get(i.f30981b);
        if (y0Var != null) {
            y0Var.c(this);
        }
        return hk.c0.t(new y0(y0Var, this), new e6.b(this, function2, null), cVar);
    }

    public final v0 g() {
        return (v0) this.f30960k.getValue();
    }

    @Override // p2.h
    public final kk.e getData() {
        return this.f30954d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (r4.w(r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(oj.c r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p2.v
            if (r0 == 0) goto L13
            r0 = r6
            p2.v r0 = (p2.v) r0
            int r1 = r0.f31088p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31088p = r1
            goto L18
        L13:
            p2.v r0 = new p2.v
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f31086n
            nj.a r1 = nj.a.f29512b
            int r2 = r0.f31088p
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            int r1 = r0.f31085m
            p2.e0 r0 = r0.f31084l
            com.google.android.gms.internal.measurement.h5.E(r6)     // Catch: java.lang.Throwable -> L2e
            goto L66
        L2e:
            r6 = move-exception
            goto L6d
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L38:
            p2.e0 r2 = r0.f31084l
            com.google.android.gms.internal.measurement.h5.E(r6)
            goto L51
        L3e:
            com.google.android.gms.internal.measurement.h5.E(r6)
            p2.v0 r6 = r5.g()
            r0.f31084l = r5
            r0.f31088p = r4
            java.lang.Integer r6 = r6.a()
            if (r6 != r1) goto L50
            goto L65
        L50:
            r2 = r5
        L51:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            com.google.firebase.messaging.y r4 = r2.i     // Catch: java.lang.Throwable -> L69
            r0.f31084l = r2     // Catch: java.lang.Throwable -> L69
            r0.f31085m = r6     // Catch: java.lang.Throwable -> L69
            r0.f31088p = r3     // Catch: java.lang.Throwable -> L69
            java.lang.Object r6 = r4.w(r0)     // Catch: java.lang.Throwable -> L69
            if (r6 != r1) goto L66
        L65:
            return r1
        L66:
            kotlin.Unit r6 = kotlin.Unit.f27471a
            return r6
        L69:
            r0 = move-exception
            r1 = r6
            r6 = r0
            r0 = r2
        L6d:
            m7.a r0 = r0.f30958h
            p2.q0 r2 = new p2.q0
            r2.<init>(r6, r1)
            r0.u(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.e0.h(oj.c):java.lang.Object");
    }

    public final Object i(oj.c cVar) {
        return ((l0) this.f30959j.getValue()).a(new q(3, (mj.a) null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(java.lang.Object r11, boolean r12, oj.c r13) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r13 instanceof p2.c0
            if (r0 == 0) goto L13
            r0 = r13
            p2.c0 r0 = (p2.c0) r0
            int r1 = r0.f30937o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30937o = r1
            goto L18
        L13:
            p2.c0 r0 = new p2.c0
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.f30935m
            nj.a r1 = nj.a.f29512b
            int r2 = r0.f30937o
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.jvm.internal.e0 r11 = r0.f30934l
            com.google.android.gms.internal.measurement.h5.E(r13)
            goto L56
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            com.google.android.gms.internal.measurement.h5.E(r13)
            kotlin.jvm.internal.e0 r5 = new kotlin.jvm.internal.e0
            r5.<init>()
            ij.p r13 = r10.f30959j
            java.lang.Object r13 = r13.getValue()
            p2.l0 r13 = (p2.l0) r13
            p2.d0 r4 = new p2.d0
            r9 = 0
            r6 = r10
            r7 = r11
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f30934l = r5
            r0.f30937o = r3
            java.lang.Object r11 = r13.b(r4, r0)
            if (r11 != r1) goto L55
            return r1
        L55:
            r11 = r5
        L56:
            int r11 = r11.f27508b
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.e0.j(java.lang.Object, boolean, oj.c):java.lang.Object");
    }
}
