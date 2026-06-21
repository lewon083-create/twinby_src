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
public final class wm implements TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18906a;

    public wm(sy syVar) {
        this.f18906a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zm deserialize(ParsingContext parsingContext, zm zmVar, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "background_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, zmVar != null ? zmVar.f19270a : null, ParsingConvertersKt.STRING_TO_COLOR_INT);
        Field field = zmVar != null ? zmVar.f19271b : null;
        sy syVar = this.f18906a;
        return new zm(optionalFieldWithExpression, JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "corner_radius", allowPropertyOverride, field, syVar.f18564w3), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "item_height", allowPropertyOverride, zmVar != null ? zmVar.f19272c : null, syVar.f18564w3), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "item_width", allowPropertyOverride, zmVar != null ? zmVar.f19273d : null, syVar.f18564w3), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "stroke", allowPropertyOverride, zmVar != null ? zmVar.f19274e : null, syVar.E7));
    }
}
