package fh;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class pt implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18132a;

    public pt(sy syVar) {
        this.f18132a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final lt resolve(ParsingContext parsingContext, eu euVar, JSONObject jSONObject) {
        boolean z5 = euVar instanceof cu;
        sy syVar = this.f18132a;
        if (z5) {
            ((tt) syVar.f18406g8.getValue()).resolve(parsingContext, ((cu) euVar).f17040a, jSONObject);
            return new lt();
        }
        if (!(euVar instanceof du)) {
            throw new ij.j();
        }
        zt ztVar = (zt) syVar.f18439j8.getValue();
        bu buVar = ((du) euVar).f17119a;
        ztVar.getClass();
        zt.a(parsingContext, buVar, jSONObject);
        return new lt();
    }
}
