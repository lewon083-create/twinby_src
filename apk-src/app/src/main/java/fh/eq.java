package fh;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class eq implements JsonTemplate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f17166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f17167b;

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, 5L, null, 2, null);
        Expression.Companion.constant$default(companion, 10L, null, 2, null);
    }

    public eq(Field field, Field field2) {
        this.f17166a = field;
        this.f17167b = field2;
    }
}
