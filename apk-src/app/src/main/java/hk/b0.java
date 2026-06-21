package hk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b0 f20633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b0 f20634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b0 f20635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b0[] f20636e;

    static {
        b0 b0Var = new b0("DEFAULT", 0);
        f20633b = b0Var;
        b0 b0Var2 = new b0("LAZY", 1);
        f20634c = b0Var2;
        b0 b0Var3 = new b0("ATOMIC", 2);
        f20635d = b0Var3;
        b0[] b0VarArr = {b0Var, b0Var2, b0Var3, new b0("UNDISPATCHED", 3)};
        f20636e = b0VarArr;
        hl.d.k(b0VarArr);
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) f20636e.clone();
    }
}
