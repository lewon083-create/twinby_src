package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class mf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f40907a;

    public mf(Set set) {
        this.f40907a = set;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0009 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList a(java.util.ArrayList r6) {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L9:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L4a
            java.lang.Object r1 = r6.next()
            yads.lf r1 = (yads.lf) r1
            ij.g r2 = yads.sf.f42923a     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = r1.f40517c     // Catch: java.lang.Throwable -> L43
            java.util.LinkedHashMap r2 = yads.sf.a(r2)     // Catch: java.lang.Throwable -> L43
            java.util.Set r3 = r2.keySet()     // Catch: java.lang.Throwable -> L43
            java.lang.Object r3 = kotlin.collections.CollectionsKt.E(r3)     // Catch: java.lang.Throwable -> L43
            java.lang.Thread r3 = (java.lang.Thread) r3     // Catch: java.lang.Throwable -> L43
            if (r3 != 0) goto L2a
            goto L43
        L2a:
            java.lang.Object r3 = r2.get(r3)     // Catch: java.lang.Throwable -> L43
            java.lang.StackTraceElement[] r3 = (java.lang.StackTraceElement[]) r3     // Catch: java.lang.Throwable -> L43
            if (r3 != 0) goto L33
            goto L43
        L33:
            java.util.Set r4 = yads.k33.f40059a     // Catch: java.lang.Throwable -> L43
            java.util.Set r4 = r5.f40907a     // Catch: java.lang.Throwable -> L43
            boolean r3 = yads.k33.a(r3, r4)     // Catch: java.lang.Throwable -> L43
            if (r3 == 0) goto L43
            yads.pb2 r3 = new yads.pb2     // Catch: java.lang.Throwable -> L43
            r3.<init>(r1, r2)     // Catch: java.lang.Throwable -> L43
            goto L44
        L43:
            r3 = 0
        L44:
            if (r3 == 0) goto L9
            r0.add(r3)
            goto L9
        L4a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.mf.a(java.util.ArrayList):java.util.ArrayList");
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String str = ((lf) obj).f40517c;
            Intrinsics.checkNotNullParameter(str, "<this>");
            Sequence pVar = new ek.p(3, str);
            Intrinsics.checkNotNullParameter(pVar, "<this>");
            Iterator it = (pVar instanceof ek.d ? ((ek.d) pVar).take() : new ek.w(pVar)).iterator();
            while (true) {
                if (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (kotlin.text.a0.n(StringsKt.P(str2).toString(), "at ", false)) {
                        Set set = k33.f40059a;
                        if (!(set instanceof Collection) || !set.isEmpty()) {
                            Iterator it2 = set.iterator();
                            while (it2.hasNext()) {
                                if (StringsKt.y(str2, (String) it2.next(), false)) {
                                    arrayList.add(obj);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
