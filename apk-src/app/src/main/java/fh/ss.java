package fh;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ss implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18324a;

    public ss(sy syVar) {
        this.f18324a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final rs resolve(ParsingContext parsingContext, vs vsVar, JSONObject jSONObject) {
        boolean z5 = vsVar instanceof ts;
        sy syVar = this.f18324a;
        if (z5) {
            ((bi) syVar.O4.getValue()).resolve(parsingContext, ((ts) vsVar).f18662a, jSONObject);
            return new rs();
        }
        if (!(vsVar instanceof us)) {
            throw new ij.j();
        }
        ((bm) syVar.f18458l6.getValue()).resolve(parsingContext, ((us) vsVar).f18711a, jSONObject);
        return new rs();
    }
}
