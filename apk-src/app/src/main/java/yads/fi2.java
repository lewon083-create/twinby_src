package yads;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class fi2 {

    @NotNull
    public static final ei2 Companion;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ij.g f38450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final fi2 f38451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fi2 f38452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ fi2[] f38453e;

    static {
        fi2 fi2Var = new fi2(0, "SUCCESS");
        f38451c = fi2Var;
        fi2 fi2Var2 = new fi2(1, "ERROR");
        f38452d = fi2Var2;
        fi2[] fi2VarArr = {fi2Var, fi2Var2};
        f38453e = fi2VarArr;
        hl.d.k(fi2VarArr);
        Companion = new ei2();
        f38450b = ij.h.a(ij.i.f21337b, di2.f37774b);
    }

    public fi2(int i, String str) {
    }

    public static fi2 valueOf(String str) {
        return (fi2) Enum.valueOf(fi2.class, str);
    }

    public static fi2[] values() {
        return (fi2[]) f38453e.clone();
    }
}
