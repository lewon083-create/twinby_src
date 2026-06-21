package fh;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class s7 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18294a;

    public s7(sy syVar) {
        this.f18294a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final j6 resolve(ParsingContext parsingContext, y7 y7Var, JSONObject jSONObject) {
        boolean z5 = y7Var instanceof u7;
        sy syVar = this.f18294a;
        if (z5) {
            ((bi) syVar.O4.getValue()).resolve(parsingContext, ((u7) y7Var).f18674a, jSONObject);
            return new r7();
        }
        if (y7Var instanceof w7) {
            ((bm) syVar.f18458l6.getValue()).resolve(parsingContext, ((w7) y7Var).f18832a, jSONObject);
            return new r7();
        }
        if (y7Var instanceof t7) {
            ((re) syVar.V3.getValue()).resolve(parsingContext, ((t7) y7Var).f18624a, jSONObject);
            return new r7();
        }
        if (!(y7Var instanceof x7)) {
            if (!(y7Var instanceof v7)) {
                throw new ij.j();
            }
            ((pi) syVar.f18337a5.getValue()).resolve(parsingContext, ((v7) y7Var).f18748a, jSONObject);
            return new r7();
        }
        qp qpVar = (qp) syVar.k7.getValue();
        rp rpVar = ((x7) y7Var).f18993a;
        qpVar.getClass();
        qp.a(parsingContext, rpVar, jSONObject);
        return new r7();
    }
}
