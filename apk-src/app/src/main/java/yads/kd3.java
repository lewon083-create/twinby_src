package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class kd3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final kd3 f40167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final kd3 f40168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kd3[] f40169e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40170b;

    static {
        kd3 kd3Var = new kd3(0, 1, "VERIFICATION_REJECTED");
        kd3 kd3Var2 = new kd3(1, 2, "VERIFICATION_NOT_SUPPORTED");
        f40167c = kd3Var2;
        kd3 kd3Var3 = new kd3(2, 3, "ERROR_RESOURCE_LOAD");
        f40168d = kd3Var3;
        kd3[] kd3VarArr = {kd3Var, kd3Var2, kd3Var3};
        f40169e = kd3VarArr;
        hl.d.k(kd3VarArr);
    }

    public kd3(int i, int i10, String str) {
        this.f40170b = i10;
    }

    public static kd3 valueOf(String str) {
        return (kd3) Enum.valueOf(kd3.class, str);
    }

    public static kd3[] values() {
        return (kd3[]) f40169e.clone();
    }
}
