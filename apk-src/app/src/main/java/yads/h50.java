package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h50 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h50 f39029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ h50[] f39030d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39031b;

    static {
        h50 h50Var = new h50(0, "ERROR", "error");
        h50 h50Var2 = new h50(1, "MESSAGE", "message");
        f39029c = h50Var2;
        h50[] h50VarArr = {h50Var, h50Var2};
        f39030d = h50VarArr;
        hl.d.k(h50VarArr);
    }

    public h50(int i, String str, String str2) {
        this.f39031b = str2;
    }

    public static h50 valueOf(String str) {
        return (h50) Enum.valueOf(h50.class, str);
    }

    public static h50[] values() {
        return (h50[]) f39030d.clone();
    }
}
