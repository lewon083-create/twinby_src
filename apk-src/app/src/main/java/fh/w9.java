package fh;

import io.sentry.MeasurementUnit;
import io.sentry.rrweb.RRWebVideoEvent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class w9 extends kotlin.jvm.internal.r implements Function1 {
    public static final w9 A;
    public static final w9 B;
    public static final w9 C;
    public static final w9 D;
    public static final w9 E;
    public static final w9 F;
    public static final w9 G;
    public static final w9 H;
    public static final w9 I;
    public static final w9 J;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final w9 f18833g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final w9 f18834h;
    public static final w9 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final w9 f18835j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final w9 f18836k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final w9 f18837l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final w9 f18838m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final w9 f18839n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final w9 f18840o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final w9 f18841p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final w9 f18842q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final w9 f18843r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final w9 f18844s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final w9 f18845t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final w9 f18846u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final w9 f18847v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final w9 f18848w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final w9 f18849x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final w9 f18850y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final w9 f18851z;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f18852f;

    static {
        int i10 = 1;
        f18833g = new w9(i10, 0);
        f18834h = new w9(i10, 1);
        i = new w9(i10, 2);
        f18835j = new w9(i10, 3);
        f18836k = new w9(i10, 4);
        f18837l = new w9(i10, 5);
        f18838m = new w9(i10, 6);
        f18839n = new w9(i10, 7);
        f18840o = new w9(i10, 8);
        f18841p = new w9(i10, 9);
        f18842q = new w9(i10, 10);
        f18843r = new w9(i10, 11);
        f18844s = new w9(i10, 12);
        f18845t = new w9(i10, 13);
        f18846u = new w9(i10, 14);
        f18847v = new w9(i10, 15);
        f18848w = new w9(i10, 16);
        f18849x = new w9(i10, 17);
        f18850y = new w9(i10, 18);
        f18851z = new w9(i10, 19);
        A = new w9(i10, 20);
        B = new w9(i10, 21);
        C = new w9(i10, 22);
        D = new w9(i10, 23);
        E = new w9(i10, 24);
        F = new w9(i10, 25);
        G = new w9(i10, 26);
        H = new w9(i10, 27);
        I = new w9(i10, 28);
        J = new w9(i10, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w9(int i10, int i11) {
        super(i10);
        this.f18852f = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18852f) {
            case 0:
                return Boolean.valueOf(obj instanceof ea);
            case 1:
                return Boolean.valueOf(obj instanceof fa);
            case 2:
                return Boolean.valueOf(obj instanceof s9);
            case 3:
                return Boolean.valueOf(obj instanceof t9);
            case 4:
                return Boolean.valueOf(obj instanceof xw);
            case 5:
                String str = (String) obj;
                if (Intrinsics.a(str, RRWebVideoEvent.JsonKeys.LEFT)) {
                    return ea.LEFT;
                }
                if (Intrinsics.a(str, "center")) {
                    return ea.CENTER;
                }
                if (Intrinsics.a(str, "right")) {
                    return ea.RIGHT;
                }
                if (Intrinsics.a(str, "start")) {
                    return ea.START;
                }
                if (Intrinsics.a(str, "end")) {
                    return ea.END;
                }
                if (Intrinsics.a(str, "space-between")) {
                    return ea.SPACE_BETWEEN;
                }
                if (Intrinsics.a(str, "space-around")) {
                    return ea.SPACE_AROUND;
                }
                if (Intrinsics.a(str, "space-evenly")) {
                    return ea.SPACE_EVENLY;
                }
                return null;
            case 6:
                String str2 = (String) obj;
                if (Intrinsics.a(str2, RRWebVideoEvent.JsonKeys.TOP)) {
                    return fa.TOP;
                }
                if (Intrinsics.a(str2, "center")) {
                    return fa.CENTER;
                }
                if (Intrinsics.a(str2, "bottom")) {
                    return fa.BOTTOM;
                }
                if (Intrinsics.a(str2, "baseline")) {
                    return fa.BASELINE;
                }
                if (Intrinsics.a(str2, "space-between")) {
                    return fa.SPACE_BETWEEN;
                }
                if (Intrinsics.a(str2, "space-around")) {
                    return fa.SPACE_AROUND;
                }
                if (Intrinsics.a(str2, "space-evenly")) {
                    return fa.SPACE_EVENLY;
                }
                return null;
            case 7:
                return Boolean.valueOf(obj instanceof r6);
            case 8:
                return Boolean.valueOf(obj instanceof s6);
            case 9:
                return Boolean.valueOf(obj instanceof xw);
            case 10:
                return Boolean.valueOf(obj instanceof jv);
            case 11:
                return Boolean.valueOf(obj instanceof ro);
            case 12:
                return Boolean.valueOf(obj instanceof ro);
            case 13:
                String str3 = (String) obj;
                if (Intrinsics.a(str3, "string")) {
                    return wb.STRING;
                }
                if (Intrinsics.a(str3, "integer")) {
                    return wb.INTEGER;
                }
                if (Intrinsics.a(str3, "number")) {
                    return wb.NUMBER;
                }
                if (Intrinsics.a(str3, "boolean")) {
                    return wb.BOOLEAN;
                }
                if (Intrinsics.a(str3, "datetime")) {
                    return wb.DATETIME;
                }
                if (Intrinsics.a(str3, "color")) {
                    return wb.COLOR;
                }
                if (Intrinsics.a(str3, "url")) {
                    return wb.URL;
                }
                if (Intrinsics.a(str3, "dict")) {
                    return wb.DICT;
                }
                if (Intrinsics.a(str3, "array")) {
                    return wb.ARRAY;
                }
                return null;
            case 14:
                return Boolean.valueOf(obj instanceof w6);
            case 15:
                return Boolean.valueOf(obj instanceof ro);
            case 16:
                String str4 = (String) obj;
                if (Intrinsics.a(str4, "light")) {
                    return md.LIGHT;
                }
                if (Intrinsics.a(str4, "medium")) {
                    return md.MEDIUM;
                }
                if (Intrinsics.a(str4, "regular")) {
                    return md.REGULAR;
                }
                if (Intrinsics.a(str4, "bold")) {
                    return md.BOLD;
                }
                return null;
            case 17:
                String str5 = (String) obj;
                if (Intrinsics.a(str5, "start")) {
                    return qd.START;
                }
                if (Intrinsics.a(str5, "center")) {
                    return qd.CENTER;
                }
                if (Intrinsics.a(str5, "end")) {
                    return qd.END;
                }
                return null;
            case 18:
                String str6 = (String) obj;
                if (Intrinsics.a(str6, "horizontal")) {
                    return rd.HORIZONTAL;
                }
                if (Intrinsics.a(str6, "vertical")) {
                    return rd.VERTICAL;
                }
                return null;
            case 19:
                String str7 = (String) obj;
                if (Intrinsics.a(str7, "paging")) {
                    return sd.PAGING;
                }
                if (Intrinsics.a(str7, "default")) {
                    return sd.DEFAULT;
                }
                return null;
            case 20:
                String str8 = (String) obj;
                if (Intrinsics.a(str8, MeasurementUnit.NONE)) {
                    return td.NONE;
                }
                if (Intrinsics.a(str8, "auto")) {
                    return td.AUTO;
                }
                return null;
            case 21:
                return Boolean.valueOf(obj instanceof r6);
            case 22:
                return Boolean.valueOf(obj instanceof s6);
            case 23:
                return Boolean.valueOf(obj instanceof qd);
            case 24:
                return Boolean.valueOf(obj instanceof rd);
            case 25:
                return Boolean.valueOf(obj instanceof td);
            case 26:
                return Boolean.valueOf(obj instanceof sd);
            case 27:
                return Boolean.valueOf(obj instanceof xw);
            case 28:
                return Boolean.valueOf(obj instanceof r6);
            default:
                return Boolean.valueOf(obj instanceof s6);
        }
    }
}
