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
import io.sentry.rrweb.RRWebOptionsEvent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class jn implements TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17494a;

    public jn(sy syVar) {
        this.f17494a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final nn deserialize(ParsingContext parsingContext, nn nnVar, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        Field field = nnVar != null ? nnVar.f17976a : null;
        sy syVar = this.f17494a;
        Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, field, syVar.I);
        Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", ln.f17731j, allowPropertyOverride, nnVar != null ? nnVar.f17977b : null, v0.f18733v);
        Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", ln.f17732k, allowPropertyOverride, nnVar != null ? nnVar.f17978c : null, v0.f18734w);
        TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
        Field field2 = nnVar != null ? nnVar.f17979d : null;
        Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
        Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, ViewHierarchyNode.JsonKeys.ALPHA, typeHelper, allowPropertyOverride, field2, function1, ln.f17736o);
        Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, nnVar != null ? nnVar.f17980e : null, syVar.f18544u1);
        Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, A2.f22054g, allowPropertyOverride, nnVar != null ? nnVar.f17981f : null, syVar.G1);
        Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "border", allowPropertyOverride, nnVar != null ? nnVar.f17982g : null, syVar.M1);
        TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
        Field field3 = nnVar != null ? nnVar.f17983h : null;
        Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
        Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper2, allowPropertyOverride, field3, function12, ln.f17737p);
        Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, nnVar != null ? nnVar.i : null, syVar.P2);
        Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, nnVar != null ? nnVar.f17984j : null, syVar.f18346b3);
        Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, nnVar != null ? nnVar.f17985k : null, syVar.f18594z3);
        TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
        Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_family", typeHelper3, allowPropertyOverride, nnVar != null ? nnVar.f17986l : null);
        Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_size", typeHelper2, allowPropertyOverride, nnVar != null ? nnVar.f17987m : null, function12, ln.f17738q);
        Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_size_unit", ln.f17733l, allowPropertyOverride, nnVar != null ? nnVar.f17988n : null, hn.f17349o);
        Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT, allowPropertyOverride, nnVar != null ? nnVar.f17989o : null);
        Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_weight", ln.f17734m, allowPropertyOverride, nnVar != null ? nnVar.f17990p : null, w9.f18848w);
        Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_weight_value", typeHelper2, allowPropertyOverride, nnVar != null ? nnVar.f17991q : null, function12, ln.f17739r);
        Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, nnVar != null ? nnVar.f17992r : null, syVar.I3);
        Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, nnVar != null ? nnVar.f17993s : null, syVar.U6);
        TypeHelper<Integer> typeHelper4 = TypeHelpersKt.TYPE_HELPER_COLOR;
        Field field4 = nnVar != null ? nnVar.f17994t : null;
        Function1<Object, Integer> function13 = ParsingConvertersKt.STRING_TO_COLOR_INT;
        Field optionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "hint_color", typeHelper4, allowPropertyOverride, field4, function13);
        Field optionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "hint_text", typeHelper3, allowPropertyOverride, nnVar != null ? nnVar.f17995u : null);
        Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, nnVar != null ? nnVar.f17996v : null);
        Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, nnVar != null ? nnVar.f17997w : null, syVar.K4);
        Field optionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "letter_spacing", typeHelper, allowPropertyOverride, nnVar != null ? nnVar.f17998x : null, function1);
        Field optionalFieldWithExpression14 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "line_height", typeHelper2, allowPropertyOverride, nnVar != null ? nnVar.f17999y : null, function12, ln.f17740s);
        Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, nnVar != null ? nnVar.f18000z : null, syVar.Y2);
        Field field5 = nnVar != null ? nnVar.A : null;
        ij.p pVar = syVar.f18596z6;
        zj zjVar = ln.f17741t;
        Intrinsics.c(zjVar, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
        Field listField = JsonFieldParser.readListField(parsingContextRestrictPropertyOverride, jSONObject, RRWebOptionsEvent.EVENT_TAG, allowPropertyOverride, field5, pVar, zjVar);
        Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, nnVar != null ? nnVar.B : null, syVar.Y2);
        Field optionalFieldWithExpression15 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", typeHelper3, allowPropertyOverride, nnVar != null ? nnVar.C : null);
        Field optionalFieldWithExpression16 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper2, allowPropertyOverride, nnVar != null ? nnVar.D : null, function12, ln.f17742u);
        Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, nnVar != null ? nnVar.E : null, syVar.f18453l1);
        Field optionalFieldWithExpression17 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text_color", typeHelper4, allowPropertyOverride, nnVar != null ? nnVar.F : null, function13);
        Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, nnVar != null ? nnVar.G : null, syVar.P8);
        Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, nnVar != null ? nnVar.H : null, syVar.S8);
        Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, nnVar != null ? nnVar.I : null, syVar.V1);
        Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, nnVar != null ? nnVar.J : null, syVar.A1);
        Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, nnVar != null ? nnVar.K : null, syVar.A1);
        Field field6 = nnVar != null ? nnVar.L : null;
        kv kvVar = kv.f17646g;
        zj zjVar2 = ln.f17743v;
        Intrinsics.c(zjVar2, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
        return new nn(optionalField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField, optionalListField2, optionalField2, optionalFieldWithExpression4, optionalListField3, optionalListField4, optionalField3, optionalFieldWithExpression5, optionalFieldWithExpression6, optionalFieldWithExpression7, optionalFieldWithExpression8, optionalFieldWithExpression9, optionalFieldWithExpression10, optionalListField5, optionalField4, optionalFieldWithExpression11, optionalFieldWithExpression12, optionalField5, optionalField6, optionalFieldWithExpression13, optionalFieldWithExpression14, optionalField7, listField, optionalField8, optionalFieldWithExpression15, optionalFieldWithExpression16, optionalListField6, optionalFieldWithExpression17, optionalListField7, optionalField9, optionalField10, optionalField11, optionalField12, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field6, kvVar, zjVar2), JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "value_variable", allowPropertyOverride, nnVar != null ? nnVar.M : null), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, nnVar != null ? nnVar.N : null, syVar.V8), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, nnVar != null ? nnVar.O : null, syVar.f18352b9), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, ViewHierarchyNode.JsonKeys.VISIBILITY, ln.f17735n, allowPropertyOverride, nnVar != null ? nnVar.P : null, kv.f17653o), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, nnVar != null ? nnVar.Q : null, syVar.f18481n9), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, nnVar != null ? nnVar.R : null, syVar.f18481n9), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, nnVar != null ? nnVar.S : null, syVar.U6));
    }
}
