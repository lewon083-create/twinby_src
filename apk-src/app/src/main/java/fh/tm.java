package fh;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class tm implements JsonTemplate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f18651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f18652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f18653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f18654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f18655e;

    static {
        Expression.Companion companion = Expression.Companion;
        Double dValueOf = Double.valueOf(0.5d);
        Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        Expression.Companion.constant$default(companion, mm.FARTHEST_CORNER, null, 2, null);
    }

    public tm(Field field, Field field2, Field field3, Field field4, Field field5) {
        this.f18651a = field;
        this.f18652b = field2;
        this.f18653c = field3;
        this.f18654d = field4;
        this.f18655e = field5;
    }
}
