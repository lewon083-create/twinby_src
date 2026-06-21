package fh;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zt implements TemplateResolver {
    public static wt a(ParsingContext parsingContext, bu buVar, JSONObject jSONObject) {
        JsonFieldResolver.resolveExpression(parsingContext, buVar.f16981a, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, buVar.f16982b, jSONObject, "is_enabled", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN, au.f16877a);
        return new wt();
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public final /* bridge */ /* synthetic */ Object resolve(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        return a(parsingContext, (bu) entityTemplate, (JSONObject) obj);
    }
}
