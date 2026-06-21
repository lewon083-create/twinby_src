package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class un extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d4 f43726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f43727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f43728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zn f43729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ua3 f43730f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hp f43731g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un(zn znVar, ua3 ua3Var, hp hpVar, mj.a aVar) {
        super(2, aVar);
        this.f43729e = znVar;
        this.f43730f = ua3Var;
        this.f43731g = hpVar;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        un unVar = new un(this.f43729e, this.f43730f, this.f43731g, aVar);
        unVar.f43728d = obj;
        return unVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((un) create((hk.a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // oj.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            nj.a r0 = nj.a.f29512b
            int r1 = r9.f43727c
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L28
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L16
            java.lang.Object r0 = r9.f43728d
            yads.d4 r0 = (yads.d4) r0
            com.google.android.gms.internal.measurement.h5.E(r10)
            goto L73
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            yads.d4 r1 = r9.f43726b
            java.lang.Object r4 = r9.f43728d
            hk.f0 r4 = (hk.f0) r4
            com.google.android.gms.internal.measurement.h5.E(r10)
            goto L5c
        L28:
            com.google.android.gms.internal.measurement.h5.E(r10)
            java.lang.Object r10 = r9.f43728d
            hk.a0 r10 = (hk.a0) r10
            yads.tn r1 = new yads.tn
            yads.zn r6 = r9.f43729e
            yads.hp r7 = r9.f43731g
            r1.<init>(r6, r7, r5)
            hk.g0 r1 = hk.c0.b(r10, r1, r2)
            yads.sn r6 = new yads.sn
            yads.zn r7 = r9.f43729e
            yads.hp r8 = r9.f43731g
            r6.<init>(r7, r8, r5)
            hk.g0 r10 = hk.c0.b(r10, r6, r2)
            yads.zn r6 = r9.f43729e
            yads.d4 r6 = r6.f45468c
            r9.f43728d = r1
            r9.f43726b = r6
            r9.f43727c = r4
            java.lang.Object r10 = r10.m(r9)
            if (r10 != r0) goto L5a
            goto L70
        L5a:
            r4 = r1
            r1 = r6
        L5c:
            java.lang.String r10 = (java.lang.String) r10
            r1.f37620h = r10
            yads.zn r10 = r9.f43729e
            yads.d4 r10 = r10.f45468c
            r9.f43728d = r10
            r9.f43726b = r5
            r9.f43727c = r3
            java.lang.Object r1 = r4.d(r9)
            if (r1 != r0) goto L71
        L70:
            return r0
        L71:
            r0 = r10
            r10 = r1
        L73:
            java.lang.String r10 = (java.lang.String) r10
            r0.i = r10
            yads.zn r10 = r9.f43729e
            yads.w5 r10 = r10.f45467b
            yads.v5 r0 = yads.v5.f43876g
            r10.a(r0)
            yads.zn r10 = r9.f43729e
            yads.ua3 r0 = r9.f43730f
            monitor-enter(r10)
            hk.a0 r1 = r10.f45470e     // Catch: java.lang.Throwable -> L93
            yads.qn r3 = new yads.qn     // Catch: java.lang.Throwable -> L93
            r3.<init>(r10, r0, r5)     // Catch: java.lang.Throwable -> L93
            hk.c0.m(r1, r5, r3, r2)     // Catch: java.lang.Throwable -> L93
            monitor-exit(r10)
            kotlin.Unit r10 = kotlin.Unit.f27471a
            return r10
        L93:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.un.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
