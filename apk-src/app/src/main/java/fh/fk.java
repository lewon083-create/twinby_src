package fh;

import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class fk implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17217a;

    public fk(sy syVar) {
        this.f17217a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ek resolve(ParsingContext parsingContext, jk jkVar, JSONObject jSONObject) {
        boolean z5 = jkVar instanceof ik;
        sy syVar = this.f17217a;
        if (z5) {
            dj djVar = (dj) syVar.f18436j5.getValue();
            ej ejVar = ((ik) jkVar).f17393a;
            djVar.getClass();
            Field field = ejVar.f17151a;
            sy syVar2 = djVar.f17093a;
            return new ek();
        }
        if (!(jkVar instanceof gk)) {
            if (!(jkVar instanceof hk)) {
                throw new ij.j();
            }
            ((zi) syVar.f18403g5.getValue()).getClass();
            return new ek();
        }
        li liVar = (li) syVar.X4.getValue();
        mi miVar = ((gk) jkVar).f17297a;
        liVar.getClass();
        Field field2 = miVar.f17869a;
        sy syVar3 = liVar.f17708a;
        return new ek();
    }
}
