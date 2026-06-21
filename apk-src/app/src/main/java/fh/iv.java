package fh;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class iv implements JsonTemplate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f17449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f17450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f17451c;

    static {
        Expression.Companion companion = Expression.Companion;
        Double dValueOf = Double.valueOf(50.0d);
        Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
    }

    public iv(Field field, Field field2, Field field3) {
        this.f17449a = field;
        this.f17450b = field2;
        this.f17451c = field3;
    }
}
