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
public final class k implements TemplateResolver {
    @Override // com.yandex.div.serialization.TemplateResolver
    public final Object resolve(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        JsonFieldResolver.resolveExpression(parsingContext, ((l) entityTemplate).f17664a, (JSONObject) obj, "value", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN);
        return new nc.e();
    }
}
