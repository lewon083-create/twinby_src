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
public final class e1 implements TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17127a;

    public e1(sy syVar) {
        this.f17127a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final h1 deserialize(ParsingContext parsingContext, h1 h1Var, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        Field field = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "animator_id", allowPropertyOverride, h1Var != null ? h1Var.f17317a : null);
        Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "direction", g1.f17251a, allowPropertyOverride, h1Var != null ? h1Var.f17318b : null, v0.f18736y);
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        Field field2 = h1Var != null ? h1Var.f17319c : null;
        Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
        Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "duration", typeHelper, allowPropertyOverride, field2, function1, g1.f17253c);
        Field field3 = h1Var != null ? h1Var.f17320d : null;
        sy syVar = this.f17127a;
        return new h1(field, optionalFieldWithExpression, optionalFieldWithExpression2, JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "end_value", allowPropertyOverride, field3, syVar.Y8), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "interpolator", g1.f17252b, allowPropertyOverride, h1Var != null ? h1Var.f17321e : null, v0.f18737z), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "repeat_count", allowPropertyOverride, h1Var != null ? h1Var.f17322f : null, syVar.f18563w2), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "start_delay", typeHelper, allowPropertyOverride, h1Var != null ? h1Var.f17323g : null, function1, g1.f17254d), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "start_value", allowPropertyOverride, h1Var != null ? h1Var.f17324h : null, syVar.Y8));
    }
}
