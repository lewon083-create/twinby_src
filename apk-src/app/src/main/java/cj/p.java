package cj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final wd.d f2347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p f2348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p f2349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p f2350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p f2351g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p f2352h;
    public static final /* synthetic */ p[] i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2353b;

    static {
        p pVar = new p("IDLE", 0, 0);
        f2348d = pVar;
        p pVar2 = new p("BUFFERING", 1, 1);
        f2349e = pVar2;
        p pVar3 = new p("READY", 2, 2);
        f2350f = pVar3;
        p pVar4 = new p("ENDED", 3, 3);
        f2351g = pVar4;
        p pVar5 = new p("UNKNOWN", 4, 4);
        f2352h = pVar5;
        p[] pVarArr = {pVar, pVar2, pVar3, pVar4, pVar5};
        i = pVarArr;
        hl.d.k(pVarArr);
        f2347c = new wd.d();
    }

    public p(String str, int i10, int i11) {
        this.f2353b = i11;
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) i.clone();
    }
}
