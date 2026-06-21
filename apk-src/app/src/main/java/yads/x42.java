package yads;

import com.appsflyer.AdRevenueScheme;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class x42 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x42 f44598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x42 f44599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x42 f44600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ x42[] f44601f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44602b;

    static {
        x42 x42Var = new x42(0, "AD", "ad");
        f44598c = x42Var;
        x42 x42Var2 = new x42(1, "BULK", "bulk");
        f44599d = x42Var2;
        x42 x42Var3 = new x42(2, "SLIDER", AdRevenueScheme.AD_UNIT);
        f44600e = x42Var3;
        x42[] x42VarArr = {x42Var, x42Var2, x42Var3};
        f44601f = x42VarArr;
        hl.d.k(x42VarArr);
    }

    public x42(int i, String str, String str2) {
        this.f44602b = str2;
    }

    public static x42 valueOf(String str) {
        return (x42) Enum.valueOf(x42.class, str);
    }

    public static x42[] values() {
        return (x42[]) f44601f.clone();
    }
}
