package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f1573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f1574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f1575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o f1576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o f1577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ o[] f1578g;

    static {
        o oVar = new o("DESTROYED", 0);
        f1573b = oVar;
        o oVar2 = new o("INITIALIZED", 1);
        f1574c = oVar2;
        o oVar3 = new o("CREATED", 2);
        f1575d = oVar3;
        o oVar4 = new o("STARTED", 3);
        f1576e = oVar4;
        o oVar5 = new o("RESUMED", 4);
        f1577f = oVar5;
        o[] oVarArr = {oVar, oVar2, oVar3, oVar4, oVar5};
        f1578g = oVarArr;
        hl.d.k(oVarArr);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f1578g.clone();
    }

    public final boolean a(o state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return compareTo(state) >= 0;
    }
}
