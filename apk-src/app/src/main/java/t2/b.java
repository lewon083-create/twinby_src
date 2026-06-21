package t2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import k6.t0;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i0;
import kotlin.collections.t;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f33396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f33397b;

    public b(LinkedHashMap preferencesMap, boolean z5) {
        Intrinsics.checkNotNullParameter(preferencesMap, "preferencesMap");
        this.f33396a = preferencesMap;
        this.f33397b = new t0(z5);
    }

    public final Map a() {
        Pair pair;
        Set<Map.Entry> setEntrySet = this.f33396a.entrySet();
        int iB = i0.b(t.j(setEntrySet, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap map = new LinkedHashMap(iB);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
                pair = new Pair(key, bArrCopyOf);
            } else {
                pair = new Pair(entry.getKey(), entry.getValue());
            }
            map.put(pair.f27469b, pair.f27470c);
        }
        Intrinsics.checkNotNullParameter(map, "map");
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(map)");
        return mapUnmodifiableMap;
    }

    public final void b() {
        if (((AtomicBoolean) this.f33397b.f27180c).get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final Object c(e key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.f33396a.get(key);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    public final void d(e key) {
        Intrinsics.checkNotNullParameter(key, "key");
        b();
        this.f33396a.remove(key);
    }

    public final void e(e key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        f(key, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof t2.b
            r1 = 0
            if (r0 != 0) goto L6
            goto L60
        L6:
            t2.b r7 = (t2.b) r7
            java.util.LinkedHashMap r7 = r7.f33396a
            java.util.LinkedHashMap r0 = r6.f33396a
            r2 = 1
            if (r7 != r0) goto L10
            goto L61
        L10:
            int r3 = r7.size()
            int r4 = r0.size()
            if (r3 == r4) goto L1b
            goto L60
        L1b:
            boolean r3 = r7.isEmpty()
            if (r3 == 0) goto L22
            goto L61
        L22:
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L2a:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L61
            java.lang.Object r3 = r7.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r4 = r0.get(r4)
            if (r4 == 0) goto L5d
            java.lang.Object r3 = r3.getValue()
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L58
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L5d
            byte[] r3 = (byte[]) r3
            byte[] r4 = (byte[]) r4
            boolean r3 = java.util.Arrays.equals(r3, r4)
            if (r3 == 0) goto L5d
            r3 = r2
            goto L5e
        L58:
            boolean r3 = kotlin.jvm.internal.Intrinsics.a(r3, r4)
            goto L5e
        L5d:
            r3 = r1
        L5e:
            if (r3 != 0) goto L2a
        L60:
            return r1
        L61:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.b.equals(java.lang.Object):boolean");
    }

    public final void f(e key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        b();
        if (obj == null) {
            d(key);
            return;
        }
        boolean z5 = obj instanceof Set;
        LinkedHashMap linkedHashMap = this.f33396a;
        if (z5) {
            Set set = (Set) obj;
            Intrinsics.checkNotNullParameter(set, "set");
            Set setUnmodifiableSet = Collections.unmodifiableSet(CollectionsKt.V(set));
            Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(set.toSet())");
            linkedHashMap.put(key, setUnmodifiableSet);
            return;
        }
        if (!(obj instanceof byte[])) {
            linkedHashMap.put(key, obj);
            return;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
        linkedHashMap.put(key, bArrCopyOf);
    }

    public final int hashCode() {
        Iterator it = this.f33396a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return CollectionsKt.I(this.f33396a.entrySet(), ",\n", "{\n", "\n}", a.f33395f, 24);
    }

    public /* synthetic */ b(boolean z5) {
        this(new LinkedHashMap(), z5);
    }
}
