package fh;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class pl implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18105a;

    public pl(sy syVar) {
        this.f18105a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ol resolve(ParsingContext parsingContext, sl slVar, JSONObject jSONObject) {
        boolean z5 = slVar instanceof ql;
        sy syVar = this.f18105a;
        if (z5) {
            wl wlVar = (wl) syVar.Z5.getValue();
            yl ylVar = ((ql) slVar).f18193a;
            wlVar.getClass();
            wl.a(parsingContext, ylVar, jSONObject);
            return new ol();
        }
        if (!(slVar instanceof rl)) {
            throw new ij.j();
        }
        km kmVar = (km) syVar.f18393f6.getValue();
        lm lmVar = ((rl) slVar).f18249a;
        kmVar.getClass();
        JsonFieldResolver.resolveExpression(parsingContext, lmVar.f17722a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE);
        return new ol();
    }
}
