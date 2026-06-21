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
public final class n6 implements TemplateDeserializer {
    public static q6 a(ParsingContext parsingContext, q6 q6Var, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new q6(JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "action", p6.f18085a, allowPropertyOverride, q6Var != null ? q6Var.f18147a : null, v0.f18731t), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, q6Var != null ? q6Var.f18148b : null));
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public final /* bridge */ /* synthetic */ EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        return a(parsingContext, (q6) entityTemplate, (JSONObject) obj);
    }
}
