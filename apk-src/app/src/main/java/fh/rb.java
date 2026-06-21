package fh;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class rb implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18232a;

    public rb(sy syVar) {
        this.f18232a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final qb resolve(ParsingContext parsingContext, sb sbVar, JSONObject jSONObject) {
        if (sbVar == null) {
            throw new ij.j();
        }
        ((fo) this.f18232a.M6.getValue()).resolve(parsingContext, sbVar.f18300a, jSONObject);
        return new qb();
    }
}
