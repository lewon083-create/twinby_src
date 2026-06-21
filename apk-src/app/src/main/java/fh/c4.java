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
public final class c4 implements TemplateResolver {
    @Override // com.yandex.div.serialization.TemplateResolver
    public final Object resolve(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        e4 e4Var = (e4) entityTemplate;
        JSONObject jSONObject = (JSONObject) obj;
        JsonFieldResolver.resolveExpression(parsingContext, e4Var.f17131a, jSONObject, "state_id", TypeHelpersKt.TYPE_HELPER_STRING);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, e4Var.f17132b, jSONObject, "temporary", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN, d4.f17052a);
        return new z3();
    }
}
