package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class fw {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final fw f38562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final fw f38563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ fw[] f38564d;

    static {
        fw fwVar = new fw(0, "TEXT");
        f38562b = fwVar;
        fw fwVar2 = new fw(1, "IMAGE");
        f38563c = fwVar2;
        fw[] fwVarArr = {fwVar, fwVar2};
        f38564d = fwVarArr;
        hl.d.k(fwVarArr);
    }

    public fw(int i, String str) {
    }

    public static fw valueOf(String str) {
        return (fw) Enum.valueOf(fw.class, str);
    }

    public static fw[] values() {
        return (fw[]) f38564d.clone();
    }
}
