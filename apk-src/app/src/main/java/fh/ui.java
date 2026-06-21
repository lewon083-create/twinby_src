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
public final class ui implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18700a;

    public ui(sy syVar) {
        this.f18700a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ri resolve(ParsingContext parsingContext, wi wiVar, JSONObject jSONObject) {
        Field field = wiVar.f18892a;
        sy syVar = this.f18700a;
        JsonFieldResolver.resolveOptionalList(parsingContext, field, jSONObject, "cancel_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, wiVar.f18893b, jSONObject, "direction", vi.f18780d, v0.f18736y, vi.f18777a);
        Field field2 = wiVar.f18894c;
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
        JsonFieldResolver.resolveExpression(parsingContext, field2, jSONObject, "duration", typeHelper, function1, vi.f18782f);
        JsonFieldResolver.resolveOptionalList(parsingContext, wiVar.f18895d, jSONObject, "end_actions", syVar.f18464m1, syVar.f18443k1);
        Field field3 = wiVar.f18896e;
        TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
        Function1<Number, Double> function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
        JsonFieldResolver.resolveExpression(parsingContext, field3, jSONObject, "end_value", typeHelper2, function12);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, wiVar.f18898g, jSONObject, "interpolator", vi.f18781e, v0.f18737z, vi.f18778b);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, wiVar.i, jSONObject, "start_delay", typeHelper, function1, vi.f18783g, vi.f18779c);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, wiVar.f18900j, jSONObject, "start_value", typeHelper2, function12);
        return new ri();
    }
}
