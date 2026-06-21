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
public final class wl implements TemplateResolver {
    public static tl a(ParsingContext parsingContext, yl ylVar, JSONObject jSONObject) {
        JsonFieldResolver.resolveOptionalExpression(parsingContext, ylVar.f19155a, jSONObject, "unit", xl.f19031b, hn.f17349o, xl.f19030a);
        JsonFieldResolver.resolveExpression(parsingContext, ylVar.f19156b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT);
        return new tl();
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public final /* bridge */ /* synthetic */ Object resolve(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        return a(parsingContext, (yl) entityTemplate, (JSONObject) obj);
    }
}
