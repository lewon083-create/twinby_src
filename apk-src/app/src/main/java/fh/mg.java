package fh;

import io.sentry.MeasurementUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class mg extends kotlin.jvm.internal.r implements Function1 {
    public static final mg A;
    public static final mg B;
    public static final mg C;
    public static final mg D;
    public static final mg E;
    public static final mg F;
    public static final mg G;
    public static final mg H;
    public static final mg I;
    public static final mg J;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final mg f17849g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final mg f17850h;
    public static final mg i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final mg f17851j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final mg f17852k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final mg f17853l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final mg f17854m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final mg f17855n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final mg f17856o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final mg f17857p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final mg f17858q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final mg f17859r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final mg f17860s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final mg f17861t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final mg f17862u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final mg f17863v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final mg f17864w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final mg f17865x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final mg f17866y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final mg f17867z;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f17868f;

    static {
        int i10 = 1;
        f17849g = new mg(i10, 0);
        f17850h = new mg(i10, 1);
        i = new mg(i10, 2);
        f17851j = new mg(i10, 3);
        f17852k = new mg(i10, 4);
        f17853l = new mg(i10, 5);
        f17854m = new mg(i10, 6);
        f17855n = new mg(i10, 7);
        f17856o = new mg(i10, 8);
        f17857p = new mg(i10, 9);
        f17858q = new mg(i10, 10);
        f17859r = new mg(i10, 11);
        f17860s = new mg(i10, 12);
        f17861t = new mg(i10, 13);
        f17862u = new mg(i10, 14);
        f17863v = new mg(i10, 15);
        f17864w = new mg(i10, 16);
        f17865x = new mg(i10, 17);
        f17866y = new mg(i10, 18);
        f17867z = new mg(i10, 19);
        A = new mg(i10, 20);
        B = new mg(i10, 21);
        C = new mg(i10, 22);
        D = new mg(i10, 23);
        E = new mg(i10, 24);
        F = new mg(i10, 25);
        G = new mg(i10, 26);
        H = new mg(i10, 27);
        I = new mg(i10, 28);
        J = new mg(i10, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mg(int i10, int i11) {
        super(i10);
        this.f17868f = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f17868f) {
            case 0:
                return Boolean.valueOf(obj instanceof tf);
            case 1:
                return Boolean.valueOf(obj instanceof uf);
            case 2:
                return Boolean.valueOf(obj instanceof ro);
            case 3:
                return Boolean.valueOf(obj instanceof md);
            case 4:
                return Boolean.valueOf(obj instanceof vf);
            case 5:
                return Boolean.valueOf(obj instanceof r6);
            case 6:
                return Boolean.valueOf(obj instanceof s6);
            case 7:
                return Boolean.valueOf(obj instanceof xw);
            case 8:
                String str = (String) obj;
                if (Intrinsics.a(str, MeasurementUnit.NONE)) {
                    return xh.NONE;
                }
                if (Intrinsics.a(str, "single")) {
                    return xh.SINGLE;
                }
                return null;
            case 9:
                return Boolean.valueOf(obj instanceof v6);
            case 10:
                return Boolean.valueOf(obj instanceof w6);
            case 11:
                return Boolean.valueOf(obj instanceof w6);
            case 12:
                return Boolean.valueOf(obj instanceof w6);
            case 13:
                String str2 = (String) obj;
                if (Intrinsics.a(str2, "start")) {
                    return wj.START;
                }
                if (Intrinsics.a(str2, "center")) {
                    return wj.CENTER;
                }
                if (Intrinsics.a(str2, "end")) {
                    return wj.END;
                }
                return null;
            case 14:
                String str3 = (String) obj;
                if (Intrinsics.a(str3, "horizontal")) {
                    return xj.HORIZONTAL;
                }
                if (Intrinsics.a(str3, "vertical")) {
                    return xj.VERTICAL;
                }
                return null;
            case 15:
                return Boolean.valueOf(obj instanceof r6);
            case 16:
                return Boolean.valueOf(obj instanceof s6);
            case 17:
                return Boolean.valueOf(obj instanceof wj);
            case 18:
                return Boolean.valueOf(obj instanceof xj);
            case 19:
                return Boolean.valueOf(obj instanceof wj);
            case 20:
                return Boolean.valueOf(obj instanceof xw);
            case 21:
                String str4 = (String) obj;
                if (Intrinsics.a(str4, "transactional")) {
                    return lk.TRANSACTIONAL;
                }
                if (Intrinsics.a(str4, "partial")) {
                    return lk.PARTIAL;
                }
                return null;
            case 22:
                return Boolean.valueOf(obj instanceof lk);
            case 23:
                return Boolean.valueOf(obj instanceof ro);
            case 24:
                return Boolean.valueOf(obj instanceof ro);
            case 25:
                String str5 = (String) obj;
                if (Intrinsics.a(str5, "nearest_corner")) {
                    return mm.NEAREST_CORNER;
                }
                if (Intrinsics.a(str5, "farthest_corner")) {
                    return mm.FARTHEST_CORNER;
                }
                if (Intrinsics.a(str5, "nearest_side")) {
                    return mm.NEAREST_SIDE;
                }
                if (Intrinsics.a(str5, "farthest_side")) {
                    return mm.FARTHEST_SIDE;
                }
                return null;
            case 26:
                return Boolean.valueOf(obj instanceof mm);
            case 27:
                return Boolean.valueOf(obj instanceof w6);
            case 28:
                return Boolean.valueOf(obj instanceof r6);
            default:
                return Boolean.valueOf(obj instanceof s6);
        }
    }
}
