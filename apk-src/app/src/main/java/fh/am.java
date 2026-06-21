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
public final class am implements TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f16836a;

    public am(sy syVar) {
        this.f16836a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final tm deserialize(ParsingContext parsingContext, tm tmVar, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        Field field = tmVar != null ? tmVar.f18651a : null;
        sy syVar = this.f16836a;
        Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "center_x", allowPropertyOverride, field, syVar.V5);
        Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "center_y", allowPropertyOverride, tmVar != null ? tmVar.f18652b : null, syVar.V5);
        Field field2 = tmVar != null ? tmVar.f18653c : null;
        ij.p pVar = syVar.f18478n6;
        zj zjVar = cm.f17032b;
        Intrinsics.c(zjVar, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
        Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "color_map", allowPropertyOverride, field2, pVar, zjVar);
        TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
        Field field3 = tmVar != null ? tmVar.f18654d : null;
        Function1<Object, Integer> function1 = ParsingConvertersKt.STRING_TO_COLOR_INT;
        zj zjVar2 = cm.f17031a;
        Intrinsics.c(zjVar2, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
        return new tm(optionalField, optionalField2, optionalListField, JsonFieldParser.readOptionalExpressionListField(parsingContextRestrictPropertyOverride, jSONObject, "colors", typeHelper, allowPropertyOverride, field3, function1, zjVar2), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "radius", allowPropertyOverride, tmVar != null ? tmVar.f18655e : null, syVar.f18349b6));
    }
}
