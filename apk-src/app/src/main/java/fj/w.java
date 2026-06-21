package fj;

import fh.nd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final nd f19440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w f19441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ w[] f19442e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19443b;

    static {
        w wVar = new w("ALWAYS", 0, 0);
        w wVar2 = new w("IF_CONTENT_SCROLLS", 1, 1);
        w wVar3 = new w("NEVER", 2, 2);
        w wVar4 = new w("UNKNOWN", 3, 3);
        f19441d = wVar4;
        w[] wVarArr = {wVar, wVar2, wVar3, wVar4};
        f19442e = wVarArr;
        hl.d.k(wVarArr);
        f19440c = new nd();
    }

    public w(String str, int i, int i10) {
        this.f19443b = i10;
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f19442e.clone();
    }
}
