package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zc3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zc3 f45372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zc3 f45373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zc3 f45374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ zc3[] f45375e;

    static {
        zc3 zc3Var = new zc3(0, "MILLISECONDS");
        f45372b = zc3Var;
        zc3 zc3Var2 = new zc3(1, "PERCENTS");
        f45373c = zc3Var2;
        zc3 zc3Var3 = new zc3(2, "POSITION");
        f45374d = zc3Var3;
        zc3[] zc3VarArr = {zc3Var, zc3Var2, zc3Var3};
        f45375e = zc3VarArr;
        hl.d.k(zc3VarArr);
    }

    public zc3(int i, String str) {
    }

    public static zc3 valueOf(String str) {
        return (zc3) Enum.valueOf(zc3.class, str);
    }

    public static zc3[] values() {
        return (zc3[]) f45375e.clone();
    }
}
