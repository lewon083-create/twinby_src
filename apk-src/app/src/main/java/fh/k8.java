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
public final class k8 implements TemplateResolver {
    public static h8 a(ParsingContext parsingContext, m8 m8Var, JSONObject jSONObject) {
        Field field = m8Var.f17789a;
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "duration", typeHelper, function1, l8.f17682e, l8.f17678a);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, m8Var.f17790b, jSONObject, "interpolator", l8.f17681d, v0.f18737z, l8.f17679b);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, m8Var.f17791c, jSONObject, "start_delay", typeHelper, function1, l8.f17683f, l8.f17680c);
        return new h8();
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public final /* bridge */ /* synthetic */ Object resolve(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        return a(parsingContext, (m8) entityTemplate, (JSONObject) obj);
    }
}
