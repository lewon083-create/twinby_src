package fh;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import io.sentry.protocol.ViewHierarchyNode;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class bc implements TemplateResolver {
    public static yb a(ParsingContext parsingContext, dc dcVar, JSONObject jSONObject) {
        JsonFieldResolver.resolveOptionalExpression(parsingContext, dcVar.f17084a, jSONObject, ViewHierarchyNode.JsonKeys.ALPHA, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, cc.f17016f, cc.f17011a);
        Field field = dcVar.f17085b;
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "duration", typeHelper, function1, cc.f17017g, cc.f17012b);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, dcVar.f17086c, jSONObject, "interpolator", cc.f17015e, v0.f18737z, cc.f17013c);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, dcVar.f17087d, jSONObject, "start_delay", typeHelper, function1, cc.f17018h, cc.f17014d);
        return new yb();
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public final /* bridge */ /* synthetic */ Object resolve(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        return a(parsingContext, (dc) entityTemplate, (JSONObject) obj);
    }
}
