package fh;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateDeserializer;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class l0 implements TemplateDeserializer {
    public static n0 a(ParsingContext parsingContext, n0 n0Var, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new n0(JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "name", allowPropertyOverride, n0Var != null ? n0Var.f17926a : null), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DICT, allowPropertyOverride, n0Var != null ? n0Var.f17927b : null));
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public final /* bridge */ /* synthetic */ EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        return a(parsingContext, (n0) entityTemplate, (JSONObject) obj);
    }
}
