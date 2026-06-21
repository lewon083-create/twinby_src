package fh;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import io.sentry.SentryEnvelopeItemHeader;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j3 implements TemplateResolver {
    public static g3 a(ParsingContext parsingContext, l3 l3Var, JSONObject jSONObject) {
        JsonFieldResolver.resolveOptionalExpression(parsingContext, l3Var.f17667a, jSONObject, "animated", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN, k3.f17556a);
        JsonFieldResolver.resolveExpression(parsingContext, l3Var.f17668b, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING);
        Field field = l3Var.f17669c;
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, SentryEnvelopeItemHeader.JsonKeys.ITEM_COUNT, typeHelper, function1, k3.f17557b);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, l3Var.f17670d, jSONObject, "offset", typeHelper, function1, k3.f17558c);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, l3Var.f17671e, jSONObject, "overflow", k3.f17560e, v0.f18725n, k3.f17559d);
        return new g3();
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public final /* bridge */ /* synthetic */ Object resolve(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        return a(parsingContext, (l3) entityTemplate, (JSONObject) obj);
    }
}
