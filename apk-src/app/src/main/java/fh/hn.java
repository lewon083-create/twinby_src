package fh;

import io.sentry.MeasurementUnit;
import io.sentry.rrweb.RRWebVideoEvent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hn extends kotlin.jvm.internal.r implements Function1 {
    public static final hn A;
    public static final hn B;
    public static final hn C;
    public static final hn D;
    public static final hn E;
    public static final hn F;
    public static final hn G;
    public static final hn H;
    public static final hn I;
    public static final hn J;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final hn f17342g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final hn f17343h;
    public static final hn i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final hn f17344j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final hn f17345k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final hn f17346l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final hn f17347m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final hn f17348n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final hn f17349o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final hn f17350p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final hn f17351q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final hn f17352r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final hn f17353s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final hn f17354t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final hn f17355u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final hn f17356v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final hn f17357w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final hn f17358x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final hn f17359y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final hn f17360z;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f17361f;

    static {
        int i10 = 1;
        f17342g = new hn(i10, 0);
        f17343h = new hn(i10, 1);
        i = new hn(i10, 2);
        f17344j = new hn(i10, 3);
        f17345k = new hn(i10, 4);
        f17346l = new hn(i10, 5);
        f17347m = new hn(i10, 6);
        f17348n = new hn(i10, 7);
        f17349o = new hn(i10, 8);
        f17350p = new hn(i10, 9);
        f17351q = new hn(i10, 10);
        f17352r = new hn(i10, 11);
        f17353s = new hn(i10, 12);
        f17354t = new hn(i10, 13);
        f17355u = new hn(i10, 14);
        f17356v = new hn(i10, 15);
        f17357w = new hn(i10, 16);
        f17358x = new hn(i10, 17);
        f17359y = new hn(i10, 18);
        f17360z = new hn(i10, 19);
        A = new hn(i10, 20);
        B = new hn(i10, 21);
        C = new hn(i10, 22);
        D = new hn(i10, 23);
        E = new hn(i10, 24);
        F = new hn(i10, 25);
        G = new hn(i10, 26);
        H = new hn(i10, 27);
        I = new hn(i10, 28);
        J = new hn(i10, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hn(int i10, int i11) {
        super(i10);
        this.f17361f = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f17361f) {
            case 0:
                return Boolean.valueOf(obj instanceof ro);
            case 1:
                return Boolean.valueOf(obj instanceof md);
            case 2:
                return Boolean.valueOf(obj instanceof xw);
            case 3:
                String str = (String) obj;
                if (Intrinsics.a(str, "vertical")) {
                    return on.VERTICAL;
                }
                if (Intrinsics.a(str, "horizontal")) {
                    return on.HORIZONTAL;
                }
                return null;
            case 4:
                return Boolean.valueOf(obj instanceof on);
            case 5:
                return Boolean.valueOf(obj instanceof r6);
            case 6:
                return Boolean.valueOf(obj instanceof s6);
            case 7:
                return Boolean.valueOf(obj instanceof xw);
            case 8:
                String str2 = (String) obj;
                if (Intrinsics.a(str2, "dp")) {
                    return ro.DP;
                }
                if (Intrinsics.a(str2, "sp")) {
                    return ro.SP;
                }
                if (Intrinsics.a(str2, "px")) {
                    return ro.PX;
                }
                return null;
            case 9:
                return Boolean.valueOf(obj instanceof ro);
            case 10:
                String str3 = (String) obj;
                if (Intrinsics.a(str3, RRWebVideoEvent.JsonKeys.LEFT)) {
                    return vo.LEFT;
                }
                if (Intrinsics.a(str3, RRWebVideoEvent.JsonKeys.TOP)) {
                    return vo.TOP;
                }
                if (Intrinsics.a(str3, "right")) {
                    return vo.RIGHT;
                }
                if (Intrinsics.a(str3, "bottom")) {
                    return vo.BOTTOM;
                }
                return null;
            case 11:
                return Boolean.valueOf(obj instanceof vo);
            case 12:
                return Boolean.valueOf(obj instanceof w6);
            case 13:
                return Boolean.valueOf(obj instanceof r6);
            case 14:
                return Boolean.valueOf(obj instanceof s6);
            case 15:
                return Boolean.valueOf(obj instanceof xw);
            case 16:
                return Boolean.valueOf(obj instanceof ro);
            case 17:
                return Boolean.valueOf(obj instanceof md);
            case 18:
                return Boolean.valueOf(obj instanceof r6);
            case 19:
                return Boolean.valueOf(obj instanceof s6);
            case 20:
                return Boolean.valueOf(obj instanceof jv);
            case 21:
                return Boolean.valueOf(obj instanceof xw);
            case 22:
                return Boolean.valueOf(obj instanceof ro);
            case 23:
                return Boolean.valueOf(obj instanceof r6);
            case 24:
                return Boolean.valueOf(obj instanceof s6);
            case 25:
                return Boolean.valueOf(obj instanceof xw);
            case 26:
                String str4 = (String) obj;
                if (Intrinsics.a(str4, "slide")) {
                    return cr.SLIDE;
                }
                if (Intrinsics.a(str4, "fade")) {
                    return cr.FADE;
                }
                if (Intrinsics.a(str4, MeasurementUnit.NONE)) {
                    return cr.NONE;
                }
                return null;
            case 27:
                return Boolean.valueOf(obj instanceof r6);
            case 28:
                return Boolean.valueOf(obj instanceof s6);
            default:
                return Boolean.valueOf(obj instanceof xw);
        }
    }
}
