package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class cg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final cg f37375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final cg f37376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final cg f37377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final cg f37378f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final cg f37379g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final cg f37380h;
    public static final /* synthetic */ cg[] i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37381b;

    static {
        cg cgVar = new cg(0, "AD_REQUEST", "ad_request");
        f37375c = cgVar;
        cg cgVar2 = new cg(1, "AD_ATTEMPT", "ad_attempt");
        f37376d = cgVar2;
        cg cgVar3 = new cg(2, "AD_FILLED_REQUEST", "ad_filled_request");
        f37377e = cgVar3;
        cg cgVar4 = new cg(3, "AD_IMPRESSION", "ad_impression");
        f37378f = cgVar4;
        cg cgVar5 = new cg(4, "AD_CLICK", "ad_click");
        f37379g = cgVar5;
        cg cgVar6 = new cg(5, "AD_REWARD", "ad_reward");
        f37380h = cgVar6;
        cg[] cgVarArr = {cgVar, cgVar2, cgVar3, cgVar4, cgVar5, cgVar6};
        i = cgVarArr;
        hl.d.k(cgVarArr);
    }

    public cg(int i10, String str, String str2) {
        this.f37381b = str2;
    }

    public static cg valueOf(String str) {
        return (cg) Enum.valueOf(cg.class, str);
    }

    public static cg[] values() {
        return (cg[]) i.clone();
    }

    public final String a() {
        return this.f37381b;
    }
}
