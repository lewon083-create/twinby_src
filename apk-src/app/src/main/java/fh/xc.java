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
public final class xc implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18999a;

    public xc(sy syVar) {
        this.f18999a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final tc resolve(ParsingContext parsingContext, bd bdVar, JSONObject jSONObject) {
        JsonFieldResolver.resolveOptionalExpression(parsingContext, bdVar.f16918a, jSONObject, "always_visible", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN, yc.f19091a);
        JsonFieldResolver.resolveExpression(parsingContext, bdVar.f16919b, jSONObject, "pattern", TypeHelpersKt.TYPE_HELPER_STRING);
        Field field = bdVar.f16920c;
        sy syVar = this.f18999a;
        JsonFieldResolver.resolveList(parsingContext, field, jSONObject, "pattern_elements", syVar.f18546u3, syVar.f18524s3, yc.f19092b);
        return new tc();
    }
}
