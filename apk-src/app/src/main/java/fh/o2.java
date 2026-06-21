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
public final class o2 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18027a;

    public o2(sy syVar) {
        this.f18027a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final wd.d resolve(ParsingContext parsingContext, p2 p2Var, JSONObject jSONObject) {
        Field field = p2Var.f18080a;
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        JsonFieldResolver.resolveExpression(parsingContext, field, jSONObject, "key", typeHelper);
        Field field2 = p2Var.f18081b;
        sy syVar = this.f18027a;
        JsonFieldResolver.resolveExpression(parsingContext, p2Var.f18082c, jSONObject, "variable_name", typeHelper);
        return new wd.d();
    }
}
