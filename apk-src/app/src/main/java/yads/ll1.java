package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ll1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ll1[] f40583c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40584b;

    static {
        ll1[] ll1VarArr = {new ll1(0, "STREAMING", "streaming"), new ll1(1, "PROGRESSIVE", "progressive")};
        f40583c = ll1VarArr;
        hl.d.k(ll1VarArr);
    }

    public ll1(int i, String str, String str2) {
        this.f40584b = str2;
    }

    public static ll1 valueOf(String str) {
        return (ll1) Enum.valueOf(ll1.class, str);
    }

    public static ll1[] values() {
        return (ll1[]) f40583c.clone();
    }
}
