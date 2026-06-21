package fh;

import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.json.expressions.Expression;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Expression f17556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Expression f17557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression f17558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression f17559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final TypeHelper f17560e;

    static {
        Expression.Companion companion = Expression.Companion;
        f17556a = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f17557b = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f17558c = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f3 f3Var = f3.CLAMP;
        f17559d = Expression.Companion.constant$default(companion, f3Var, null, 2, null);
        f17560e = TypeHelper.Companion.from(f3Var, v0.f18726o);
    }
}
