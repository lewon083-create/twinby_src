package lk;

import a0.u;
import com.google.android.gms.internal.ads.cx0;
import hk.a0;
import hk.b0;
import hk.c0;
import hk.v;
import java.util.ArrayList;
import jk.p;
import jk.q;
import jk.r;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineContext f28132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jk.a f28134d;

    public b(CoroutineContext coroutineContext, int i, jk.a aVar) {
        this.f28132b = coroutineContext;
        this.f28133c = i;
        this.f28134d = aVar;
    }

    public String a() {
        return null;
    }

    public abstract Object b(q qVar, mj.a aVar);

    public abstract b c(CoroutineContext coroutineContext, int i, jk.a aVar);

    public r d(a0 a0Var) {
        int i = this.f28133c;
        if (i == -3) {
            i = -2;
        }
        b0 b0Var = b0.f20635d;
        Function2 cx0Var = new cx0(this, (mj.a) null, 4);
        p pVar = new p(v.b(a0Var, this.f28132b), jk.j.a(i, this.f28134d, 4));
        pVar.W(b0Var, pVar, cx0Var);
        return pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // lk.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kk.e j(kotlin.coroutines.CoroutineContext r5, int r6, jk.a r7) {
        /*
            r4 = this;
            kotlin.coroutines.CoroutineContext r0 = r4.f28132b
            kotlin.coroutines.CoroutineContext r5 = r5.plus(r0)
            jk.a r1 = jk.a.f26675b
            jk.a r2 = r4.f28134d
            int r3 = r4.f28133c
            if (r7 == r1) goto Lf
            goto L26
        Lf:
            r7 = -3
            if (r3 != r7) goto L13
            goto L25
        L13:
            if (r6 != r7) goto L17
        L15:
            r6 = r3
            goto L25
        L17:
            r7 = -2
            if (r3 != r7) goto L1b
            goto L25
        L1b:
            if (r6 != r7) goto L1e
            goto L15
        L1e:
            int r6 = r6 + r3
            if (r6 < 0) goto L22
            goto L25
        L22:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L25:
            r7 = r2
        L26:
            boolean r0 = kotlin.jvm.internal.Intrinsics.a(r5, r0)
            if (r0 == 0) goto L31
            if (r6 != r3) goto L31
            if (r7 != r2) goto L31
            return r4
        L31:
            lk.b r5 = r4.c(r5, r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lk.b.j(kotlin.coroutines.CoroutineContext, int, jk.a):kk.e");
    }

    @Override // kk.e
    public Object p(kk.f fVar, mj.a aVar) throws Throwable {
        Object objE = c0.e(new e6.b(fVar, this, null, 2), aVar);
        return objE == nj.a.f29512b ? objE : Unit.f27471a;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strA = a();
        if (strA != null) {
            arrayList.add(strA);
        }
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f27499b;
        CoroutineContext coroutineContext = this.f28132b;
        if (coroutineContext != gVar) {
            arrayList.add("context=" + coroutineContext);
        }
        int i = this.f28133c;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        jk.a aVar = jk.a.f26675b;
        jk.a aVar2 = this.f28134d;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        return u.n(sb2, CollectionsKt.I(arrayList, ", ", null, null, null, 62), ']');
    }
}
