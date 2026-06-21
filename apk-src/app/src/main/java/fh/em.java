package fh;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class em implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17152a;

    public em(sy syVar) {
        this.f17152a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dm resolve(ParsingContext parsingContext, hm hmVar, JSONObject jSONObject) {
        boolean z5 = hmVar instanceof fm;
        sy syVar = this.f17152a;
        if (z5) {
            fd fdVar = (fd) syVar.f18575x3.getValue();
            hd hdVar = ((fm) hmVar).f17218a;
            fdVar.getClass();
            fd.a(parsingContext, hdVar, jSONObject);
            return new dm();
        }
        if (!(hmVar instanceof gm)) {
            throw new ij.j();
        }
        pm pmVar = (pm) syVar.f18426i6.getValue();
        rm rmVar = ((gm) hmVar).f17298a;
        pmVar.getClass();
        JsonFieldResolver.resolveExpression(parsingContext, rmVar.f18250a, jSONObject, "value", qm.f18194a, mg.F);
        return new dm();
    }
}
