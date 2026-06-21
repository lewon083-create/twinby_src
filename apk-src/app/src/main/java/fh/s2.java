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
public final class s2 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18287a;

    public s2(sy syVar) {
        this.f18287a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final g8.g resolve(ParsingContext parsingContext, t2 t2Var, JSONObject jSONObject) {
        Field field = t2Var.f18612a;
        sy syVar = this.f18287a;
        JsonFieldResolver.resolveOptionalList(parsingContext, field, jSONObject, "on_fail_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, t2Var.f18613b, jSONObject, "on_success_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveExpression(parsingContext, t2Var.f18614c, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
        return new g8.g(23);
    }
}
