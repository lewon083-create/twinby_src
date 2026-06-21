package fh;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class df implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17089a;

    public df(sy syVar) {
        this.f17089a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cf resolve(ParsingContext parsingContext, gf gfVar, JSONObject jSONObject) {
        boolean z5 = gfVar instanceof ef;
        sy syVar = this.f17089a;
        if (!z5) {
            if (!(gfVar instanceof ff)) {
                throw new ij.j();
            }
            ((cq) syVar.f18539t7.getValue()).resolve(parsingContext, ((ff) gfVar).f17215a, jSONObject);
            return new cf();
        }
        fb fbVar = (fb) syVar.K2.getValue();
        hb hbVar = ((ef) gfVar).f17146a;
        fbVar.getClass();
        Field field = hbVar.f17334a;
        sy syVar2 = fbVar.f17193a;
        if (((cd) JsonFieldResolver.resolveOptional(parsingContext, field, jSONObject, "space_between_centers", syVar2.f18575x3, syVar2.f18554v3)) == null) {
            int i = gb.f17265a;
        }
        return new cf();
    }
}
