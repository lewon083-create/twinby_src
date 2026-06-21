package fh;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class dn implements TemplateResolver {
    public static an a(ParsingContext parsingContext, fn fnVar, JSONObject jSONObject) {
        Field field = fnVar.f17219a;
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "duration", typeHelper, function1, en.f17160h, en.f17153a);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, fnVar.f17220b, jSONObject, "interpolator", en.f17159g, v0.f18737z, en.f17154b);
        Field field2 = fnVar.f17221c;
        TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
        Function1<Number, Double> function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "pivot_x", typeHelper2, function12, en.i, en.f17155c);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, fnVar.f17222d, jSONObject, "pivot_y", typeHelper2, function12, en.f17161j, en.f17156d);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, fnVar.f17223e, jSONObject, "scale", typeHelper2, function12, en.f17162k, en.f17157e);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, fnVar.f17224f, jSONObject, "start_delay", typeHelper, function1, en.f17163l, en.f17158f);
        return new an();
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public final /* bridge */ /* synthetic */ Object resolve(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        return a(parsingContext, (fn) entityTemplate, (JSONObject) obj);
    }
}
