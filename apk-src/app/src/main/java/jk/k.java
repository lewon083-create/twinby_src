package jk;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends mk.r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f26714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f26715f;

    public k(long j10, k kVar, c cVar, int i) {
        super(j10, kVar, i);
        this.f26714e = cVar;
        this.f26715f = new AtomicReferenceArray(e.f26693b * 2);
    }

    @Override // mk.r
    public final int g() {
        return e.f26693b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
    
        n(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
    
        kotlin.jvm.internal.Intrinsics.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    @Override // mk.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(int r5, kotlin.coroutines.CoroutineContext r6) {
        /*
            r4 = this;
            int r6 = jk.e.f26693b
            if (r5 < r6) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r5 = r5 - r6
        La:
            int r6 = r5 * 2
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r4.f26715f
            r1.get(r6)
        L11:
            java.lang.Object r6 = r4.l(r5)
            boolean r1 = r6 instanceof hk.b2
            jk.c r2 = r4.f26714e
            r3 = 0
            if (r1 != 0) goto L62
            boolean r1 = r6 instanceof jk.t
            if (r1 == 0) goto L21
            goto L62
        L21:
            d8.k r1 = jk.e.f26700j
            if (r6 == r1) goto L59
            d8.k r1 = jk.e.f26701k
            if (r6 != r1) goto L2a
            goto L59
        L2a:
            d8.k r1 = jk.e.f26698g
            if (r6 == r1) goto L11
            d8.k r1 = jk.e.f26697f
            if (r6 != r1) goto L33
            goto L11
        L33:
            d8.k r5 = jk.e.i
            if (r6 == r5) goto L7c
            d8.k r5 = jk.e.f26695d
            if (r6 != r5) goto L3c
            goto L7c
        L3c:
            d8.k r5 = jk.e.f26702l
            if (r6 != r5) goto L41
            goto L7c
        L41:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "unexpected state: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L59:
            r4.n(r5, r3)
            if (r0 == 0) goto L7c
            kotlin.jvm.internal.Intrinsics.b(r2)
            return
        L62:
            if (r0 == 0) goto L67
            d8.k r1 = jk.e.f26700j
            goto L69
        L67:
            d8.k r1 = jk.e.f26701k
        L69:
            boolean r6 = r4.k(r5, r6, r1)
            if (r6 == 0) goto L11
            r4.n(r5, r3)
            r6 = r0 ^ 1
            r4.m(r5, r6)
            if (r0 == 0) goto L7c
            kotlin.jvm.internal.Intrinsics.b(r2)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jk.k.h(int, kotlin.coroutines.CoroutineContext):void");
    }

    public final boolean k(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i10 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.f26715f;
            if (atomicReferenceArray.compareAndSet(i10, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i10) == obj);
        return false;
    }

    public final Object l(int i) {
        return this.f26715f.get((i * 2) + 1);
    }

    public final void m(int i, boolean z5) {
        if (z5) {
            c cVar = this.f26714e;
            Intrinsics.b(cVar);
            cVar.C((this.f28938c * ((long) e.f26693b)) + ((long) i));
        }
        i();
    }

    public final void n(int i, Object obj) {
        this.f26715f.set(i * 2, obj);
    }

    public final void o(int i, Object obj) {
        this.f26715f.set((i * 2) + 1, obj);
    }
}
