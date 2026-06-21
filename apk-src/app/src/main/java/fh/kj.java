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
public final class kj implements TemplateResolver {
    public static hj a(ParsingContext parsingContext, mj mjVar, JSONObject jSONObject) {
        JsonFieldResolver.resolveOptionalExpression(parsingContext, mjVar.f17870a, jSONObject, "interpolator", lj.f17715g, v0.f18737z, lj.f17709a);
        Field field = mjVar.f17871b;
        TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
        Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "next_page_alpha", typeHelper, function1, lj.f17716h, lj.f17710b);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, mjVar.f17872c, jSONObject, "next_page_scale", typeHelper, function1, lj.i, lj.f17711c);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, mjVar.f17873d, jSONObject, "previous_page_alpha", typeHelper, function1, lj.f17717j, lj.f17712d);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, mjVar.f17874e, jSONObject, "previous_page_scale", typeHelper, function1, lj.f17718k, lj.f17713e);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, mjVar.f17875f, jSONObject, "reversed_stacking_order", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN, lj.f17714f);
        return new hj();
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public final /* bridge */ /* synthetic */ Object resolve(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        return a(parsingContext, (mj) entityTemplate, (JSONObject) obj);
    }
}
