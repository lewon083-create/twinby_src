package fh;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateDeserializer;
import io.appmetrica.analytics.impl.A2;
import io.sentry.protocol.ViewHierarchyNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class xq implements TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f19064a;

    public xq(sy syVar) {
        this.f19064a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ar deserialize(ParsingContext parsingContext, ar arVar, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        Field field = arVar != null ? arVar.f16850a : null;
        sy syVar = this.f19064a;
        Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, field, syVar.I);
        Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", zq.f19286f, allowPropertyOverride, arVar != null ? arVar.f16851b : null, v0.f18733v);
        Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", zq.f19287g, allowPropertyOverride, arVar != null ? arVar.f16852c : null, v0.f18734w);
        Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, ViewHierarchyNode.JsonKeys.ALPHA, TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, arVar != null ? arVar.f16853d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, zq.i);
        Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, arVar != null ? arVar.f16854e : null, syVar.f18544u1);
        Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, A2.f22054g, allowPropertyOverride, arVar != null ? arVar.f16855f : null, syVar.G1);
        Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "border", allowPropertyOverride, arVar != null ? arVar.f16856g : null, syVar.M1);
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        Field field2 = arVar != null ? arVar.f16857h : null;
        Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
        Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper, allowPropertyOverride, field2, function1, zq.f19289j);
        Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, arVar != null ? arVar.i : null, syVar.P2);
        Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, arVar != null ? arVar.f16858j : null, syVar.f18346b3);
        Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, arVar != null ? arVar.f16859k : null, syVar.f18594z3);
        Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, arVar != null ? arVar.f16860l : null, syVar.I3);
        Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, arVar != null ? arVar.f16861m : null, syVar.U6);
        Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, arVar != null ? arVar.f16862n : null);
        Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "is_enabled", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, arVar != null ? arVar.f16863o : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
        Field field3 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "is_on_variable", allowPropertyOverride, arVar != null ? arVar.f16864p : null);
        Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, arVar != null ? arVar.f16865q : null, syVar.K4);
        Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, arVar != null ? arVar.f16866r : null, syVar.Y2);
        Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "on_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, arVar != null ? arVar.f16867s : null, ParsingConvertersKt.STRING_TO_COLOR_INT);
        Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, arVar != null ? arVar.f16868t : null, syVar.Y2);
        Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, arVar != null ? arVar.f16869u : null);
        Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper, allowPropertyOverride, arVar != null ? arVar.f16870v : null, function1, zq.f19290k);
        Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, arVar != null ? arVar.f16871w : null, syVar.f18453l1);
        Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, arVar != null ? arVar.f16872x : null, syVar.P8);
        Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, arVar != null ? arVar.f16873y : null, syVar.S8);
        Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, arVar != null ? arVar.f16874z : null, syVar.V1);
        Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, arVar != null ? arVar.A : null, syVar.A1);
        Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, arVar != null ? arVar.B : null, syVar.A1);
        Field field4 = arVar != null ? arVar.C : null;
        kv kvVar = kv.f17646g;
        ep epVar = zq.f19291l;
        Intrinsics.c(epVar, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
        return new ar(optionalField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField, optionalListField2, optionalField2, optionalFieldWithExpression4, optionalListField3, optionalListField4, optionalField3, optionalListField5, optionalField4, optionalField5, optionalFieldWithExpression5, field3, optionalField6, optionalField7, optionalFieldWithExpression6, optionalField8, optionalFieldWithExpression7, optionalFieldWithExpression8, optionalListField6, optionalListField7, optionalField9, optionalField10, optionalField11, optionalField12, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field4, kvVar, epVar), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, arVar != null ? arVar.D : null, syVar.V8), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, arVar != null ? arVar.E : null, syVar.f18352b9), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, ViewHierarchyNode.JsonKeys.VISIBILITY, zq.f19288h, allowPropertyOverride, arVar != null ? arVar.F : null, kv.f17653o), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, arVar != null ? arVar.G : null, syVar.f18481n9), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, arVar != null ? arVar.H : null, syVar.f18481n9), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, arVar != null ? arVar.I : null, syVar.U6));
    }
}
