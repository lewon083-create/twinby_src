package fh;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class w3 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18821a;

    public w3(sy syVar) {
        this.f18821a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final t3 resolve(ParsingContext parsingContext, y3 y3Var, JSONObject jSONObject) {
        JsonFieldResolver.resolveOptionalExpression(parsingContext, y3Var.f19073a, jSONObject, "animated", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN, x3.f18982a);
        Field field = y3Var.f19074b;
        sy syVar = this.f18821a;
        JsonFieldResolver.resolveExpression(parsingContext, y3Var.f19075c, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING);
        return new t3();
    }
}
