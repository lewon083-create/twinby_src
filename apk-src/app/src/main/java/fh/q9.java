package fh;

import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.json.expressions.Expression;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class q9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Expression f18151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f18152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f18153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final TypeHelper f18154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final TypeHelper f18155e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m9 f18156f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m9 f18157g;

    static {
        Expression.Companion companion = Expression.Companion;
        v6 v6Var = v6.NORMAL;
        f18151a = Expression.Companion.constant$default(companion, v6Var, null, 2, null);
        w6 w6Var = w6.LINEAR;
        f18152b = Expression.Companion.constant$default(companion, w6Var, null, 2, null);
        Expression.Companion.constant$default(companion, 1L, null, 2, null);
        f18153c = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f18154d = companion2.from(v6Var, v0.E);
        f18155e = companion2.from(w6Var, v0.F);
        f18156f = new m9(0);
        f18157g = new m9(1);
    }
}
