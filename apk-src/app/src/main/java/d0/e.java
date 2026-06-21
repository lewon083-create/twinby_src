package d0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f15498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f15499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ e[] f15500d;

    static {
        e eVar = new e("OFF", 0);
        f15498b = eVar;
        e eVar2 = new e("ON", 1);
        e eVar3 = new e("PREVIEW", 2);
        f15499c = eVar3;
        e[] eVarArr = {eVar, eVar2, eVar3};
        f15500d = eVarArr;
        hl.d.k(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f15500d.clone();
    }
}
