package fh;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateDeserializer;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class dx implements TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17122a;

    public dx(sy syVar) {
        this.f17122a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fx deserialize(ParsingContext parsingContext, fx fxVar, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "constrained", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, fxVar != null ? fxVar.f17245a : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
        Field field = fxVar != null ? fxVar.f17246b : null;
        sy syVar = this.f17122a;
        return new fx(optionalFieldWithExpression, JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "max_size", allowPropertyOverride, field, syVar.R6), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "min_size", allowPropertyOverride, fxVar != null ? fxVar.f17247c : null, syVar.R6));
    }
}
