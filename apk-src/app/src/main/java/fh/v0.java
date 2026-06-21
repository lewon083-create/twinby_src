package fh;

import io.sentry.MeasurementUnit;
import io.sentry.ProfilingTraceData;
import io.sentry.protocol.Spring;
import io.sentry.rrweb.RRWebOptionsEvent;
import io.sentry.rrweb.RRWebVideoEvent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class v0 extends kotlin.jvm.internal.r implements Function1 {
    public static final v0 A;
    public static final v0 B;
    public static final v0 C;
    public static final v0 D;
    public static final v0 E;
    public static final v0 F;
    public static final v0 G;
    public static final v0 H;
    public static final v0 I;
    public static final v0 J;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v0 f18719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v0 f18720h;
    public static final v0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final v0 f18721j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final v0 f18722k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final v0 f18723l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final v0 f18724m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final v0 f18725n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final v0 f18726o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final v0 f18727p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final v0 f18728q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final v0 f18729r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final v0 f18730s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final v0 f18731t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final v0 f18732u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final v0 f18733v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final v0 f18734w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final v0 f18735x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final v0 f18736y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final v0 f18737z;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f18738f;

    static {
        int i10 = 1;
        f18719g = new v0(i10, 0);
        f18720h = new v0(i10, 1);
        i = new v0(i10, 2);
        f18721j = new v0(i10, 3);
        f18722k = new v0(i10, 4);
        f18723l = new v0(i10, 5);
        f18724m = new v0(i10, 6);
        f18725n = new v0(i10, 7);
        f18726o = new v0(i10, 8);
        f18727p = new v0(i10, 9);
        f18728q = new v0(i10, 10);
        f18729r = new v0(i10, 11);
        f18730s = new v0(i10, 12);
        f18731t = new v0(i10, 13);
        f18732u = new v0(i10, 14);
        f18733v = new v0(i10, 15);
        f18734w = new v0(i10, 16);
        f18735x = new v0(i10, 17);
        f18736y = new v0(i10, 18);
        f18737z = new v0(i10, 19);
        A = new v0(i10, 20);
        B = new v0(i10, 21);
        C = new v0(i10, 22);
        D = new v0(i10, 23);
        E = new v0(i10, 24);
        F = new v0(i10, 25);
        G = new v0(i10, 26);
        H = new v0(i10, 27);
        I = new v0(i10, 28);
        J = new v0(i10, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(int i10, int i11) {
        super(i10);
        this.f18738f = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18738f) {
            case 0:
                String str = (String) obj;
                if (Intrinsics.a(str, "default")) {
                    return w0.DEFAULT;
                }
                if (Intrinsics.a(str, "merge")) {
                    return w0.MERGE;
                }
                if (Intrinsics.a(str, "exclude")) {
                    return w0.EXCLUDE;
                }
                return null;
            case 1:
                String str2 = (String) obj;
                if (Intrinsics.a(str2, MeasurementUnit.NONE)) {
                    return x0.NONE;
                }
                if (Intrinsics.a(str2, "button")) {
                    return x0.BUTTON;
                }
                if (Intrinsics.a(str2, "image")) {
                    return x0.IMAGE;
                }
                if (Intrinsics.a(str2, "text")) {
                    return x0.TEXT;
                }
                if (Intrinsics.a(str2, "edit_text")) {
                    return x0.EDIT_TEXT;
                }
                if (Intrinsics.a(str2, "header")) {
                    return x0.HEADER;
                }
                if (Intrinsics.a(str2, "tab_bar")) {
                    return x0.TAB_BAR;
                }
                if (Intrinsics.a(str2, "list")) {
                    return x0.LIST;
                }
                if (Intrinsics.a(str2, "select")) {
                    return x0.SELECT;
                }
                if (Intrinsics.a(str2, "checkbox")) {
                    return x0.CHECKBOX;
                }
                if (Intrinsics.a(str2, "radio")) {
                    return x0.RADIO;
                }
                if (Intrinsics.a(str2, "auto")) {
                    return x0.AUTO;
                }
                return null;
            case 2:
                return Boolean.valueOf(obj instanceof w0);
            case 3:
                String str3 = (String) obj;
                if (Intrinsics.a(str3, "_self")) {
                    return b1.SELF;
                }
                if (Intrinsics.a(str3, "_blank")) {
                    return b1.BLANK;
                }
                return null;
            case 4:
                return Boolean.valueOf(obj instanceof v6);
            case 5:
                return Boolean.valueOf(obj instanceof w6);
            case 6:
                return Boolean.valueOf(obj instanceof b1);
            case 7:
                String str4 = (String) obj;
                if (Intrinsics.a(str4, "clamp")) {
                    return f3.CLAMP;
                }
                if (Intrinsics.a(str4, "ring")) {
                    return f3.RING;
                }
                return null;
            case 8:
                return Boolean.valueOf(obj instanceof f3);
            case 9:
                String str5 = (String) obj;
                if (Intrinsics.a(str5, "get")) {
                    return r4.GET;
                }
                if (Intrinsics.a(str5, "post")) {
                    return r4.POST;
                }
                if (Intrinsics.a(str5, "put")) {
                    return r4.PUT;
                }
                if (Intrinsics.a(str5, "patch")) {
                    return r4.PATCH;
                }
                if (Intrinsics.a(str5, "delete")) {
                    return r4.DELETE;
                }
                if (Intrinsics.a(str5, "head")) {
                    return r4.HEAD;
                }
                if (Intrinsics.a(str5, RRWebOptionsEvent.EVENT_TAG)) {
                    return r4.OPTIONS;
                }
                return null;
            case 10:
                return Boolean.valueOf(obj instanceof r4);
            case 11:
                String str6 = (String) obj;
                if (Intrinsics.a(str6, "start")) {
                    return c5.START;
                }
                if (Intrinsics.a(str6, "stop")) {
                    return c5.STOP;
                }
                if (Intrinsics.a(str6, "pause")) {
                    return c5.PAUSE;
                }
                if (Intrinsics.a(str6, "resume")) {
                    return c5.RESUME;
                }
                if (Intrinsics.a(str6, "cancel")) {
                    return c5.CANCEL;
                }
                if (Intrinsics.a(str6, "reset")) {
                    return c5.RESET;
                }
                return null;
            case 12:
                return Boolean.valueOf(obj instanceof c5);
            case 13:
                String str7 = (String) obj;
                if (Intrinsics.a(str7, "start")) {
                    return l6.START;
                }
                if (Intrinsics.a(str7, "pause")) {
                    return l6.PAUSE;
                }
                return null;
            case 14:
                return Boolean.valueOf(obj instanceof l6);
            case 15:
                String str8 = (String) obj;
                if (Intrinsics.a(str8, RRWebVideoEvent.JsonKeys.LEFT)) {
                    return r6.LEFT;
                }
                if (Intrinsics.a(str8, "center")) {
                    return r6.CENTER;
                }
                if (Intrinsics.a(str8, "right")) {
                    return r6.RIGHT;
                }
                if (Intrinsics.a(str8, "start")) {
                    return r6.START;
                }
                if (Intrinsics.a(str8, "end")) {
                    return r6.END;
                }
                return null;
            case 16:
                String str9 = (String) obj;
                if (Intrinsics.a(str9, RRWebVideoEvent.JsonKeys.TOP)) {
                    return s6.TOP;
                }
                if (Intrinsics.a(str9, "center")) {
                    return s6.CENTER;
                }
                if (Intrinsics.a(str9, "bottom")) {
                    return s6.BOTTOM;
                }
                if (Intrinsics.a(str9, "baseline")) {
                    return s6.BASELINE;
                }
                return null;
            case 17:
                String str10 = (String) obj;
                if (Intrinsics.a(str10, "fade")) {
                    return t6.FADE;
                }
                if (Intrinsics.a(str10, "translate")) {
                    return t6.TRANSLATE;
                }
                if (Intrinsics.a(str10, "scale")) {
                    return t6.SCALE;
                }
                if (Intrinsics.a(str10, "native")) {
                    return t6.NATIVE;
                }
                if (Intrinsics.a(str10, "set")) {
                    return t6.SET;
                }
                if (Intrinsics.a(str10, "no_animation")) {
                    return t6.NO_ANIMATION;
                }
                return null;
            case 18:
                String str11 = (String) obj;
                if (Intrinsics.a(str11, ProfilingTraceData.TRUNCATION_REASON_NORMAL)) {
                    return v6.NORMAL;
                }
                if (Intrinsics.a(str11, "reverse")) {
                    return v6.REVERSE;
                }
                if (Intrinsics.a(str11, "alternate")) {
                    return v6.ALTERNATE;
                }
                if (Intrinsics.a(str11, "alternate_reverse")) {
                    return v6.ALTERNATE_REVERSE;
                }
                return null;
            case 19:
                String str12 = (String) obj;
                if (Intrinsics.a(str12, "linear")) {
                    return w6.LINEAR;
                }
                if (Intrinsics.a(str12, "ease")) {
                    return w6.EASE;
                }
                if (Intrinsics.a(str12, "ease_in")) {
                    return w6.EASE_IN;
                }
                if (Intrinsics.a(str12, "ease_out")) {
                    return w6.EASE_OUT;
                }
                if (Intrinsics.a(str12, "ease_in_out")) {
                    return w6.EASE_IN_OUT;
                }
                if (Intrinsics.a(str12, Spring.TYPE)) {
                    return w6.SPRING;
                }
                return null;
            case 20:
                return Boolean.valueOf(obj instanceof w6);
            case 21:
                return Boolean.valueOf(obj instanceof t6);
            case 22:
                String str13 = (String) obj;
                if (Intrinsics.a(str13, "source_in")) {
                    return z7.SOURCE_IN;
                }
                if (Intrinsics.a(str13, "source_atop")) {
                    return z7.SOURCE_ATOP;
                }
                if (Intrinsics.a(str13, "darken")) {
                    return z7.DARKEN;
                }
                if (Intrinsics.a(str13, "lighten")) {
                    return z7.LIGHTEN;
                }
                if (Intrinsics.a(str13, "multiply")) {
                    return z7.MULTIPLY;
                }
                if (Intrinsics.a(str13, "screen")) {
                    return z7.SCREEN;
                }
                return null;
            case 23:
                return Boolean.valueOf(obj instanceof w6);
            case 24:
                return Boolean.valueOf(obj instanceof v6);
            case 25:
                return Boolean.valueOf(obj instanceof w6);
            case 26:
                String str14 = (String) obj;
                if (Intrinsics.a(str14, "no_wrap")) {
                    return s9.NO_WRAP;
                }
                if (Intrinsics.a(str14, "wrap")) {
                    return s9.WRAP;
                }
                return null;
            case 27:
                String str15 = (String) obj;
                if (Intrinsics.a(str15, "vertical")) {
                    return t9.VERTICAL;
                }
                if (Intrinsics.a(str15, "horizontal")) {
                    return t9.HORIZONTAL;
                }
                if (Intrinsics.a(str15, "overlap")) {
                    return t9.OVERLAP;
                }
                return null;
            case 28:
                return Boolean.valueOf(obj instanceof r6);
            default:
                return Boolean.valueOf(obj instanceof s6);
        }
    }
}
