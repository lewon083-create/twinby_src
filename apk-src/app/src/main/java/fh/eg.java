package fh;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class eg implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17147a;

    public eg(sy syVar) {
        this.f17147a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final j6 resolve(ParsingContext parsingContext, lg lgVar, JSONObject jSONObject) {
        boolean z5 = lgVar instanceof kg;
        sy syVar = this.f17147a;
        if (z5) {
            hg hgVar = (hg) syVar.f18476n4.getValue();
            ig igVar = ((kg) lgVar).f17580a;
            hgVar.getClass();
            JsonFieldResolver.resolveExpression(parsingContext, igVar.f17385a, jSONObject, "pattern", TypeHelpersKt.TYPE_HELPER_STRING);
            return new yf();
        }
        if (!(lgVar instanceof jg)) {
            throw new ij.j();
        }
        cg cgVar = (cg) syVar.f18446k4.getValue();
        dg dgVar = ((jg) lgVar).f17490a;
        cgVar.getClass();
        JsonFieldResolver.resolveExpression(parsingContext, dgVar.f17090a, jSONObject, "condition", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN);
        return new yf();
    }
}
