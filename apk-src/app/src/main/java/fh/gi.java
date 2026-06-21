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
public final class gi implements TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17295a;

    public gi(sy syVar) {
        this.f17295a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ii deserialize(ParsingContext parsingContext, ii iiVar, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        Field field = iiVar != null ? iiVar.f17390a : null;
        sy syVar = this.f17295a;
        return new ii(JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "max_size", allowPropertyOverride, field, syVar.R6), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "min_size", allowPropertyOverride, iiVar != null ? iiVar.f17391b : null, syVar.R6), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "weight", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, iiVar != null ? iiVar.f17392c : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, j6.f17473o));
    }
}
