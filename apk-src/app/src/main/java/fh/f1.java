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
public final class f1 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17174a;

    public f1(sy syVar) {
        this.f17174a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final nc.e resolve(ParsingContext parsingContext, h1 h1Var, JSONObject jSONObject) {
        JsonFieldResolver.resolveOptionalExpression(parsingContext, h1Var.f17318b, jSONObject, "direction", g1.f17251a, v0.f18736y);
        Field field = h1Var.f17319c;
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "duration", typeHelper, function1, g1.f17253c);
        Field field2 = h1Var.f17320d;
        sy syVar = this.f17174a;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, h1Var.f17321e, jSONObject, "interpolator", g1.f17252b, v0.f18737z);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, h1Var.f17323g, jSONObject, "start_delay", typeHelper, function1, g1.f17254d);
        return new nc.e();
    }
}
