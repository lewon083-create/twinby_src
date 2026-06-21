package fh;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ho implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17362a;

    public ho(sy syVar) {
        this.f17362a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bo resolve(ParsingContext parsingContext, ko koVar, JSONObject jSONObject) {
        boolean z5 = koVar instanceof jo;
        sy syVar = this.f17362a;
        if (z5) {
            ((xm) syVar.f18517r6.getValue()).resolve(parsingContext, ((jo) koVar).f17495a, jSONObject);
            return new bo();
        }
        if (!(koVar instanceof io)) {
            throw new ij.j();
        }
        ((z8) syVar.Z1.getValue()).resolve(parsingContext, ((io) koVar).f17396a, jSONObject);
        return new bo();
    }
}
