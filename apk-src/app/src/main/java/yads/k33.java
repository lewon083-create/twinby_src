package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k33 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f40059a;

    static {
        String[] elements = {"com.yandex.mobile.ads", "yads", "com.monetization.ads", "com.yandex.div"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f40059a = kotlin.collections.p.w(elements);
    }

    public static boolean a(StackTraceElement stackTraceElement, Set set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (((cn0) obj).f37441a == dn0.f37842b) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (StringsKt.y(stackTraceElement.toString(), ((cn0) it.next()).f37442b, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c9, code lost:
    
        r3 = (java.lang.StackTraceElement) kotlin.collections.p.o(r1, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00cf, code lost:
    
        if (r3 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d1, code lost:
    
        r3 = r3.getClassName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d5, code lost:
    
        if (r3 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x007f, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086 A[LOOP:4: B:37:0x0086->B:95:?, LOOP_LABEL: LOOP:4: B:37:0x0086->B:95:?, LOOP_START, PHI: r1
      0x0086: PHI (r1v6 int) = (r1v5 int), (r1v7 int) binds: [B:35:0x0083, B:95:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0082 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(java.lang.StackTraceElement[] r8, java.util.Set r9) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.k33.a(java.lang.StackTraceElement[], java.util.Set):boolean");
    }
}
