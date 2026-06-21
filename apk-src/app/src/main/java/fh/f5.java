package fh;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f5 implements TemplateResolver {
    @Override // com.yandex.div.serialization.TemplateResolver
    public final Object resolve(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        h5 h5Var = (h5) entityTemplate;
        JSONObject jSONObject = (JSONObject) obj;
        JsonFieldResolver.resolveExpression(parsingContext, h5Var.f17326a, jSONObject, "action", g5.f17257a, v0.f18729r);
        JsonFieldResolver.resolveExpression(parsingContext, h5Var.f17327b, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING);
        return new wd.d();
    }
}
