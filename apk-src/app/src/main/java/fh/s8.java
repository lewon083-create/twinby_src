package fh;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class s8 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18295a;

    public s8(sy syVar) {
        this.f18295a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final r8 resolve(ParsingContext parsingContext, v8 v8Var, JSONObject jSONObject) {
        boolean z5 = v8Var instanceof u8;
        sy syVar = this.f18295a;
        if (z5) {
            p8 p8Var = (p8) syVar.T1.getValue();
            q8 q8Var = ((u8) v8Var).f18675a;
            p8Var.getClass();
            Field field = q8Var.f18150a;
            sy syVar2 = p8Var.f18086a;
            JsonFieldResolver.resolveList(parsingContext, field, jSONObject, "items", syVar2.W1, syVar2.U1, j6.f17464e);
            return new r8();
        }
        if (!(v8Var instanceof t8)) {
            throw new ij.j();
        }
        k8 k8Var = (k8) syVar.Q1.getValue();
        m8 m8Var = ((t8) v8Var).f18625a;
        k8Var.getClass();
        k8.a(parsingContext, m8Var, jSONObject);
        return new r8();
    }
}
