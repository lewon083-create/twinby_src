package fh;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class v4 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18741a;

    public v4(sy syVar) {
        this.f18741a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final nc.e resolve(ParsingContext parsingContext, z4 z4Var, JSONObject jSONObject) {
        JsonFieldResolver.resolveExpression(parsingContext, z4Var.f19193a, jSONObject, "container_id", TypeHelpersKt.TYPE_HELPER_STRING);
        Field field = z4Var.f19194b;
        sy syVar = this.f18741a;
        JsonFieldResolver.resolveOptionalList(parsingContext, field, jSONObject, "on_fail_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, z4Var.f19195c, jSONObject, "on_success_actions", syVar.f18464m1, syVar.f18443k1);
        return new nc.e();
    }
}
