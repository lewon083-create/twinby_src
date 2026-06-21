package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class kg3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kg3 f40192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final kg3 f40193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final kg3 f40194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final kg3 f40195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final kg3 f40196f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final kg3 f40197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final kg3 f40198h;
    public static final kg3 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final kg3 f40199j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final kg3 f40200k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ kg3[] f40201l;

    static {
        kg3 kg3Var = new kg3(0, "INITIAL");
        f40192b = kg3Var;
        kg3 kg3Var2 = new kg3(1, "PREPARING");
        f40193c = kg3Var2;
        kg3 kg3Var3 = new kg3(2, "PREPARED");
        f40194d = kg3Var3;
        kg3 kg3Var4 = new kg3(3, "PLAYING");
        f40195e = kg3Var4;
        kg3 kg3Var5 = new kg3(4, "STOPPED");
        f40196f = kg3Var5;
        kg3 kg3Var6 = new kg3(5, "FINISHED");
        f40197g = kg3Var6;
        kg3 kg3Var7 = new kg3(6, "PAUSED");
        f40198h = kg3Var7;
        kg3 kg3Var8 = new kg3(7, "BUFFERING");
        i = kg3Var8;
        kg3 kg3Var9 = new kg3(8, "PLAYING_ERROR");
        f40199j = kg3Var9;
        kg3 kg3Var10 = new kg3(9, "PREPARING_ERROR");
        f40200k = kg3Var10;
        kg3[] kg3VarArr = {kg3Var, kg3Var2, kg3Var3, kg3Var4, kg3Var5, kg3Var6, kg3Var7, kg3Var8, kg3Var9, kg3Var10};
        f40201l = kg3VarArr;
        hl.d.k(kg3VarArr);
    }

    public kg3(int i10, String str) {
    }

    public static kg3 valueOf(String str) {
        return (kg3) Enum.valueOf(kg3.class, str);
    }

    public static kg3[] values() {
        return (kg3[]) f40201l.clone();
    }
}
