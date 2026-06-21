package fh;

import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.json.expressions.Expression;
import com.yandex.varioqub.config.model.ConfigValue;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class cc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Expression f17011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f17012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f17013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression f17014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final TypeHelper f17015e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m9 f17016f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m9 f17017g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m9 f17018h;

    static {
        Expression.Companion companion = Expression.Companion;
        f17011a = Expression.Companion.constant$default(companion, Double.valueOf(ConfigValue.DOUBLE_DEFAULT_VALUE), null, 2, null);
        f17012b = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        w6 w6Var = w6.EASE_IN_OUT;
        f17013c = Expression.Companion.constant$default(companion, w6Var, null, 2, null);
        f17014d = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f17015e = TypeHelper.Companion.from(w6Var, w9.f18846u);
        f17016f = new m9(26);
        f17017g = new m9(27);
        f17018h = new m9(28);
    }
}
