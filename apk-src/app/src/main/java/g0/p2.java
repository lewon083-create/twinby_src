package g0;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k2 f19713e = k2.f19634c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m2[] f19714f = {m2.f19661f, m2.f19663h, m2.i, m2.f19665k, m2.f19666l, m2.f19660e};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f19715g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final LinkedHashMap f19716h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o2 f19717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m2 f19718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k2 f19719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19720d;

    static {
        Map mapG = kotlin.collections.j0.g(new Pair(o2.f19706c, 35), new Pair(o2.f19707d, 256), new Pair(o2.f19708e, 4101), new Pair(o2.f19709f, 32), new Pair(o2.f19705b, 34));
        f19715g = mapG;
        Set<Map.Entry> setEntrySet = mapG.entrySet();
        int iB = kotlin.collections.i0.b(kotlin.collections.t.j(setEntrySet, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (o2) entry.getKey());
        }
        f19716h = linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public p2(o2 configType, m2 configSize, k2 streamUseCase) {
        Intrinsics.checkNotNullParameter(configType, "configType");
        Intrinsics.checkNotNullParameter(configSize, "configSize");
        Intrinsics.checkNotNullParameter(streamUseCase, "streamUseCase");
        this.f19717a = configType;
        this.f19718b = configSize;
        this.f19719c = streamUseCase;
        Integer num = (Integer) f19715g.get(configType);
        this.f19720d = num != null ? num.intValue() : 0;
    }

    public static final p2 a(o2 type, m2 size) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(size, "size");
        return ya.e.e(type, size, f19713e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        return this.f19717a == p2Var.f19717a && this.f19718b == p2Var.f19718b && this.f19719c == p2Var.f19719c;
    }

    public final int hashCode() {
        return this.f19719c.hashCode() + ((this.f19718b.hashCode() + (this.f19717a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SurfaceConfig(configType=" + this.f19717a + ", configSize=" + this.f19718b + ", streamUseCase=" + this.f19719c + ')';
    }
}
