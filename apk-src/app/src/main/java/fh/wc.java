package fh;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateDeserializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class wc implements TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18887a;

    public wc(sy syVar) {
        this.f18887a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bd deserialize(ParsingContext parsingContext, bd bdVar, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "always_visible", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, bdVar != null ? bdVar.f16918a : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
        Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "pattern", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, bdVar != null ? bdVar.f16919b : null);
        Field field = bdVar != null ? bdVar.f16920c : null;
        ij.p pVar = this.f18887a.f18535t3;
        uc ucVar = yc.f19092b;
        Intrinsics.c(ucVar, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
        return new bd(optionalFieldWithExpression, fieldWithExpression, JsonFieldParser.readListField(parsingContextRestrictPropertyOverride, jSONObject, "pattern_elements", allowPropertyOverride, field, pVar, ucVar), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "raw_text_variable", allowPropertyOverride, bdVar != null ? bdVar.f16921d : null));
    }
}
