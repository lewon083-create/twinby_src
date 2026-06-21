package g0;

import android.util.Size;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m2 f19659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m2 f19660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m2 f19661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m2 f19662g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m2 f19663h;
    public static final m2 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final m2 f19664j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final m2 f19665k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final m2 f19666l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final m2 f19667m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final m2 f19668n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final m2 f19669o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final m2 f19670p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final m2 f19671q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final m2 f19672r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ m2[] f19673s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Size f19675c;

    static {
        m2 m2Var = new m2("VGA", 0, 0, new Size(640, 480));
        f19659d = m2Var;
        m2 m2Var2 = new m2("X_VGA", 1, 1, new Size(1024, 768));
        f19660e = m2Var2;
        m2 m2Var3 = new m2("S720P_16_9", 2, 2, new Size(1280, 720));
        f19661f = m2Var3;
        m2 m2Var4 = new m2("PREVIEW", 3, 3, null);
        f19662g = m2Var4;
        m2 m2Var5 = new m2("S1080P_4_3", 4, 4, new Size(1440, 1080));
        f19663h = m2Var5;
        m2 m2Var6 = new m2("S1080P_16_9", 5, 5, new Size(1920, 1080));
        i = m2Var6;
        m2 m2Var7 = new m2("S1440P_4_3", 6, 6, new Size(1920, 1440));
        f19664j = m2Var7;
        m2 m2Var8 = new m2("S1440P_16_9", 7, 7, new Size(2560, 1440));
        f19665k = m2Var8;
        m2 m2Var9 = new m2("UHD", 8, 8, new Size(3840, 2160));
        f19666l = m2Var9;
        m2 m2Var10 = new m2("RECORD", 9, 9, null);
        f19667m = m2Var10;
        m2 m2Var11 = new m2("MAXIMUM", 10, 10, null);
        f19668n = m2Var11;
        m2 m2Var12 = new m2("MAXIMUM_4_3", 11, 11, null);
        f19669o = m2Var12;
        m2 m2Var13 = new m2("MAXIMUM_16_9", 12, 12, null);
        f19670p = m2Var13;
        m2 m2Var14 = new m2("ULTRA_MAXIMUM", 13, 13, null);
        f19671q = m2Var14;
        m2 m2Var15 = new m2("NOT_SUPPORT", 14, 14, null);
        f19672r = m2Var15;
        m2[] m2VarArr = {m2Var, m2Var2, m2Var3, m2Var4, m2Var5, m2Var6, m2Var7, m2Var8, m2Var9, m2Var10, m2Var11, m2Var12, m2Var13, m2Var14, m2Var15};
        f19673s = m2VarArr;
        hl.d.k(m2VarArr);
    }

    public m2(String str, int i10, int i11, Size size) {
        this.f19674b = i11;
        this.f19675c = size;
    }

    public static m2 valueOf(String str) {
        return (m2) Enum.valueOf(m2.class, str);
    }

    public static m2[] values() {
        return (m2[]) f19673s.clone();
    }
}
