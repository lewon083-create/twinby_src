package fh;

import io.sentry.MeasurementUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class be extends kotlin.jvm.internal.r implements Function1 {
    public static final be A;
    public static final be B;
    public static final be C;
    public static final be D;
    public static final be E;
    public static final be F;
    public static final be G;
    public static final be H;
    public static final be I;
    public static final be J;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final be f16922g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final be f16923h;
    public static final be i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final be f16924j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final be f16925k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final be f16926l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final be f16927m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final be f16928n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final be f16929o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final be f16930p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final be f16931q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final be f16932r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final be f16933s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final be f16934t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final be f16935u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final be f16936v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final be f16937w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final be f16938x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final be f16939y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final be f16940z;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f16941f;

    static {
        int i10 = 1;
        f16922g = new be(i10, 0);
        f16923h = new be(i10, 1);
        i = new be(i10, 2);
        f16924j = new be(i10, 3);
        f16925k = new be(i10, 4);
        f16926l = new be(i10, 5);
        f16927m = new be(i10, 6);
        f16928n = new be(i10, 7);
        f16929o = new be(i10, 8);
        f16930p = new be(i10, 9);
        f16931q = new be(i10, 10);
        f16932r = new be(i10, 11);
        f16933s = new be(i10, 12);
        f16934t = new be(i10, 13);
        f16935u = new be(i10, 14);
        f16936v = new be(i10, 15);
        f16937w = new be(i10, 16);
        f16938x = new be(i10, 17);
        f16939y = new be(i10, 18);
        f16940z = new be(i10, 19);
        A = new be(i10, 20);
        B = new be(i10, 21);
        C = new be(i10, 22);
        D = new be(i10, 23);
        E = new be(i10, 24);
        F = new be(i10, 25);
        G = new be(i10, 26);
        H = new be(i10, 27);
        I = new be(i10, 28);
        J = new be(i10, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ be(int i10, int i11) {
        super(i10);
        this.f16941f = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f16941f) {
            case 0:
                return Boolean.valueOf(obj instanceof r6);
            case 1:
                return Boolean.valueOf(obj instanceof s6);
            case 2:
                return Boolean.valueOf(obj instanceof ye);
            case 3:
                return Boolean.valueOf(obj instanceof xw);
            case 4:
                return Boolean.valueOf(obj instanceof r6);
            case 5:
                return Boolean.valueOf(obj instanceof s6);
            case 6:
                return Boolean.valueOf(obj instanceof r6);
            case 7:
                return Boolean.valueOf(obj instanceof s6);
            case 8:
                return Boolean.valueOf(obj instanceof xw);
            case 9:
                return Boolean.valueOf(obj instanceof r6);
            case 10:
                return Boolean.valueOf(obj instanceof s6);
            case 11:
                return Boolean.valueOf(obj instanceof ye);
            case 12:
                return Boolean.valueOf(obj instanceof r6);
            case 13:
                return Boolean.valueOf(obj instanceof s6);
            case 14:
                return Boolean.valueOf(obj instanceof r6);
            case 15:
                return Boolean.valueOf(obj instanceof s6);
            case 16:
                return Boolean.valueOf(obj instanceof ye);
            case 17:
                return Boolean.valueOf(obj instanceof z7);
            case 18:
                return Boolean.valueOf(obj instanceof xw);
            case 19:
                String str = (String) obj;
                if (Intrinsics.a(str, "fill")) {
                    return ye.FILL;
                }
                if (Intrinsics.a(str, "no_scale")) {
                    return ye.NO_SCALE;
                }
                if (Intrinsics.a(str, "fit")) {
                    return ye.FIT;
                }
                if (Intrinsics.a(str, "stretch")) {
                    return ye.STRETCH;
                }
                return null;
            case 20:
                String str2 = (String) obj;
                if (Intrinsics.a(str2, "scale")) {
                    return af.SCALE;
                }
                if (Intrinsics.a(str2, "worm")) {
                    return af.WORM;
                }
                if (Intrinsics.a(str2, "slider")) {
                    return af.SLIDER;
                }
                return null;
            case 21:
                return Boolean.valueOf(obj instanceof r6);
            case 22:
                return Boolean.valueOf(obj instanceof s6);
            case 23:
                return Boolean.valueOf(obj instanceof af);
            case 24:
                return Boolean.valueOf(obj instanceof xw);
            case 25:
                String str3 = (String) obj;
                if (Intrinsics.a(str3, "auto")) {
                    return tf.AUTO;
                }
                if (Intrinsics.a(str3, MeasurementUnit.NONE)) {
                    return tf.NONE;
                }
                if (Intrinsics.a(str3, "words")) {
                    return tf.WORDS;
                }
                if (Intrinsics.a(str3, "sentences")) {
                    return tf.SENTENCES;
                }
                if (Intrinsics.a(str3, "all_characters")) {
                    return tf.ALL_CHARACTERS;
                }
                return null;
            case 26:
                String str4 = (String) obj;
                if (Intrinsics.a(str4, "default")) {
                    return uf.DEFAULT;
                }
                if (Intrinsics.a(str4, "go")) {
                    return uf.GO;
                }
                if (Intrinsics.a(str4, "search")) {
                    return uf.SEARCH;
                }
                if (Intrinsics.a(str4, "send")) {
                    return uf.SEND;
                }
                if (Intrinsics.a(str4, "done")) {
                    return uf.DONE;
                }
                return null;
            case 27:
                String str5 = (String) obj;
                if (Intrinsics.a(str5, "single_line_text")) {
                    return vf.SINGLE_LINE_TEXT;
                }
                if (Intrinsics.a(str5, "multi_line_text")) {
                    return vf.MULTI_LINE_TEXT;
                }
                if (Intrinsics.a(str5, "phone")) {
                    return vf.PHONE;
                }
                if (Intrinsics.a(str5, "number")) {
                    return vf.NUMBER;
                }
                if (Intrinsics.a(str5, "email")) {
                    return vf.EMAIL;
                }
                if (Intrinsics.a(str5, "uri")) {
                    return vf.URI;
                }
                if (Intrinsics.a(str5, "password")) {
                    return vf.PASSWORD;
                }
                return null;
            case 28:
                return Boolean.valueOf(obj instanceof r6);
            default:
                return Boolean.valueOf(obj instanceof s6);
        }
    }
}
