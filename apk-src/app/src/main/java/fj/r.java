package fj;

import fh.zf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zf f19405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f19406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r f19407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r f19408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final r f19409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ r[] f19410h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19411b;

    static {
        r rVar = new r("OPEN", 0, 0);
        f19406d = rVar;
        r rVar2 = new r("OPEN_MULTIPLE", 1, 1);
        f19407e = rVar2;
        r rVar3 = new r("SAVE", 2, 2);
        f19408f = rVar3;
        r rVar4 = new r("UNKNOWN", 3, 3);
        f19409g = rVar4;
        r[] rVarArr = {rVar, rVar2, rVar3, rVar4};
        f19410h = rVarArr;
        hl.d.k(rVarArr);
        f19405c = new zf();
    }

    public r(String str, int i, int i10) {
        this.f19411b = i10;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f19410h.clone();
    }
}
