package fh;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class mo implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17885a;

    public mo(sy syVar) {
        this.f17885a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final lo resolve(ParsingContext parsingContext, qo qoVar, JSONObject jSONObject) {
        boolean z5 = qoVar instanceof no;
        sy syVar = this.f17885a;
        if (z5) {
            fd fdVar = (fd) syVar.f18575x3.getValue();
            hd hdVar = ((no) qoVar).f18001a;
            fdVar.getClass();
            fd.a(parsingContext, hdVar, jSONObject);
            return new lo();
        }
        if (qoVar instanceof oo) {
            ((hi) syVar.U4.getValue()).resolve(parsingContext, ((oo) qoVar).f18043a, jSONObject);
            return new lo();
        }
        if (!(qoVar instanceof po)) {
            throw new ij.j();
        }
        ((ex) syVar.f18519r9.getValue()).resolve(parsingContext, ((po) qoVar).f18106a, jSONObject);
        return new lo();
    }
}
