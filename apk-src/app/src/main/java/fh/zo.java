package fh;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zo implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f19280a;

    public zo(sy syVar) {
        this.f19280a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final wo resolve(ParsingContext parsingContext, bp bpVar, JSONObject jSONObject) {
        Field field = bpVar.f16949a;
        sy syVar = this.f19280a;
        Field field2 = bpVar.f16950b;
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "duration", typeHelper, function1, ap.f16847g, ap.f16841a);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, bpVar.f16951c, jSONObject, "edge", ap.f16845e, hn.f17351q, ap.f16842b);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, bpVar.f16952d, jSONObject, "interpolator", ap.f16846f, v0.f18737z, ap.f16843c);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, bpVar.f16953e, jSONObject, "start_delay", typeHelper, function1, ap.f16848h, ap.f16844d);
        return new wo();
    }
}
