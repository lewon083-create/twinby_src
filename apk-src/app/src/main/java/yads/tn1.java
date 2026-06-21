package yads;

import io.sentry.rrweb.RRWebVideoEvent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class tn1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final tn1 f43375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final tn1 f43376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final tn1 f43377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final tn1 f43378f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final tn1 f43379g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ tn1[] f43380h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43381b;

    static {
        tn1 tn1Var = new tn1(0, "WEB_VIEW", "webview");
        f43375c = tn1Var;
        tn1 tn1Var2 = new tn1(1, "VIDEO", RRWebVideoEvent.EVENT_TAG);
        f43376d = tn1Var2;
        tn1 tn1Var3 = new tn1(2, "MULTIBANNER", "multibanner");
        f43377e = tn1Var3;
        tn1 tn1Var4 = new tn1(3, "IMAGE", "image");
        f43378f = tn1Var4;
        tn1 tn1Var5 = new tn1(4, "MEDIATION", "mediation");
        f43379g = tn1Var5;
        tn1[] tn1VarArr = {tn1Var, tn1Var2, tn1Var3, tn1Var4, tn1Var5};
        f43380h = tn1VarArr;
        hl.d.k(tn1VarArr);
    }

    public tn1(int i, String str, String str2) {
        this.f43381b = str2;
    }

    public static tn1 valueOf(String str) {
        return (tn1) Enum.valueOf(tn1.class, str);
    }

    public static tn1[] values() {
        return (tn1[]) f43380h.clone();
    }
}
