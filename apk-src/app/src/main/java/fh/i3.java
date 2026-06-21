package fh;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateDeserializer;
import io.sentry.SentryEnvelopeItemHeader;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i3 implements TemplateDeserializer {
    public static l3 a(ParsingContext parsingContext, l3 l3Var, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "animated", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, l3Var != null ? l3Var.f17667a : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
        Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, l3Var != null ? l3Var.f17668b : null);
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        Field field = l3Var != null ? l3Var.f17669c : null;
        Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
        return new l3(optionalFieldWithExpression, fieldWithExpression, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, SentryEnvelopeItemHeader.JsonKeys.ITEM_COUNT, typeHelper, allowPropertyOverride, field, function1), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "offset", typeHelper, allowPropertyOverride, l3Var != null ? l3Var.f17670d : null, function1), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "overflow", k3.f17560e, allowPropertyOverride, l3Var != null ? l3Var.f17671e : null, v0.f18725n));
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public final /* bridge */ /* synthetic */ EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        return a(parsingContext, (l3) entityTemplate, (JSONObject) obj);
    }
}
