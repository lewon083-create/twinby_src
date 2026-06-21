package fh;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i6 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17382a;

    public i6(sy syVar) {
        this.f17382a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final g8.g resolve(ParsingContext parsingContext, k6 k6Var, JSONObject jSONObject) {
        Field field = k6Var.f17563a;
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        JsonFieldResolver.resolveExpression(parsingContext, field, jSONObject, "path", typeHelper, j6.f17460a);
        Field field2 = k6Var.f17564b;
        sy syVar = this.f17382a;
        JsonFieldResolver.resolveExpression(parsingContext, k6Var.f17565c, jSONObject, "variable_name", typeHelper);
        return new g8.g(26);
    }
}
