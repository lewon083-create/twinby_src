package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class va {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final va f43971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final va f43972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final va f43973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ va[] f43974e;

    static {
        va vaVar = new va(0, "SINGLE");
        f43971b = vaVar;
        va vaVar2 = new va(1, "BLOCK");
        f43972c = vaVar2;
        va vaVar3 = new va(2, "BLOCK_INNER_CREATIVE");
        f43973d = vaVar3;
        va[] vaVarArr = {vaVar, vaVar2, vaVar3};
        f43974e = vaVarArr;
        hl.d.k(vaVarArr);
    }

    public va(int i, String str) {
    }

    public static va valueOf(String str) {
        return (va) Enum.valueOf(va.class, str);
    }

    public static va[] values() {
        return (va[]) f43974e.clone();
    }
}
