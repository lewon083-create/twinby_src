package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class kj3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kj3 f40219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final kj3 f40220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kj3[] f40221d;

    static {
        kj3 kj3Var = new kj3(0, "LEFT_TOP");
        f40219b = kj3Var;
        kj3 kj3Var2 = new kj3(1, "CENTER");
        f40220c = kj3Var2;
        kj3[] kj3VarArr = {kj3Var, kj3Var2};
        f40221d = kj3VarArr;
        hl.d.k(kj3VarArr);
    }

    public kj3(int i, String str) {
    }

    public static kj3 valueOf(String str) {
        return (kj3) Enum.valueOf(kj3.class, str);
    }

    public static kj3[] values() {
        return (kj3[]) f40221d.clone();
    }
}
