package fh;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vt implements JsonTemplate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f18804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f18805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f18806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f18807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f18808e;

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, Double.valueOf(0.8d), null, 2, null);
        Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        Expression.Companion.constant$default(companion, 1L, null, 2, null);
    }

    public vt(Field field, Field field2, Field field3, Field field4, Field field5) {
        this.f18804a = field;
        this.f18805b = field2;
        this.f18806c = field3;
        this.f18807d = field4;
        this.f18808e = field5;
    }
}
