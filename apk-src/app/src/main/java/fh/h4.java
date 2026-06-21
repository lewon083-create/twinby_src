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
public final class h4 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17325a;

    public h4(sy syVar) {
        this.f17325a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final g8.g resolve(ParsingContext parsingContext, i4 i4Var, JSONObject jSONObject) {
        JsonFieldResolver.resolveExpression(parsingContext, i4Var.f17379a, jSONObject, "lifetime", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT);
        JsonFieldResolver.resolveExpression(parsingContext, i4Var.f17380b, jSONObject, "name", TypeHelpersKt.TYPE_HELPER_STRING);
        Field field = i4Var.f17381c;
        sy syVar = this.f17325a;
        return new g8.g(24);
    }
}
