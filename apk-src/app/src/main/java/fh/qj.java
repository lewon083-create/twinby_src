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
public final class qj implements TemplateResolver {
    public static nj a(ParsingContext parsingContext, sj sjVar, JSONObject jSONObject) {
        JsonFieldResolver.resolveOptionalExpression(parsingContext, sjVar.f18314a, jSONObject, "interpolator", rj.f18244f, v0.f18737z, rj.f18239a);
        Field field = sjVar.f18315b;
        TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
        Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "next_page_alpha", typeHelper, function1, rj.f18245g, rj.f18240b);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, sjVar.f18316c, jSONObject, "next_page_scale", typeHelper, function1, rj.f18246h, rj.f18241c);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, sjVar.f18317d, jSONObject, "previous_page_alpha", typeHelper, function1, rj.i, rj.f18242d);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, sjVar.f18318e, jSONObject, "previous_page_scale", typeHelper, function1, rj.f18247j, rj.f18243e);
        return new nj();
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public final /* bridge */ /* synthetic */ Object resolve(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        return a(parsingContext, (sj) entityTemplate, (JSONObject) obj);
    }
}
