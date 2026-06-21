package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class y30 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y30 f44896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y30 f44897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y30 f44898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final y30 f44899f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ y30[] f44900g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44901b;

    static {
        y30 y30Var = new y30(0, "CROSS_CLICKED", "cross_clicked");
        f44896c = y30Var;
        y30 y30Var2 = new y30(1, "CROSS_TIMER_START", "cross_timer_start");
        f44897d = y30Var2;
        y30 y30Var3 = new y30(2, "CROSS_TIMER_END", "cross_timer_end");
        f44898e = y30Var3;
        y30 y30Var4 = new y30(3, "FAILED_TO_CREATE_DOWNLOAD_MANAGER", "failed_to_create_download_manager");
        f44899f = y30Var4;
        y30[] y30VarArr = {y30Var, y30Var2, y30Var3, y30Var4, new y30(4, "LISTENER_IS_NULL_ON_LOADING_FINISHED", "listener_is_null_on_loading_finished")};
        f44900g = y30VarArr;
        hl.d.k(y30VarArr);
    }

    public y30(int i, String str, String str2) {
        this.f44901b = str2;
    }

    public static y30 valueOf(String str) {
        return (y30) Enum.valueOf(y30.class, str);
    }

    public static y30[] values() {
        return (y30[]) f44900g.clone();
    }
}
