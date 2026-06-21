package fh;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class mq implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17911a;

    public mq(sy syVar) {
        this.f17911a = syVar;
    }

    public final hq a(tq tqVar) {
        boolean z5 = tqVar instanceof sq;
        sy syVar = this.f17911a;
        if (z5) {
            ((pq) syVar.f18597z7.getValue()).getClass();
            return new hq();
        }
        if (!(tqVar instanceof rq)) {
            throw new ij.j();
        }
        ((kq) syVar.f18568w7.getValue()).getClass();
        return new hq();
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public final /* bridge */ /* synthetic */ Object resolve(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        return a((tq) entityTemplate);
    }
}
