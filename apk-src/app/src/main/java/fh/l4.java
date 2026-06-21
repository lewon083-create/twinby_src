package fh;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class l4 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17672a;

    public l4(sy syVar) {
        this.f17672a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final nc.e resolve(ParsingContext parsingContext, m4 m4Var, JSONObject jSONObject) {
        Field field = m4Var.f17785a;
        sy syVar = this.f17672a;
        JsonFieldResolver.resolveExpression(parsingContext, m4Var.f17786b, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING);
        return new nc.e();
    }
}
