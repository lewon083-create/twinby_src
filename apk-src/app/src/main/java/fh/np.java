package fh;

import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.json.expressions.Expression;
import com.yandex.varioqub.config.model.ConfigValue;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class np {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Expression f18002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f18003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f18004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression f18005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final TypeHelper f18006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final TypeHelper f18007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ep f18008g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ep f18009h;

    static {
        Expression.Companion companion = Expression.Companion;
        f18002a = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        ro roVar = ro.SP;
        f18003b = Expression.Companion.constant$default(companion, roVar, null, 2, null);
        f18004c = Expression.Companion.constant$default(companion, Double.valueOf(ConfigValue.DOUBLE_DEFAULT_VALUE), null, 2, null);
        f18005d = Expression.Companion.constant$default(companion, -16777216, null, 2, null);
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f18006e = companion2.from(roVar, hn.f17357w);
        f18007f = companion2.from(kotlin.collections.p.m(md.values()), hn.f17358x);
        f18008g = new ep(3);
        f18009h = new ep(4);
    }
}
