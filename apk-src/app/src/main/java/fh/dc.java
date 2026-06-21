package fh;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.varioqub.config.model.ConfigValue;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class dc implements JsonTemplate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f17084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f17085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f17086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f17087d;

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, Double.valueOf(ConfigValue.DOUBLE_DEFAULT_VALUE), null, 2, null);
        Expression.Companion.constant$default(companion, 200L, null, 2, null);
        Expression.Companion.constant$default(companion, w6.EASE_IN_OUT, null, 2, null);
        Expression.Companion.constant$default(companion, 0L, null, 2, null);
    }

    public dc(Field field, Field field2, Field field3, Field field4) {
        this.f17084a = field;
        this.f17085b = field2;
        this.f17086c = field3;
        this.f17087d = field4;
    }
}
