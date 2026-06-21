package fh;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class l3 implements JsonTemplate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f17667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f17668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f17669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f17670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f17671e;

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        Expression.Companion.constant$default(companion, 0L, null, 2, null);
        Expression.Companion.constant$default(companion, 0L, null, 2, null);
        Expression.Companion.constant$default(companion, f3.CLAMP, null, 2, null);
    }

    public l3(Field field, Field field2, Field field3, Field field4, Field field5) {
        this.f17667a = field;
        this.f17668b = field2;
        this.f17669c = field3;
        this.f17670d = field4;
        this.f17671e = field5;
    }
}
