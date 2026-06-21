package fh;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class tu implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18664a;

    public tu(sy syVar) {
        this.f18664a = syVar;
    }

    public final su a(ev evVar) {
        boolean z5 = evVar instanceof dv;
        sy syVar = this.f18664a;
        if (z5) {
            ((av) syVar.K8.getValue()).getClass();
            return new su();
        }
        if (!(evVar instanceof cv)) {
            throw new ij.j();
        }
        ((wu) syVar.H8.getValue()).getClass();
        return new su();
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public final /* bridge */ /* synthetic */ Object resolve(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        return a((ev) entityTemplate);
    }
}
