package p2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends oj.i implements Function2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Iterator f30970l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public r2.c f30971m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f30972n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f30973o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f30974p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ List f30975q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ArrayList f30976r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(List list, ArrayList arrayList, mj.a aVar) {
        super(2, aVar);
        this.f30975q = list;
        this.f30976r = arrayList;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        g gVar = new g(this.f30975q, this.f30976r, aVar);
        gVar.f30974p = obj;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create(obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0098 A[RETURN] */
    @Override // oj.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            nj.a r0 = nj.a.f29512b
            int r1 = r10.f30973o
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2f
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.util.Iterator r1 = r10.f30970l
            java.lang.Object r4 = r10.f30974p
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.h5.E(r11)
            goto L3e
        L16:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1e:
            java.lang.Object r1 = r10.f30972n
            r2.c r4 = r10.f30971m
            java.util.Iterator r5 = r10.f30970l
            java.lang.Object r6 = r10.f30974p
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.h5.E(r11)
            r9 = r6
            r6 = r4
            r4 = r9
            goto L60
        L2f:
            com.google.android.gms.internal.measurement.h5.E(r11)
            java.lang.Object r11 = r10.f30974p
            java.util.List r1 = r10.f30975q
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            java.util.ArrayList r4 = r10.f30976r
        L3e:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L98
            java.lang.Object r5 = r1.next()
            r2.c r5 = (r2.c) r5
            r10.f30974p = r4
            r10.f30970l = r1
            r10.f30971m = r5
            r10.f30972n = r11
            r10.f30973o = r3
            java.lang.Object r6 = r5.a(r11, r10)
            if (r6 != r0) goto L5b
            goto L93
        L5b:
            r9 = r1
            r1 = r11
            r11 = r6
            r6 = r5
            r5 = r9
        L60:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L96
            p2.f r11 = new p2.f
            r7 = 0
            r8 = 0
            r11.<init>(r6, r8, r7)
            r4.add(r11)
            r10.f30974p = r4
            r10.f30970l = r5
            r10.f30971m = r8
            r10.f30972n = r8
            r10.f30973o = r2
            s2.j r11 = r6.f32179b
            r2.e r7 = new r2.e
            ij.p r8 = r6.f32182e
            java.lang.Object r8 = r8.getValue()
            android.content.SharedPreferences r8 = (android.content.SharedPreferences) r8
            java.util.LinkedHashSet r6 = r6.f32183f
            r7.<init>(r8, r6)
            java.lang.Object r11 = r11.invoke(r7, r1, r10)
            if (r11 != r0) goto L94
        L93:
            return r0
        L94:
            r1 = r5
            goto L3e
        L96:
            r11 = r1
            goto L94
        L98:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
