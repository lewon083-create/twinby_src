package fh;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateDeserializer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ai implements TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f16834a;

    public ai(sy syVar) {
        this.f16834a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ei deserialize(ParsingContext parsingContext, ei eiVar, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "angle", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, eiVar != null ? eiVar.f17148a : null, ParsingConvertersKt.NUMBER_TO_INT, ci.f17024b);
        Field field = eiVar != null ? eiVar.f17149b : null;
        ij.p pVar = this.f16834a.Q4;
        hf hfVar = ci.f17026d;
        Intrinsics.c(hfVar, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
        Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "color_map", allowPropertyOverride, field, pVar, hfVar);
        TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
        Field field2 = eiVar != null ? eiVar.f17150c : null;
        Function1<Object, Integer> function1 = ParsingConvertersKt.STRING_TO_COLOR_INT;
        hf hfVar2 = ci.f17025c;
        Intrinsics.c(hfVar2, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
        return new ei(optionalFieldWithExpression, optionalListField, JsonFieldParser.readOptionalExpressionListField(parsingContextRestrictPropertyOverride, jSONObject, "colors", typeHelper, allowPropertyOverride, field2, function1, hfVar2));
    }
}
