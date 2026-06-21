package fh;

import android.net.Uri;
import com.yandex.div.data.EntityTemplate;
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
public final class pu implements TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sy f18134b;

    public /* synthetic */ pu(sy syVar, int i) {
        this.f18133a = i;
        this.f18134b = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        switch (this.f18133a) {
            case 0:
                fv fvVar = (fv) entityTemplate;
                JSONObject jSONObject = (JSONObject) obj;
                boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
                Field field = fvVar != null ? fvVar.f17234a : null;
                sy syVar = this.f18134b;
                return new fv(JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "animation_in", allowPropertyOverride, field, syVar.f18512r1), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "animation_out", allowPropertyOverride, fvVar != null ? fvVar.f17235b : null, syVar.f18512r1), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "background_accessibility_description", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, fvVar != null ? fvVar.f17236c : null), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "close_by_tap_outside", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, fvVar != null ? fvVar.f17237d : null, ParsingConvertersKt.ANY_TO_BOOLEAN), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "div", allowPropertyOverride, fvVar != null ? fvVar.f17238e : null, syVar.f18541t9), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "duration", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, fvVar != null ? fvVar.f17239f : null, ParsingConvertersKt.NUMBER_TO_INT, ru.f18265d), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, fvVar != null ? fvVar.f17240g : null), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "mode", allowPropertyOverride, fvVar != null ? fvVar.f17241h : null, syVar.M8), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "offset", allowPropertyOverride, fvVar != null ? fvVar.i : null, syVar.S5), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "position", ru.f18264c, allowPropertyOverride, fvVar != null ? fvVar.f17242j : null, kr.H), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tap_outside_actions", allowPropertyOverride, fvVar != null ? fvVar.f17243k : null, syVar.f18453l1));
            case 1:
                iv ivVar = (iv) entityTemplate;
                JSONObject jSONObject2 = (JSONObject) obj;
                boolean allowPropertyOverride2 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride2 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                Field field2 = ivVar != null ? ivVar.f17449a : null;
                sy syVar2 = this.f18134b;
                return new iv(JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride2, jSONObject2, "pivot_x", allowPropertyOverride2, field2, syVar2.P5), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride2, jSONObject2, "pivot_y", allowPropertyOverride2, ivVar != null ? ivVar.f17450b : null, syVar2.P5), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride2, jSONObject2, "rotation", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride2, ivVar != null ? ivVar.f17451c : null, ParsingConvertersKt.NUMBER_TO_DOUBLE));
            case 2:
                pv pvVar = (pv) entityTemplate;
                JSONObject jSONObject3 = (JSONObject) obj;
                boolean allowPropertyOverride3 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride3 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                Field field3 = pvVar != null ? pvVar.f18135a : null;
                ij.p pVar = this.f18134b.f18453l1;
                xs xsVar = ov.f18071c;
                Intrinsics.c(xsVar, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
                return new pv(JsonFieldParser.readListField(parsingContextRestrictPropertyOverride3, jSONObject3, "actions", allowPropertyOverride3, field3, pVar, xsVar), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride3, jSONObject3, "condition", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride3, pvVar != null ? pvVar.f18136b : null, ParsingConvertersKt.ANY_TO_BOOLEAN), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride3, jSONObject3, "mode", ov.f18070b, allowPropertyOverride3, pvVar != null ? pvVar.f18137c : null, kv.f17647h));
            case 3:
                vw vwVar = (vw) entityTemplate;
                JSONObject jSONObject4 = (JSONObject) obj;
                boolean allowPropertyOverride4 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride4 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                return new vw(JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride4, jSONObject4, "bitrate", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride4, vwVar != null ? vwVar.f18810a : null, ParsingConvertersKt.NUMBER_TO_INT), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride4, jSONObject4, "mime_type", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride4, vwVar != null ? vwVar.f18811b : null), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride4, jSONObject4, "resolution", allowPropertyOverride4, vwVar != null ? vwVar.f18812c : null, this.f18134b.f18418h9), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride4, jSONObject4, "url", TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride4, vwVar != null ? vwVar.f18813d : null, ParsingConvertersKt.ANY_TO_URI));
            default:
                bx bxVar = (bx) entityTemplate;
                JSONObject jSONObject5 = (JSONObject) obj;
                boolean allowPropertyOverride5 = parsingContext.getAllowPropertyOverride();
                ParsingContext parsingContextRestrictPropertyOverride5 = ParsingContextKt.restrictPropertyOverride(parsingContext);
                Field field4 = bxVar != null ? bxVar.f16983a : null;
                sy syVar3 = this.f18134b;
                Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride5, jSONObject5, "download_callbacks", allowPropertyOverride5, field4, syVar3.S2);
                Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride5, jSONObject5, "is_enabled", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride5, bxVar != null ? bxVar.f16984b : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
                Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride5, jSONObject5, "log_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride5, bxVar != null ? bxVar.f16985c : null);
                TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
                Field field5 = bxVar != null ? bxVar.f16986d : null;
                Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
                Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride5, jSONObject5, "log_limit", typeHelper, allowPropertyOverride5, field5, function1, ax.f16882e);
                Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride5, jSONObject5, "payload", allowPropertyOverride5, bxVar != null ? bxVar.f16987e : null);
                TypeHelper<Uri> typeHelper2 = TypeHelpersKt.TYPE_HELPER_URI;
                Field field6 = bxVar != null ? bxVar.f16988f : null;
                Function1<Object, Uri> function12 = ParsingConvertersKt.ANY_TO_URI;
                return new bx(optionalField, optionalFieldWithExpression, fieldWithExpression, optionalFieldWithExpression2, optionalField2, JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride5, jSONObject5, "referer", typeHelper2, allowPropertyOverride5, field6, function12), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride5, jSONObject5, "scope_id", allowPropertyOverride5, bxVar != null ? bxVar.f16989g : null), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride5, jSONObject5, "typed", allowPropertyOverride5, bxVar != null ? bxVar.f16990h : null, syVar3.f18356c1), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride5, jSONObject5, "url", typeHelper2, allowPropertyOverride5, bxVar != null ? bxVar.i : null, function12), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride5, jSONObject5, "visibility_duration", typeHelper, allowPropertyOverride5, bxVar != null ? bxVar.f16991j : null, function1, ax.f16883f), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride5, jSONObject5, "visibility_percentage", typeHelper, allowPropertyOverride5, bxVar != null ? bxVar.f16992k : null, function1, ax.f16884g));
        }
    }
}
