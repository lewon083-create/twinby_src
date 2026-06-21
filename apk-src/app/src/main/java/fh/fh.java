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
import io.sentry.rrweb.RRWebVideoEvent;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class fh implements TemplateDeserializer {
    public static ih a(ParsingContext parsingContext, ih ihVar, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
        Field field = ihVar != null ? ihVar.f17386a : null;
        Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
        return new ih(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "allow_empty", typeHelper, allowPropertyOverride, field, function1), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "condition", typeHelper, allowPropertyOverride, ihVar != null ? ihVar.f17387b : null, function1), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "label_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, ihVar != null ? ihVar.f17388c : null), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, RRWebVideoEvent.REPLAY_FRAME_RATE_TYPE_VARIABLE, allowPropertyOverride, ihVar != null ? ihVar.f17389d : null));
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public final /* bridge */ /* synthetic */ EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        return a(parsingContext, (ih) entityTemplate, (JSONObject) obj);
    }
}
