package fh;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gh implements TemplateResolver {
    public static dh a(ParsingContext parsingContext, ih ihVar, JSONObject jSONObject) {
        Field field = ihVar.f17386a;
        TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
        Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "allow_empty", typeHelper, function1, hh.f17338a);
        JsonFieldResolver.resolveExpression(parsingContext, ihVar.f17387b, jSONObject, "condition", typeHelper, function1);
        JsonFieldResolver.resolveExpression(parsingContext, ihVar.f17388c, jSONObject, "label_id", TypeHelpersKt.TYPE_HELPER_STRING);
        return new dh();
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public final /* bridge */ /* synthetic */ Object resolve(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        return a(parsingContext, (ih) entityTemplate, (JSONObject) obj);
    }
}
