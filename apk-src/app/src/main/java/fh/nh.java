package fh;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class nh implements TemplateResolver {
    public static kh a(ParsingContext parsingContext, ph phVar, JSONObject jSONObject) {
        JsonFieldResolver.resolveOptionalExpression(parsingContext, phVar.f18096a, jSONObject, "allow_empty", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN, oh.f18036a);
        Field field = phVar.f18097b;
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        JsonFieldResolver.resolveExpression(parsingContext, field, jSONObject, "label_id", typeHelper);
        JsonFieldResolver.resolveExpression(parsingContext, phVar.f18098c, jSONObject, "pattern", typeHelper);
        return new kh();
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public final /* bridge */ /* synthetic */ Object resolve(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        return a(parsingContext, (ph) entityTemplate, (JSONObject) obj);
    }
}
