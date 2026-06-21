package fh;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.varioqub.config.model.ConfigValue;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class fn implements JsonTemplate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f17219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f17220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f17221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f17222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f17223e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field f17224f;

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, 200L, null, 2, null);
        Expression.Companion.constant$default(companion, w6.EASE_IN_OUT, null, 2, null);
        Double dValueOf = Double.valueOf(0.5d);
        Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        Expression.Companion.constant$default(companion, Double.valueOf(ConfigValue.DOUBLE_DEFAULT_VALUE), null, 2, null);
        Expression.Companion.constant$default(companion, 0L, null, 2, null);
    }

    public fn(Field field, Field field2, Field field3, Field field4, Field field5, Field field6) {
        this.f17219a = field;
        this.f17220b = field2;
        this.f17221c = field3;
        this.f17222d = field4;
        this.f17223e = field5;
        this.f17224f = field6;
    }
}
