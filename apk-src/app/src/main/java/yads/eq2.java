package yads;

import io.sentry.protocol.App;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class eq2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final eq2 f38236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final eq2 f38237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final eq2 f38238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ eq2[] f38239f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38240b;

    static {
        eq2 eq2Var = new eq2(0, "CONTENT", "content");
        f38236c = eq2Var;
        eq2 eq2Var2 = new eq2(1, "APP_INSTALL", App.TYPE);
        f38237d = eq2Var2;
        eq2 eq2Var3 = new eq2(2, "IMAGE", "image");
        eq2 eq2Var4 = new eq2(3, "PRODUCT_PROMO", "productPromo");
        f38238e = eq2Var4;
        eq2[] eq2VarArr = {eq2Var, eq2Var2, eq2Var3, eq2Var4};
        f38239f = eq2VarArr;
        hl.d.k(eq2VarArr);
    }

    public eq2(int i, String str, String str2) {
        this.f38240b = str2;
    }

    public static eq2 valueOf(String str) {
        return (eq2) Enum.valueOf(eq2.class, str);
    }

    public static eq2[] values() {
        return (eq2[]) f38239f.clone();
    }
}
