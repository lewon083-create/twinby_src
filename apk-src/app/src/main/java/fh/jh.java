package fh;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class jh implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17491a;

    public jh(sy syVar) {
        this.f17491a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final j6 resolve(ParsingContext parsingContext, sh shVar, JSONObject jSONObject) {
        boolean z5 = shVar instanceof rh;
        sy syVar = this.f17491a;
        if (z5) {
            nh nhVar = (nh) syVar.f18595z4.getValue();
            ph phVar = ((rh) shVar).f18238a;
            nhVar.getClass();
            nh.a(parsingContext, phVar, jSONObject);
            return new zg();
        }
        if (!(shVar instanceof qh)) {
            throw new ij.j();
        }
        gh ghVar = (gh) syVar.f18565w4.getValue();
        ih ihVar = ((qh) shVar).f18190a;
        ghVar.getClass();
        gh.a(parsingContext, ihVar, jSONObject);
        return new zg();
    }
}
