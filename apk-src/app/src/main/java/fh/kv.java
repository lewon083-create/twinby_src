package fh;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class kv extends kotlin.jvm.internal.r implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final kv f17646g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final kv f17647h;
    public static final kv i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final kv f17648j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final kv f17649k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final kv f17650l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final kv f17651m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final kv f17652n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final kv f17653o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final kv f17654p;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f17655f;

    static {
        int i10 = 1;
        f17646g = new kv(i10, 0);
        f17647h = new kv(i10, 1);
        i = new kv(i10, 2);
        f17648j = new kv(i10, 3);
        f17649k = new kv(i10, 4);
        f17650l = new kv(i10, 5);
        f17651m = new kv(i10, 6);
        f17652n = new kv(i10, 7);
        f17653o = new kv(i10, 8);
        f17654p = new kv(i10, 9);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kv(int i10, int i11) {
        super(i10);
        this.f17655f = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f17655f) {
            case 0:
                String str = (String) obj;
                if (Intrinsics.a(str, "data_change")) {
                    return lv.DATA_CHANGE;
                }
                if (Intrinsics.a(str, "state_change")) {
                    return lv.STATE_CHANGE;
                }
                if (Intrinsics.a(str, "visibility_change")) {
                    return lv.VISIBILITY_CHANGE;
                }
                return null;
            case 1:
                String str2 = (String) obj;
                if (Intrinsics.a(str2, "on_condition")) {
                    return mv.ON_CONDITION;
                }
                if (Intrinsics.a(str2, "on_variable")) {
                    return mv.ON_VARIABLE;
                }
                return null;
            case 2:
                return Boolean.valueOf(obj instanceof mv);
            case 3:
                return Boolean.valueOf(obj instanceof r6);
            case 4:
                return Boolean.valueOf(obj instanceof s6);
            case 5:
                return Boolean.valueOf(obj instanceof sw);
            case 6:
                return Boolean.valueOf(obj instanceof xw);
            case 7:
                String str3 = (String) obj;
                if (Intrinsics.a(str3, "fill")) {
                    return sw.FILL;
                }
                if (Intrinsics.a(str3, "no_scale")) {
                    return sw.NO_SCALE;
                }
                if (Intrinsics.a(str3, "fit")) {
                    return sw.FIT;
                }
                return null;
            case 8:
                String str4 = (String) obj;
                if (Intrinsics.a(str4, "visible")) {
                    return xw.VISIBLE;
                }
                if (Intrinsics.a(str4, "invisible")) {
                    return xw.INVISIBLE;
                }
                if (Intrinsics.a(str4, "gone")) {
                    return xw.GONE;
                }
                return null;
            default:
                return Boolean.valueOf(obj instanceof wb);
        }
    }
}
