package fh;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j7 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17481a;

    public j7(sy syVar) {
        this.f17481a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final i7 resolve(ParsingContext parsingContext, o7 o7Var, JSONObject jSONObject) {
        boolean z5 = o7Var instanceof m7;
        sy syVar = this.f17481a;
        if (z5) {
            g7 g7Var = (g7) syVar.y1.getValue();
            h7 h7Var = ((m7) o7Var).f17788a;
            g7Var.getClass();
            Field field = h7Var.f17329a;
            sy syVar2 = g7Var.f17259a;
            JsonFieldResolver.resolveList(parsingContext, field, jSONObject, "items", syVar2.B1, syVar2.z1, j6.f17461b);
            return new i7();
        }
        if (o7Var instanceof k7) {
            bc bcVar = (bc) syVar.f18390f3.getValue();
            dc dcVar = ((k7) o7Var).f17566a;
            bcVar.getClass();
            bc.a(parsingContext, dcVar, jSONObject);
            return new i7();
        }
        if (!(o7Var instanceof l7)) {
            if (!(o7Var instanceof n7)) {
                throw new ij.j();
            }
            ((zo) syVar.Y6.getValue()).resolve(parsingContext, ((n7) o7Var).f17932a, jSONObject);
            return new i7();
        }
        dn dnVar = (dn) syVar.f18547u6.getValue();
        fn fnVar = ((l7) o7Var).f17677a;
        dnVar.getClass();
        dn.a(parsingContext, fnVar, jSONObject);
        return new i7();
    }
}
