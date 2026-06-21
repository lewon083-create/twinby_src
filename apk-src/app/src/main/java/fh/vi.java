package fh;

import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.json.expressions.Expression;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class vi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Expression f18777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f18778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f18779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final TypeHelper f18780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final TypeHelper f18781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final hf f18782f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final hf f18783g;

    static {
        Expression.Companion companion = Expression.Companion;
        v6 v6Var = v6.NORMAL;
        f18777a = Expression.Companion.constant$default(companion, v6Var, null, 2, null);
        w6 w6Var = w6.LINEAR;
        f18778b = Expression.Companion.constant$default(companion, w6Var, null, 2, null);
        Expression.Companion.constant$default(companion, 1L, null, 2, null);
        f18779c = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f18780d = companion2.from(v6Var, mg.f17857p);
        f18781e = companion2.from(w6Var, mg.f17858q);
        f18782f = new hf(17);
        f18783g = new hf(18);
    }
}
