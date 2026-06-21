package fj;

import fh.zf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zf f19433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ v[] f19434d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19435b;

    static {
        v[] vVarArr = {new v("ALWAYS_ALLOW", 0, 0), new v("COMPATIBILITY_MODE", 1, 1), new v("NEVER_ALLOW", 2, 2)};
        f19434d = vVarArr;
        hl.d.k(vVarArr);
        f19433c = new zf();
    }

    public v(String str, int i, int i10) {
        this.f19435b = i10;
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f19434d.clone();
    }
}
