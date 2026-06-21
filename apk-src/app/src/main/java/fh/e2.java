package fh;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e2 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17128a;

    public e2(sy syVar) {
        this.f17128a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c2 resolve(ParsingContext parsingContext, h2 h2Var, JSONObject jSONObject) {
        boolean z5 = h2Var instanceof f2;
        sy syVar = this.f17128a;
        if (z5) {
            a0 a0Var = (a0) syVar.f18542u.getValue();
            b0 b0Var = ((f2) h2Var).f17175a;
            a0Var.getClass();
            JsonFieldResolver.resolveExpression(parsingContext, b0Var.f16888a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_STRING);
            return new c2();
        }
        if (!(h2Var instanceof g2)) {
            throw new ij.j();
        }
        e0 e0Var = (e0) syVar.f18571x.getValue();
        f0 f0Var = ((g2) h2Var).f17255a;
        e0Var.getClass();
        JsonFieldResolver.resolveExpression(parsingContext, f0Var.f17173a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
        return new c2();
    }
}
