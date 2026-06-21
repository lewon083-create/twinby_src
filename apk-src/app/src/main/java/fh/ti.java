package fh;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateDeserializer;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ti implements TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18649a;

    public ti(sy syVar) {
        this.f18649a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final wi deserialize(ParsingContext parsingContext, wi wiVar, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        Field field = wiVar != null ? wiVar.f18892a : null;
        sy syVar = this.f18649a;
        Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "cancel_actions", allowPropertyOverride, field, syVar.f18453l1);
        Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "direction", vi.f18780d, allowPropertyOverride, wiVar != null ? wiVar.f18893b : null, v0.f18736y);
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        Field field2 = wiVar != null ? wiVar.f18894c : null;
        Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
        Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "duration", typeHelper, allowPropertyOverride, field2, function1, vi.f18782f);
        Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "end_actions", allowPropertyOverride, wiVar != null ? wiVar.f18895d : null, syVar.f18453l1);
        TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
        Field field3 = wiVar != null ? wiVar.f18896e : null;
        Function1<Number, Double> function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
        return new wi(optionalListField, optionalFieldWithExpression, fieldWithExpression, optionalListField2, JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "end_value", typeHelper2, allowPropertyOverride, field3, function12), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, wiVar != null ? wiVar.f18897f : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "interpolator", vi.f18781e, allowPropertyOverride, wiVar != null ? wiVar.f18898g : null, v0.f18737z), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "repeat_count", allowPropertyOverride, wiVar != null ? wiVar.f18899h : null, syVar.f18563w2), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start_delay", typeHelper, allowPropertyOverride, wiVar != null ? wiVar.i : null, function1, vi.f18783g), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start_value", typeHelper2, allowPropertyOverride, wiVar != null ? wiVar.f18900j : null, function12), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "variable_name", allowPropertyOverride, wiVar != null ? wiVar.f18901k : null));
    }
}
