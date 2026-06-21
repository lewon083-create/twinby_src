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
public final class p9 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18087a;

    public p9(sy syVar) {
        this.f18087a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final l9 resolve(ParsingContext parsingContext, r9 r9Var, JSONObject jSONObject) {
        Field field = r9Var.f18222a;
        sy syVar = this.f18087a;
        JsonFieldResolver.resolveOptionalList(parsingContext, field, jSONObject, "cancel_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, r9Var.f18223b, jSONObject, "direction", q9.f18154d, v0.f18736y, q9.f18151a);
        Field field2 = r9Var.f18224c;
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
        JsonFieldResolver.resolveExpression(parsingContext, field2, jSONObject, "duration", typeHelper, function1, q9.f18156f);
        JsonFieldResolver.resolveOptionalList(parsingContext, r9Var.f18225d, jSONObject, "end_actions", syVar.f18464m1, syVar.f18443k1);
        Field field3 = r9Var.f18226e;
        TypeHelper<Integer> typeHelper2 = TypeHelpersKt.TYPE_HELPER_COLOR;
        Function1<Object, Integer> function12 = ParsingConvertersKt.STRING_TO_COLOR_INT;
        JsonFieldResolver.resolveExpression(parsingContext, field3, jSONObject, "end_value", typeHelper2, function12);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, r9Var.f18228g, jSONObject, "interpolator", q9.f18155e, v0.f18737z, q9.f18152b);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, r9Var.i, jSONObject, "start_delay", typeHelper, function1, q9.f18157g, q9.f18153c);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, r9Var.f18230j, jSONObject, "start_value", typeHelper2, function12);
        return new l9();
    }
}
