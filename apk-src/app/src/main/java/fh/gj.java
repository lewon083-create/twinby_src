package fh;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gj implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17296a;

    public gj(sy syVar) {
        this.f17296a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fj resolve(ParsingContext parsingContext, vj vjVar, JSONObject jSONObject) {
        boolean z5 = vjVar instanceof uj;
        sy syVar = this.f17296a;
        if (z5) {
            qj qjVar = (qj) syVar.f18497p5.getValue();
            sj sjVar = ((uj) vjVar).f18701a;
            qjVar.getClass();
            qj.a(parsingContext, sjVar, jSONObject);
            return new fj();
        }
        if (!(vjVar instanceof tj)) {
            throw new ij.j();
        }
        kj kjVar = (kj) syVar.f18468m5.getValue();
        mj mjVar = ((tj) vjVar).f18650a;
        kjVar.getClass();
        kj.a(parsingContext, mjVar, jSONObject);
        return new fj();
    }
}
