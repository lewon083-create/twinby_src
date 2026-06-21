package fh;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class o1 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18026a;

    public o1(sy syVar) {
        this.f18026a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final g8.g resolve(ParsingContext parsingContext, p1 p1Var, JSONObject jSONObject) {
        JsonFieldResolver.resolveOptionalExpression(parsingContext, p1Var.f18077a, jSONObject, "index", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT);
        Field field = p1Var.f18078b;
        sy syVar = this.f18026a;
        JsonFieldResolver.resolveExpression(parsingContext, p1Var.f18079c, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING);
        return new g8.g(21);
    }
}
