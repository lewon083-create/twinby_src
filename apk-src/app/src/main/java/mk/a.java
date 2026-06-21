package mk;

import hk.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d8.k f28904a = new d8.k("CLOSED", 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d8.k f28905b = new d8.k("UNDEFINED", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d8.k f28906c = new d8.k("REUSABLE_CLAIMED", 1);

    public static final void a(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(l7.o.i(i, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final Object b(r rVar, long j10, Function2 function2) {
        while (true) {
            if (rVar.f28938c >= j10 && !rVar.d()) {
                return rVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f28907a;
            Object obj = atomicReferenceFieldUpdater.get(rVar);
            d8.k kVar = f28904a;
            if (obj == kVar) {
                return kVar;
            }
            r rVar2 = (r) ((b) obj);
            if (rVar2 == null) {
                rVar2 = (r) function2.invoke(Long.valueOf(rVar.f28938c + 1), rVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(rVar, null, rVar2)) {
                    if (atomicReferenceFieldUpdater.get(rVar) != null) {
                        break;
                    }
                }
                if (rVar.d()) {
                    rVar.e();
                }
            }
            rVar = rVar2;
        }
    }

    public static final r c(Object obj) {
        if (obj != f28904a) {
            return (r) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(CoroutineContext coroutineContext, Throwable th2) {
        Throwable runtimeException;
        Iterator it = d.f28910a.iterator();
        while (it.hasNext()) {
            try {
                ((z) it.next()).handleException(coroutineContext, th2);
            } catch (Throwable th3) {
                if (th2 == th3) {
                    runtimeException = th2;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    ij.d.a(runtimeException, th2);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            ij.d.a(th2, new e(coroutineContext));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
    }

    public static final boolean e(Object obj) {
        return obj == f28904a;
    }

    public static final Object f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0099 A[Catch: all -> 0x0076, DONT_GENERATE, TryCatch #1 {all -> 0x0076, blocks: (B:19:0x0054, B:21:0x0062, B:23:0x0068, B:36:0x009c, B:26:0x0078, B:28:0x0086, B:33:0x0093, B:35:0x0099, B:41:0x00a9, B:44:0x00b2, B:43:0x00af, B:31:0x008c), top: B:55:0x0054, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void g(java.lang.Object r9, mj.a r10) {
        /*
            boolean r0 = r10 instanceof mk.f
            if (r0 == 0) goto Lbd
            mk.f r10 = (mk.f) r10
            hk.x r0 = r10.f28912e
            oj.c r1 = r10.f28913f
            java.lang.Throwable r2 = ij.m.a(r9)
            if (r2 != 0) goto L12
            r3 = r9
            goto L18
        L12:
            hk.t r3 = new hk.t
            r4 = 0
            r3.<init>(r2, r4)
        L18:
            kotlin.coroutines.CoroutineContext r2 = r1.getContext()
            boolean r2 = r0.k(r2)
            r4 = 1
            if (r2 == 0) goto L2f
            r10.f28914g = r3
            r10.f20674d = r4
            kotlin.coroutines.CoroutineContext r9 = r1.getContext()
            r0.j(r9, r10)
            return
        L2f:
            hk.u0 r0 = hk.u1.a()
            long r5 = r0.f20716d
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L51
            r10.f28914g = r3
            r10.f20674d = r4
            kotlin.collections.l r9 = r0.f20718f
            if (r9 != 0) goto L4d
            kotlin.collections.l r9 = new kotlin.collections.l
            r9.<init>()
            r0.f20718f = r9
        L4d:
            r9.addLast(r10)
            goto Lb7
        L51:
            r0.I(r4)
            kotlin.coroutines.CoroutineContext r2 = r1.getContext()     // Catch: java.lang.Throwable -> L76
            hk.b1 r3 = hk.b1.f20637b     // Catch: java.lang.Throwable -> L76
            kotlin.coroutines.CoroutineContext$Element r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L76
            hk.c1 r2 = (hk.c1) r2     // Catch: java.lang.Throwable -> L76
            if (r2 == 0) goto L78
            boolean r3 = r2.isActive()     // Catch: java.lang.Throwable -> L76
            if (r3 != 0) goto L78
            hk.k1 r2 = (hk.k1) r2     // Catch: java.lang.Throwable -> L76
            java.util.concurrent.CancellationException r9 = r2.v()     // Catch: java.lang.Throwable -> L76
            ij.l r9 = com.google.android.gms.internal.measurement.h5.s(r9)     // Catch: java.lang.Throwable -> L76
            r10.resumeWith(r9)     // Catch: java.lang.Throwable -> L76
            goto L9c
        L76:
            r9 = move-exception
            goto Lb3
        L78:
            java.lang.Object r2 = r10.f28915h     // Catch: java.lang.Throwable -> L76
            kotlin.coroutines.CoroutineContext r3 = r1.getContext()     // Catch: java.lang.Throwable -> L76
            java.lang.Object r2 = mk.u.c(r3, r2)     // Catch: java.lang.Throwable -> L76
            d8.k r5 = mk.u.f28941a     // Catch: java.lang.Throwable -> L76
            if (r2 == r5) goto L8b
            hk.z1 r5 = hk.v.c(r1, r3, r2)     // Catch: java.lang.Throwable -> L76
            goto L8c
        L8b:
            r5 = 0
        L8c:
            r1.resumeWith(r9)     // Catch: java.lang.Throwable -> La6
            kotlin.Unit r9 = kotlin.Unit.f27471a     // Catch: java.lang.Throwable -> La6
            if (r5 == 0) goto L99
            boolean r9 = r5.X()     // Catch: java.lang.Throwable -> L76
            if (r9 == 0) goto L9c
        L99:
            mk.u.a(r3, r2)     // Catch: java.lang.Throwable -> L76
        L9c:
            boolean r9 = r0.K()     // Catch: java.lang.Throwable -> L76
            if (r9 != 0) goto L9c
        La2:
            r0.m(r4)
            goto Lb7
        La6:
            r9 = move-exception
            if (r5 == 0) goto Laf
            boolean r1 = r5.X()     // Catch: java.lang.Throwable -> L76
            if (r1 == 0) goto Lb2
        Laf:
            mk.u.a(r3, r2)     // Catch: java.lang.Throwable -> L76
        Lb2:
            throw r9     // Catch: java.lang.Throwable -> L76
        Lb3:
            r10.i(r9)     // Catch: java.lang.Throwable -> Lb8
            goto La2
        Lb7:
            return
        Lb8:
            r9 = move-exception
            r0.m(r4)
            throw r9
        Lbd:
            r10.resumeWith(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mk.a.g(java.lang.Object, mj.a):void");
    }

    public static final long h(String str, long j10, long j11, long j12) {
        String property;
        int i = t.f28940a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j10;
        }
        Long lO = StringsKt.O(property);
        if (lO == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lO.longValue();
        if (j11 <= jLongValue && jLongValue <= j12) {
            return jLongValue;
        }
        StringBuilder sb2 = new StringBuilder("System property '");
        sb2.append(str);
        sb2.append("' should be in range ");
        sb2.append(j11);
        pe.a.s(sb2, "..", j12, ", but is '");
        sb2.append(jLongValue);
        sb2.append('\'');
        throw new IllegalStateException(sb2.toString().toString());
    }

    public static int i(int i, int i10, String str) {
        return (int) h(str, i, 1, (i10 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }
}
