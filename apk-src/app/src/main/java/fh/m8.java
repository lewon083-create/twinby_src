package fh;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class m8 implements JsonTemplate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f17789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f17790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f17791c;

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, 200L, null, 2, null);
        Expression.Companion.constant$default(companion, w6.EASE_IN_OUT, null, 2, null);
        Expression.Companion.constant$default(companion, 0L, null, 2, null);
    }

    public m8(Field field, Field field2, Field field3) {
        this.f17789a = field;
        this.f17790b = field2;
        this.f17791c = field3;
    }
}
