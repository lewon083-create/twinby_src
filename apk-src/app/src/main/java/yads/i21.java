package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i21 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h21 f39410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ i21[] f39411d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39412b;

    static {
        i21[] i21VarArr = {new i21(0, "STATIC_RESOURCE", "StaticResource"), new i21(1, "IFRAME_RESOURCE", "IFrameResource"), new i21(2, "HTML_RESOURCE", "HTMLResource")};
        f39411d = i21VarArr;
        hl.d.k(i21VarArr);
        f39410c = new h21();
    }

    public i21(int i, String str, String str2) {
        this.f39412b = str2;
    }

    public static i21 valueOf(String str) {
        return (i21) Enum.valueOf(i21.class, str);
    }

    public static i21[] values() {
        return (i21[]) f39411d.clone();
    }
}
