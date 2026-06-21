package fh;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class dt implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17118a;

    public dt(sy syVar) {
        this.f17118a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ct resolve(ParsingContext parsingContext, gt gtVar, JSONObject jSONObject) {
        boolean z5 = gtVar instanceof ft;
        sy syVar = this.f17118a;
        if (!z5) {
            if (!(gtVar instanceof et)) {
                throw new ij.j();
            }
            ((e9) syVar.f18357c2.getValue()).resolve(parsingContext, ((et) gtVar).f17169a, jSONObject);
            return new ct();
        }
        qp qpVar = (qp) syVar.k7.getValue();
        rp rpVar = ((ft) gtVar).f17229a;
        qpVar.getClass();
        qp.a(parsingContext, rpVar, jSONObject);
        return new ct();
    }
}
