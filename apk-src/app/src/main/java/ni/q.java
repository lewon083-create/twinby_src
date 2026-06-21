package ni;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l7.i f29473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ q[] f29474d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29475b;

    static {
        q[] qVarArr = {new q("AUTO", 0, 0), new q("OFF", 1, 1), new q("ON", 2, 2)};
        f29474d = qVarArr;
        hl.d.k(qVarArr);
        f29473c = new l7.i(7);
    }

    public q(String str, int i, int i10) {
        this.f29475b = i10;
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f29474d.clone();
    }
}
