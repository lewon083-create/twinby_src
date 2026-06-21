package fh;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateDeserializer;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hz implements TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17377a;

    public hz(sy syVar) {
        this.f17377a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final kz deserialize(ParsingContext parsingContext, kz kzVar, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new kz(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "get", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, kzVar != null ? kzVar.f17659a : null), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "name", allowPropertyOverride, kzVar != null ? kzVar.f17660b : null), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "new_value_variable_name", allowPropertyOverride, kzVar != null ? kzVar.f17661c : null), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "set", allowPropertyOverride, kzVar != null ? kzVar.f17662d : null, this.f17377a.f18453l1), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "value_type", jz.f17554a, allowPropertyOverride, kzVar != null ? kzVar.f17663e : null, w9.f18845t));
    }
}
