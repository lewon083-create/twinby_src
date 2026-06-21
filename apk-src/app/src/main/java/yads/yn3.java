package yads;

import java.util.LinkedHashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class yn3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final xn3 f45126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f45127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final yn3 f45128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ yn3[] f45129f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45130b;

    static {
        yn3 yn3Var = new yn3(0, "DEFAULT", "default");
        f45128e = yn3Var;
        yn3[] yn3VarArr = {yn3Var, new yn3(1, "CACHE_ELSE_NETWORK", "cache_else_network"), new yn3(2, "CACHE_ONLY", "cache_only"), new yn3(3, "DISABLED", "disabled")};
        f45129f = yn3VarArr;
        pj.b bVarK = hl.d.k(yn3VarArr);
        f45126c = new xn3();
        int iB = kotlin.collections.i0.b(kotlin.collections.t.j(bVarK, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (Object obj : bVarK) {
            linkedHashMap.put(((yn3) obj).f45130b, obj);
        }
        f45127d = linkedHashMap;
    }

    public yn3(int i, String str, String str2) {
        this.f45130b = str2;
    }

    public static yn3 valueOf(String str) {
        return (yn3) Enum.valueOf(yn3.class, str);
    }

    public static yn3[] values() {
        return (yn3[]) f45129f.clone();
    }
}
