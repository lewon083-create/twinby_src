package fj;

import fh.nd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final nd f19382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n0 f19383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n0 f19384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n0 f19385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final n0 f19386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final n0 f19387h;
    public static final n0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final n0 f19388j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ n0[] f19389k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19390b;

    static {
        n0 n0Var = new n0("DATE_INVALID", 0, 0);
        f19383d = n0Var;
        n0 n0Var2 = new n0("EXPIRED", 1, 1);
        f19384e = n0Var2;
        n0 n0Var3 = new n0("ID_MISMATCH", 2, 2);
        f19385f = n0Var3;
        n0 n0Var4 = new n0("INVALID", 3, 3);
        f19386g = n0Var4;
        n0 n0Var5 = new n0("NOT_YET_VALID", 4, 4);
        f19387h = n0Var5;
        n0 n0Var6 = new n0("UNTRUSTED", 5, 5);
        i = n0Var6;
        n0 n0Var7 = new n0("UNKNOWN", 6, 6);
        f19388j = n0Var7;
        n0[] n0VarArr = {n0Var, n0Var2, n0Var3, n0Var4, n0Var5, n0Var6, n0Var7};
        f19389k = n0VarArr;
        hl.d.k(n0VarArr);
        f19382c = new nd();
    }

    public n0(String str, int i10, int i11) {
        this.f19390b = i11;
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) f19389k.clone();
    }
}
