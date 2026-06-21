package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ct {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ct f37491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ct f37492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ct[] f37493d;

    static {
        ct ctVar = new ct(0, "ACTIVE");
        f37491b = ctVar;
        ct ctVar2 = new ct(1, "CANCELED");
        f37492c = ctVar2;
        ct[] ctVarArr = {ctVar, ctVar2};
        f37493d = ctVarArr;
        hl.d.k(ctVarArr);
    }

    public ct(int i, String str) {
    }

    public static ct valueOf(String str) {
        return (ct) Enum.valueOf(ct.class, str);
    }

    public static ct[] values() {
        return (ct[]) f37493d.clone();
    }
}
