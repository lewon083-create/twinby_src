package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class u03 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ u03[] f43515c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43516b;

    static {
        u03[] u03VarArr = {new u03(0, "VISIBLE", "visible"), new u03(1, "DELAYED", "delayed")};
        f43515c = u03VarArr;
        hl.d.k(u03VarArr);
    }

    public u03(int i, String str, String str2) {
        this.f43516b = str2;
    }

    public static u03 valueOf(String str) {
        return (u03) Enum.valueOf(u03.class, str);
    }

    public static u03[] values() {
        return (u03[]) f43515c.clone();
    }
}
