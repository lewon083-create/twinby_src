package fh;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ao implements JsonTemplate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f16837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f16838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f16839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f16840d;

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, Double.valueOf(0.19d), null, 2, null);
        Expression.Companion.constant$default(companion, 2L, null, 2, null);
        Expression.Companion.constant$default(companion, 0, null, 2, null);
    }

    public ao(Field field, Field field2, Field field3, Field field4) {
        this.f16837a = field;
        this.f16838b = field2;
        this.f16839c = field3;
        this.f16840d = field4;
    }
}
