package yads;

import io.sentry.rrweb.RRWebVideoEvent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j21 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j21 f39708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ j21[] f39709d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39710b;

    static {
        j21 j21Var = new j21(0, "ICON_VERTICAL_POSITION_TOP", RRWebVideoEvent.JsonKeys.TOP);
        j21 j21Var2 = new j21(1, "ICON_VERTICAL_POSITION_BOTTOM", "bottom");
        j21 j21Var3 = new j21(2, "ICON_VERTICAL_POSITION_TOP_OFFSET", "topOffset");
        f39708c = j21Var3;
        j21[] j21VarArr = {j21Var, j21Var2, j21Var3};
        f39709d = j21VarArr;
        hl.d.k(j21VarArr);
    }

    public j21(int i, String str, String str2) {
        this.f39710b = str2;
    }

    public static j21 valueOf(String str) {
        return (j21) Enum.valueOf(j21.class, str);
    }

    public static j21[] values() {
        return (j21[]) f39709d.clone();
    }
}
