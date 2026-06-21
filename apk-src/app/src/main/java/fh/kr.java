package fh;

import io.sentry.MeasurementUnit;
import io.sentry.ProfilingTraceData;
import io.sentry.rrweb.RRWebVideoEvent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class kr extends kotlin.jvm.internal.r implements Function1 {
    public static final kr A;
    public static final kr B;
    public static final kr C;
    public static final kr D;
    public static final kr E;
    public static final kr F;
    public static final kr G;
    public static final kr H;
    public static final kr I;
    public static final kr J;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final kr f17613g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final kr f17614h;
    public static final kr i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final kr f17615j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final kr f17616k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final kr f17617l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final kr f17618m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final kr f17619n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final kr f17620o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final kr f17621p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final kr f17622q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final kr f17623r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final kr f17624s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final kr f17625t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final kr f17626u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final kr f17627v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final kr f17628w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final kr f17629x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final kr f17630y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final kr f17631z;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f17632f;

    static {
        int i10 = 1;
        f17613g = new kr(i10, 0);
        f17614h = new kr(i10, 1);
        i = new kr(i10, 2);
        f17615j = new kr(i10, 3);
        f17616k = new kr(i10, 4);
        f17617l = new kr(i10, 5);
        f17618m = new kr(i10, 6);
        f17619n = new kr(i10, 7);
        f17620o = new kr(i10, 8);
        f17621p = new kr(i10, 9);
        f17622q = new kr(i10, 10);
        f17623r = new kr(i10, 11);
        f17624s = new kr(i10, 12);
        f17625t = new kr(i10, 13);
        f17626u = new kr(i10, 14);
        f17627v = new kr(i10, 15);
        f17628w = new kr(i10, 16);
        f17629x = new kr(i10, 17);
        f17630y = new kr(i10, 18);
        f17631z = new kr(i10, 19);
        A = new kr(i10, 20);
        B = new kr(i10, 21);
        C = new kr(i10, 22);
        D = new kr(i10, 23);
        E = new kr(i10, 24);
        F = new kr(i10, 25);
        G = new kr(i10, 26);
        H = new kr(i10, 27);
        I = new kr(i10, 28);
        J = new kr(i10, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kr(int i10, int i11) {
        super(i10);
        this.f17632f = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f17632f) {
            case 0:
                return Boolean.valueOf(obj instanceof md);
            case 1:
                return Boolean.valueOf(obj instanceof cr);
            case 2:
                return Boolean.valueOf(obj instanceof ro);
            case 3:
                return Boolean.valueOf(obj instanceof md);
            case 4:
                return Boolean.valueOf(obj instanceof md);
            case 5:
                String str = (String) obj;
                if (Intrinsics.a(str, MeasurementUnit.NONE)) {
                    return js.NONE;
                }
                if (Intrinsics.a(str, "button")) {
                    return js.BUTTON;
                }
                if (Intrinsics.a(str, "image")) {
                    return js.IMAGE;
                }
                if (Intrinsics.a(str, "text")) {
                    return js.TEXT;
                }
                if (Intrinsics.a(str, "auto")) {
                    return js.AUTO;
                }
                return null;
            case 6:
                String str2 = (String) obj;
                if (Intrinsics.a(str2, ProfilingTraceData.TRUNCATION_REASON_NORMAL)) {
                    return ls.NORMAL;
                }
                if (Intrinsics.a(str2, "reversed")) {
                    return ls.REVERSED;
                }
                return null;
            case 7:
                String str3 = (String) obj;
                if (Intrinsics.a(str3, MeasurementUnit.NONE)) {
                    return os.NONE;
                }
                if (Intrinsics.a(str3, "start")) {
                    return os.START;
                }
                if (Intrinsics.a(str3, "end")) {
                    return os.END;
                }
                if (Intrinsics.a(str3, "middle")) {
                    return os.MIDDLE;
                }
                return null;
            case 8:
                String str4 = (String) obj;
                if (Intrinsics.a(str4, RRWebVideoEvent.JsonKeys.TOP)) {
                    return qs.TOP;
                }
                if (Intrinsics.a(str4, "center")) {
                    return qs.CENTER;
                }
                if (Intrinsics.a(str4, "bottom")) {
                    return qs.BOTTOM;
                }
                if (Intrinsics.a(str4, "baseline")) {
                    return qs.BASELINE;
                }
                return null;
            case 9:
                return Boolean.valueOf(obj instanceof qs);
            case 10:
                return Boolean.valueOf(obj instanceof ls);
            case 11:
                return Boolean.valueOf(obj instanceof z7);
            case 12:
                return Boolean.valueOf(obj instanceof r6);
            case 13:
                return Boolean.valueOf(obj instanceof s6);
            case 14:
                return Boolean.valueOf(obj instanceof ro);
            case 15:
                return Boolean.valueOf(obj instanceof md);
            case 16:
                return Boolean.valueOf(obj instanceof xh);
            case 17:
                return Boolean.valueOf(obj instanceof r6);
            case 18:
                return Boolean.valueOf(obj instanceof s6);
            case 19:
                return Boolean.valueOf(obj instanceof os);
            case 20:
                return Boolean.valueOf(obj instanceof xh);
            case 21:
                return Boolean.valueOf(obj instanceof xw);
            case 22:
                return Boolean.valueOf(obj instanceof qs);
            case 23:
                return Boolean.valueOf(obj instanceof ro);
            case 24:
                return Boolean.valueOf(obj instanceof md);
            case 25:
                return Boolean.valueOf(obj instanceof xh);
            case 26:
                return Boolean.valueOf(obj instanceof xh);
            case 27:
                String str5 = (String) obj;
                if (Intrinsics.a(str5, RRWebVideoEvent.JsonKeys.LEFT)) {
                    return nu.LEFT;
                }
                if (Intrinsics.a(str5, "top-left")) {
                    return nu.TOP_LEFT;
                }
                if (Intrinsics.a(str5, RRWebVideoEvent.JsonKeys.TOP)) {
                    return nu.TOP;
                }
                if (Intrinsics.a(str5, "top-right")) {
                    return nu.TOP_RIGHT;
                }
                if (Intrinsics.a(str5, "right")) {
                    return nu.RIGHT;
                }
                if (Intrinsics.a(str5, "bottom-right")) {
                    return nu.BOTTOM_RIGHT;
                }
                if (Intrinsics.a(str5, "bottom")) {
                    return nu.BOTTOM;
                }
                if (Intrinsics.a(str5, "bottom-left")) {
                    return nu.BOTTOM_LEFT;
                }
                if (Intrinsics.a(str5, "center")) {
                    return nu.CENTER;
                }
                return null;
            case 28:
                return Boolean.valueOf(obj instanceof nu);
            default:
                String str6 = (String) obj;
                if (Intrinsics.a(str6, MeasurementUnit.NONE)) {
                    return jv.NONE;
                }
                if (Intrinsics.a(str6, "data_change")) {
                    return jv.DATA_CHANGE;
                }
                if (Intrinsics.a(str6, "state_change")) {
                    return jv.STATE_CHANGE;
                }
                if (Intrinsics.a(str6, "any_change")) {
                    return jv.ANY_CHANGE;
                }
                return null;
        }
    }
}
