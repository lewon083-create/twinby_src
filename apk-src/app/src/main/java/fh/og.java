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
public final class og implements TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18035a;

    public og(sy syVar) {
        this.f18035a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final yg deserialize(ParsingContext parsingContext, yg ygVar, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        Field field = ygVar != null ? ygVar.f19123a : null;
        sy syVar = this.f18035a;
        Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, field, syVar.I);
        TypeHelper typeHelper = qg.f18180q;
        Field field2 = ygVar != null ? ygVar.f19125b : null;
        v0 v0Var = v0.f18733v;
        Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", typeHelper, allowPropertyOverride, field2, v0Var);
        TypeHelper typeHelper2 = qg.f18181r;
        Field field3 = ygVar != null ? ygVar.f19127c : null;
        v0 v0Var2 = v0.f18734w;
        Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", typeHelper2, allowPropertyOverride, field3, v0Var2);
        TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
        Field field4 = ygVar != null ? ygVar.f19129d : null;
        Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
        Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, ViewHierarchyNode.JsonKeys.ALPHA, typeHelper3, allowPropertyOverride, field4, function1, qg.A);
        Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, ygVar != null ? ygVar.f19131e : null, syVar.f18544u1);
        Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "autocapitalization", qg.f18182s, allowPropertyOverride, ygVar != null ? ygVar.f19133f : null, be.F);
        Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, A2.f22054g, allowPropertyOverride, ygVar != null ? ygVar.f19135g : null, syVar.G1);
        Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "border", allowPropertyOverride, ygVar != null ? ygVar.f19137h : null, syVar.M1);
        TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
        Field field5 = ygVar != null ? ygVar.i : null;
        Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
        Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper4, allowPropertyOverride, field5, function12, qg.B);
        Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, ygVar != null ? ygVar.f19138j : null, syVar.P2);
        Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "enter_key_actions", allowPropertyOverride, ygVar != null ? ygVar.f19139k : null, syVar.f18453l1);
        Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "enter_key_type", qg.f18183t, allowPropertyOverride, ygVar != null ? ygVar.f19140l : null, be.G);
        Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, ygVar != null ? ygVar.f19141m : null, syVar.f18346b3);
        Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "filters", allowPropertyOverride, ygVar != null ? ygVar.f19142n : null, syVar.f18496p4);
        Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, ygVar != null ? ygVar.f19143o : null, syVar.f18594z3);
        TypeHelper<String> typeHelper5 = TypeHelpersKt.TYPE_HELPER_STRING;
        Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_family", typeHelper5, allowPropertyOverride, ygVar != null ? ygVar.f19144p : null);
        Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_size", typeHelper4, allowPropertyOverride, ygVar != null ? ygVar.f19145q : null, function12, qg.C);
        Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_size_unit", qg.f18184u, allowPropertyOverride, ygVar != null ? ygVar.f19146r : null, hn.f17349o);
        Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT, allowPropertyOverride, ygVar != null ? ygVar.f19147s : null);
        Field optionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_weight", qg.f18185v, allowPropertyOverride, ygVar != null ? ygVar.f19148t : null, w9.f18848w);
        Field optionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_weight_value", typeHelper4, allowPropertyOverride, ygVar != null ? ygVar.f19149u : null, function12, qg.D);
        Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, ygVar != null ? ygVar.f19150v : null, syVar.I3);
        Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, ygVar != null ? ygVar.f19151w : null, syVar.U6);
        TypeHelper<Integer> typeHelper6 = TypeHelpersKt.TYPE_HELPER_COLOR;
        Field field6 = ygVar != null ? ygVar.f19152x : null;
        Function1<Object, Integer> function13 = ParsingConvertersKt.STRING_TO_COLOR_INT;
        Field optionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "highlight_color", typeHelper6, allowPropertyOverride, field6, function13);
        Field optionalFieldWithExpression14 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "hint_color", typeHelper6, allowPropertyOverride, ygVar != null ? ygVar.f19153y : null, function13);
        Field optionalFieldWithExpression15 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "hint_text", typeHelper5, allowPropertyOverride, ygVar != null ? ygVar.f19154z : null);
        Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, ygVar != null ? ygVar.A : null);
        TypeHelper<Boolean> typeHelper7 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
        Field field7 = ygVar != null ? ygVar.B : null;
        Function1<Object, Boolean> function14 = ParsingConvertersKt.ANY_TO_BOOLEAN;
        Field optionalFieldWithExpression16 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "is_enabled", typeHelper7, allowPropertyOverride, field7, function14);
        Field optionalFieldWithExpression17 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "keyboard_type", qg.f18186w, allowPropertyOverride, ygVar != null ? ygVar.C : null, be.H);
        Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, ygVar != null ? ygVar.D : null, syVar.K4);
        Field optionalFieldWithExpression18 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "letter_spacing", typeHelper3, allowPropertyOverride, ygVar != null ? ygVar.E : null, function1);
        Field optionalFieldWithExpression19 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "line_height", typeHelper4, allowPropertyOverride, ygVar != null ? ygVar.F : null, function12, qg.E);
        Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, ygVar != null ? ygVar.G : null, syVar.Y2);
        Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "mask", allowPropertyOverride, ygVar != null ? ygVar.H : null, syVar.f18525s4);
        Field optionalFieldWithExpression20 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "max_length", typeHelper4, allowPropertyOverride, ygVar != null ? ygVar.I : null, function12, qg.F);
        Field optionalFieldWithExpression21 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "max_visible_lines", typeHelper4, allowPropertyOverride, ygVar != null ? ygVar.J : null, function12, qg.G);
        Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "native_interface", allowPropertyOverride, ygVar != null ? ygVar.K : null, syVar.H4);
        Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, ygVar != null ? ygVar.L : null, syVar.Y2);
        Field optionalFieldWithExpression22 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", typeHelper5, allowPropertyOverride, ygVar != null ? ygVar.M : null);
        Field optionalFieldWithExpression23 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper4, allowPropertyOverride, ygVar != null ? ygVar.N : null, function12, qg.H);
        Field optionalFieldWithExpression24 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "select_all_on_focus", typeHelper7, allowPropertyOverride, ygVar != null ? ygVar.O : null, function14);
        Field optionalListField8 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, ygVar != null ? ygVar.P : null, syVar.f18453l1);
        Field optionalFieldWithExpression25 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text_alignment_horizontal", qg.f18187x, allowPropertyOverride, ygVar != null ? ygVar.Q : null, v0Var);
        Field optionalFieldWithExpression26 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text_alignment_vertical", qg.f18188y, allowPropertyOverride, ygVar != null ? ygVar.R : null, v0Var2);
        Field optionalFieldWithExpression27 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text_color", typeHelper6, allowPropertyOverride, ygVar != null ? ygVar.S : null, function13);
        Field field8 = JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, "text_variable", allowPropertyOverride, ygVar != null ? ygVar.T : null);
        Field optionalListField9 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, ygVar != null ? ygVar.U : null, syVar.P8);
        Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, ygVar != null ? ygVar.V : null, syVar.S8);
        Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, ygVar != null ? ygVar.W : null, syVar.V1);
        Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, ygVar != null ? ygVar.X : null, syVar.A1);
        Field optionalField14 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, ygVar != null ? ygVar.Y : null, syVar.A1);
        Field field9 = ygVar != null ? ygVar.Z : null;
        kv kvVar = kv.f17646g;
        hf hfVar = qg.I;
        Intrinsics.c(hfVar, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
        return new yg(optionalField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField, optionalFieldWithExpression4, optionalListField2, optionalField2, optionalFieldWithExpression5, optionalListField3, optionalListField4, optionalFieldWithExpression6, optionalListField5, optionalListField6, optionalField3, optionalFieldWithExpression7, optionalFieldWithExpression8, optionalFieldWithExpression9, optionalFieldWithExpression10, optionalFieldWithExpression11, optionalFieldWithExpression12, optionalListField7, optionalField4, optionalFieldWithExpression13, optionalFieldWithExpression14, optionalFieldWithExpression15, optionalField5, optionalFieldWithExpression16, optionalFieldWithExpression17, optionalField6, optionalFieldWithExpression18, optionalFieldWithExpression19, optionalField7, optionalField8, optionalFieldWithExpression20, optionalFieldWithExpression21, optionalField9, optionalField10, optionalFieldWithExpression22, optionalFieldWithExpression23, optionalFieldWithExpression24, optionalListField8, optionalFieldWithExpression25, optionalFieldWithExpression26, optionalFieldWithExpression27, field8, optionalListField9, optionalField11, optionalField12, optionalField13, optionalField14, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field9, kvVar, hfVar), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "validators", allowPropertyOverride, ygVar != null ? ygVar.f19124a0 : null, syVar.B4), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, ygVar != null ? ygVar.f19126b0 : null, syVar.V8), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, ygVar != null ? ygVar.f19128c0 : null, syVar.f18352b9), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, ViewHierarchyNode.JsonKeys.VISIBILITY, qg.f18189z, allowPropertyOverride, ygVar != null ? ygVar.f19130d0 : null, kv.f17653o), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, ygVar != null ? ygVar.f19132e0 : null, syVar.f18481n9), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, ygVar != null ? ygVar.f19134f0 : null, syVar.f18481n9), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, ygVar != null ? ygVar.f19136g0 : null, syVar.U6));
    }
}
