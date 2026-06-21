package yads;

import io.sentry.rrweb.RRWebVideoEvent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g21 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g21 f38620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ g21[] f38621d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38622b;

    static {
        g21 g21Var = new g21(0, "ICON_HORIZONTAL_POSITION_LEFT", RRWebVideoEvent.JsonKeys.LEFT);
        g21 g21Var2 = new g21(1, "ICON_HORIZONTAL_POSITION_RIGHT", "right");
        g21 g21Var3 = new g21(2, "ICON_HORIZONTAL_POSITION_LEFT_OFFSET", "leftOffset");
        f38620c = g21Var3;
        g21[] g21VarArr = {g21Var, g21Var2, g21Var3};
        f38621d = g21VarArr;
        hl.d.k(g21VarArr);
    }

    public g21(int i, String str, String str2) {
        this.f38622b = str2;
    }

    public static g21 valueOf(String str) {
        return (g21) Enum.valueOf(g21.class, str);
    }

    public static g21[] values() {
        return (g21[]) f38621d.clone();
    }
}
