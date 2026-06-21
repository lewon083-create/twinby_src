package yads;

import io.sentry.protocol.Browser;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h1 f38971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h1 f38972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h1 f38973e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ h1[] f38974f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38975b;

    static {
        h1 h1Var = new h1(0, "BROWSER", Browser.TYPE);
        f38971c = h1Var;
        h1 h1Var2 = new h1(1, "WEBVIEW", "webview");
        f38972d = h1Var2;
        h1 h1Var3 = new h1(2, "CUSTOM", "custom");
        f38973e = h1Var3;
        h1[] h1VarArr = {h1Var, h1Var2, h1Var3};
        f38974f = h1VarArr;
        hl.d.k(h1VarArr);
    }

    public h1(int i, String str, String str2) {
        this.f38975b = str2;
    }

    public static h1 valueOf(String str) {
        return (h1) Enum.valueOf(h1.class, str);
    }

    public static h1[] values() {
        return (h1[]) f38974f.clone();
    }
}
