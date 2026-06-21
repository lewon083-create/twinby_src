package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class p80 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public pk.a f41832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q80 f41833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q80 f41834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f41835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f41836f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q80 f41837g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f41838h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p80(q80 q80Var, boolean z5, mj.a aVar) {
        super(2, aVar);
        this.f41837g = q80Var;
        this.f41838h = z5;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new p80(this.f41837g, this.f41838h, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new p80(this.f41837g, this.f41838h, (mj.a) obj2).invokeSuspend(Unit.f27471a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    @Override // oj.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            nj.a r0 = nj.a.f29512b
            int r1 = r7.f41836f
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L31
            if (r1 == r3) goto L26
            if (r1 != r2) goto L1e
            yads.q80 r0 = r7.f41834d
            yads.q80 r1 = r7.f41833c
            pk.a r2 = r7.f41832b
            com.google.android.gms.internal.measurement.h5.E(r8)     // Catch: java.lang.Throwable -> L1b
            ij.m r8 = (ij.m) r8     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r8 = r8.f21342b     // Catch: java.lang.Throwable -> L1b
            goto L6c
        L1b:
            r8 = move-exception
            goto L8c
        L1e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L26:
            boolean r1 = r7.f41835e
            yads.q80 r3 = r7.f41833c
            pk.a r5 = r7.f41832b
            com.google.android.gms.internal.measurement.h5.E(r8)
            r8 = r3
            goto L4e
        L31:
            com.google.android.gms.internal.measurement.h5.E(r8)
            yads.q80 r8 = r7.f41837g
            pk.a r1 = r8.f42216f
            boolean r5 = r7.f41838h
            r7.f41832b = r1
            r7.f41833c = r8
            r7.f41835e = r5
            r7.f41836f = r3
            pk.c r1 = (pk.c) r1
            java.lang.Object r3 = r1.c(r7)
            if (r3 != r0) goto L4b
            goto L67
        L4b:
            r6 = r5
            r5 = r1
            r1 = r6
        L4e:
            yads.j80 r3 = r8.f42215e     // Catch: java.lang.Throwable -> L8e
            if (r3 == 0) goto L57
            if (r1 == 0) goto L55
            goto L57
        L55:
            r2 = r5
            goto L78
        L57:
            yads.en2 r1 = r8.f42212b     // Catch: java.lang.Throwable -> L8e
            r7.f41832b = r5     // Catch: java.lang.Throwable -> L8e
            r7.f41833c = r8     // Catch: java.lang.Throwable -> L8e
            r7.f41834d = r8     // Catch: java.lang.Throwable -> L8e
            r7.f41836f = r2     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r1 = r1.a(r7)     // Catch: java.lang.Throwable -> L8e
            if (r1 != r0) goto L68
        L67:
            return r0
        L68:
            r0 = r8
            r2 = r5
            r8 = r1
            r1 = r0
        L6c:
            ij.k r3 = ij.m.f21341c     // Catch: java.lang.Throwable -> L1b
            boolean r3 = r8 instanceof ij.l     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto L73
            r8 = r4
        L73:
            yads.j80 r8 = (yads.j80) r8     // Catch: java.lang.Throwable -> L1b
            r0.f42215e = r8     // Catch: java.lang.Throwable -> L1b
            r8 = r1
        L78:
            yads.rg1 r0 = r8.f42211a     // Catch: java.lang.Throwable -> L1b
            yads.b80 r0 = r0.a()     // Catch: java.lang.Throwable -> L1b
            yads.v50 r1 = r8.f42213c     // Catch: java.lang.Throwable -> L1b
            yads.j80 r8 = r8.f42215e     // Catch: java.lang.Throwable -> L1b
            yads.u50 r8 = r1.a(r0, r8)     // Catch: java.lang.Throwable -> L1b
            pk.c r2 = (pk.c) r2
            r2.e(r4)
            return r8
        L8c:
            r5 = r2
            goto L8f
        L8e:
            r8 = move-exception
        L8f:
            pk.c r5 = (pk.c) r5
            r5.e(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.p80.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
