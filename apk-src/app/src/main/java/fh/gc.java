package fh;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gc implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17266a;

    public gc(sy syVar) {
        this.f17266a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final j6 resolve(ParsingContext parsingContext, nc ncVar, JSONObject jSONObject) {
        boolean z5 = ncVar instanceof lc;
        sy syVar = this.f17266a;
        if (!z5) {
            if (!(ncVar instanceof mc)) {
                throw new ij.j();
            }
            ((jc) syVar.f18423i3.getValue()).getClass();
            return new ec();
        }
        c8 c8Var = (c8) syVar.K1.getValue();
        d8 d8Var = ((lc) ncVar).f17685a;
        c8Var.getClass();
        JsonFieldResolver.resolveExpression(parsingContext, d8Var.f17054a, jSONObject, "radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, j6.f17463d);
        return new ec();
    }
}
