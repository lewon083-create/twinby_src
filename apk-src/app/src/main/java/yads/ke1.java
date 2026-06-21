package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ke1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ke1 f40176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ke1 f40177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ke1 f40178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ke1[] f40179e;

    static {
        ke1 ke1Var = new ke1(0, "LOAD");
        f40176b = ke1Var;
        ke1 ke1Var2 = new ke1(1, "SHOW");
        f40177c = ke1Var2;
        ke1 ke1Var3 = new ke1(2, "RETURN_TO_APP");
        f40178d = ke1Var3;
        ke1[] ke1VarArr = {ke1Var, ke1Var2, ke1Var3};
        f40179e = ke1VarArr;
        hl.d.k(ke1VarArr);
    }

    public ke1(int i, String str) {
    }

    public static ke1 valueOf(String str) {
        return (ke1) Enum.valueOf(ke1.class, str);
    }

    public static ke1[] values() {
        return (ke1[]) f40179e.clone();
    }
}
