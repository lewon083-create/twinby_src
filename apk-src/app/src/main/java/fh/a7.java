package fh;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a7 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f16799a;

    public a7(sy syVar) {
        this.f16799a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final j6 resolve(ParsingContext parsingContext, d7 d7Var, JSONObject jSONObject) {
        boolean z5 = d7Var instanceof b7;
        sy syVar = this.f16799a;
        if (z5) {
            ((p9) syVar.f18454l2.getValue()).resolve(parsingContext, ((b7) d7Var).f16904a, jSONObject);
            return new z6();
        }
        if (!(d7Var instanceof c7)) {
            throw new ij.j();
        }
        ((ui) syVar.f18370d5.getValue()).resolve(parsingContext, ((c7) d7Var).f17004a, jSONObject);
        return new z6();
    }
}
