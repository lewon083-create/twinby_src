package yads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class dj0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f37779e = new AtomicBoolean(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f37780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f37781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a5 f37782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e11 f37783d;

    public /* synthetic */ dj0(Context context, w5 w5Var) {
        this(w5Var, context.getApplicationContext(), new a5(), new e11());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(mj.a r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof yads.zi0
            if (r0 == 0) goto L13
            r0 = r8
            yads.zi0 r0 = (yads.zi0) r0
            int r1 = r0.f45426f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45426f = r1
            goto L18
        L13:
            yads.zi0 r0 = new yads.zi0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f45424d
            nj.a r1 = nj.a.f29512b
            int r2 = r0.f45426f
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            yads.v5 r1 = r0.f45423c
            yads.w5 r0 = r0.f45422b
            com.google.android.gms.internal.measurement.h5.E(r8)     // Catch: java.lang.Throwable -> L2b
            goto L6a
        L2b:
            r8 = move-exception
            goto L67
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            com.google.android.gms.internal.measurement.h5.E(r8)
            java.util.concurrent.atomic.AtomicBoolean r8 = yads.dj0.f37779e
            r2 = 0
            boolean r8 = r8.getAndSet(r2)
            if (r8 == 0) goto L6f
            yads.w5 r8 = r7.f37780a
            yads.v5 r2 = yads.v5.f43894z
            r8.b(r2)
            hk.x r4 = yads.w10.a()     // Catch: java.lang.Throwable -> L62
            yads.aj0 r5 = new yads.aj0     // Catch: java.lang.Throwable -> L62
            r6 = 0
            r5.<init>(r7, r6)     // Catch: java.lang.Throwable -> L62
            r0.f45422b = r8     // Catch: java.lang.Throwable -> L62
            r0.f45423c = r2     // Catch: java.lang.Throwable -> L62
            r0.f45426f = r3     // Catch: java.lang.Throwable -> L62
            java.lang.Object r0 = hk.c0.t(r4, r5, r0)     // Catch: java.lang.Throwable -> L62
            if (r0 != r1) goto L5f
            return r1
        L5f:
            r0 = r8
            r1 = r2
            goto L6a
        L62:
            r0 = move-exception
            r1 = r0
            r0 = r8
            r8 = r1
            r1 = r2
        L67:
            r8.getMessage()
        L6a:
            kotlin.Unit r8 = kotlin.Unit.f27471a
            r0.a(r1)
        L6f:
            kotlin.Unit r8 = kotlin.Unit.f27471a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.dj0.a(mj.a):java.lang.Object");
    }

    public dj0(w5 w5Var, Context context, a5 a5Var, e11 e11Var) {
        this.f37780a = w5Var;
        this.f37781b = context;
        this.f37782c = a5Var;
        this.f37783d = e11Var;
    }

    public final void a(String str) {
        this.f37783d.a(2000, str);
    }
}
