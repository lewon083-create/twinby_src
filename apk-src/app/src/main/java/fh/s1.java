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
public final class s1 implements TemplateResolver {
    @Override // com.yandex.div.serialization.TemplateResolver
    public final Object resolve(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        t1 t1Var = (t1) entityTemplate;
        JSONObject jSONObject = (JSONObject) obj;
        JsonFieldResolver.resolveExpression(parsingContext, t1Var.f18610a, jSONObject, "index", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT);
        JsonFieldResolver.resolveExpression(parsingContext, t1Var.f18611b, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING);
        return new nc.e();
    }
}
