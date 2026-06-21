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
import io.sentry.protocol.DebugMeta;
import io.sentry.protocol.ViewHierarchyNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zs implements TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f19293a;

    public zs(sy syVar) {
        this.f19293a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ju deserialize(ParsingContext parsingContext, ju juVar, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        Field field = juVar != null ? juVar.f17507a : null;
        sy syVar = this.f19293a;
        Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, field, syVar.I);
        Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action", allowPropertyOverride, juVar != null ? juVar.f17509b : null, syVar.f18453l1);
        Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "action_animation", allowPropertyOverride, juVar != null ? juVar.f17511c : null, syVar.f18512r1);
        Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, juVar != null ? juVar.f17513d : null, syVar.f18453l1);
        TypeHelper typeHelper = bt.f16971q;
        Field field2 = juVar != null ? juVar.f17515e : null;
        v0 v0Var = v0.f18733v;
        Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", typeHelper, allowPropertyOverride, field2, v0Var);
        TypeHelper typeHelper2 = bt.f16972r;
        Field field3 = juVar != null ? juVar.f17517f : null;
        v0 v0Var2 = v0.f18734w;
        Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", typeHelper2, allowPropertyOverride, field3, v0Var2);
        TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
        Field field4 = juVar != null ? juVar.f17519g : null;
        Function1<Number, Double> function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
        Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, ViewHierarchyNode.JsonKeys.ALPHA, typeHelper3, allowPropertyOverride, field4, function1, bt.A);
        Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, juVar != null ? juVar.f17521h : null, syVar.f18544u1);
        TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
        Field field5 = juVar != null ? juVar.i : null;
        Function1<Object, Boolean> function12 = ParsingConvertersKt.ANY_TO_BOOLEAN;
        Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "auto_ellipsize", typeHelper4, allowPropertyOverride, field5, function12);
        Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, A2.f22054g, allowPropertyOverride, juVar != null ? juVar.f17523j : null, syVar.G1);
        Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "border", allowPropertyOverride, juVar != null ? juVar.f17525k : null, syVar.M1);
        Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "capture_focus_on_action", typeHelper4, allowPropertyOverride, juVar != null ? juVar.f17527l : null, function12);
        TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
        Field field6 = juVar != null ? juVar.f17529m : null;
        Function1<Number, Long> function13 = ParsingConvertersKt.NUMBER_TO_INT;
        Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper5, allowPropertyOverride, field6, function13, bt.B);
        Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, juVar != null ? juVar.f17531n : null, syVar.P2);
        Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "doubletap_actions", allowPropertyOverride, juVar != null ? juVar.f17533o : null, syVar.f18453l1);
        Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "ellipsis", allowPropertyOverride, juVar != null ? juVar.f17534p : null, syVar.A8);
        Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, juVar != null ? juVar.f17536q : null, syVar.f18346b3);
        Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, juVar != null ? juVar.f17538r : null, syVar.f18594z3);
        TypeHelper<Integer> typeHelper6 = TypeHelpersKt.TYPE_HELPER_COLOR;
        Field field7 = juVar != null ? juVar.f17539s : null;
        Function1<Object, Integer> function14 = ParsingConvertersKt.STRING_TO_COLOR_INT;
        Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "focused_text_color", typeHelper6, allowPropertyOverride, field7, function14);
        TypeHelper<String> typeHelper7 = TypeHelpersKt.TYPE_HELPER_STRING;
        Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_family", typeHelper7, allowPropertyOverride, juVar != null ? juVar.f17540t : null);
        Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_feature_settings", typeHelper7, allowPropertyOverride, juVar != null ? juVar.f17541u : null);
        Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_size", typeHelper5, allowPropertyOverride, juVar != null ? juVar.f17542v : null, function13, bt.C);
        Field optionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_size_unit", bt.f16973s, allowPropertyOverride, juVar != null ? juVar.f17543w : null, hn.f17349o);
        Field optionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT, allowPropertyOverride, juVar != null ? juVar.f17544x : null);
        Field optionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_weight", bt.f16974t, allowPropertyOverride, juVar != null ? juVar.f17545y : null, w9.f18848w);
        Field optionalFieldWithExpression14 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "font_weight_value", typeHelper5, allowPropertyOverride, juVar != null ? juVar.f17546z : null, function13, bt.D);
        Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, juVar != null ? juVar.A : null, syVar.I3);
        Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, juVar != null ? juVar.B : null, syVar.U6);
        Field optionalListField8 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "hover_end_actions", allowPropertyOverride, juVar != null ? juVar.C : null, syVar.f18453l1);
        Field optionalListField9 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "hover_start_actions", allowPropertyOverride, juVar != null ? juVar.D : null, syVar.f18453l1);
        Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, juVar != null ? juVar.E : null);
        Field optionalListField10 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, DebugMeta.JsonKeys.IMAGES, allowPropertyOverride, juVar != null ? juVar.F : null, syVar.f18549u8);
        Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, juVar != null ? juVar.G : null, syVar.K4);
        Field optionalFieldWithExpression15 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "letter_spacing", typeHelper3, allowPropertyOverride, juVar != null ? juVar.H : null, function1);
        Field optionalFieldWithExpression16 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "line_height", typeHelper5, allowPropertyOverride, juVar != null ? juVar.I : null, function13, bt.E);
        Field optionalListField11 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "longtap_actions", allowPropertyOverride, juVar != null ? juVar.J : null, syVar.f18453l1);
        Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, juVar != null ? juVar.K : null, syVar.Y2);
        Field optionalFieldWithExpression17 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "max_lines", typeHelper5, allowPropertyOverride, juVar != null ? juVar.L : null, function13, bt.F);
        Field optionalFieldWithExpression18 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "min_hidden_lines", typeHelper5, allowPropertyOverride, juVar != null ? juVar.M : null, function13, bt.G);
        Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, juVar != null ? juVar.N : null, syVar.Y2);
        Field optionalListField12 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "press_end_actions", allowPropertyOverride, juVar != null ? juVar.O : null, syVar.f18453l1);
        Field optionalListField13 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "press_start_actions", allowPropertyOverride, juVar != null ? juVar.P : null, syVar.f18453l1);
        Field optionalListField14 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "ranges", allowPropertyOverride, juVar != null ? juVar.Q : null, syVar.r8);
        Field optionalFieldWithExpression19 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", typeHelper7, allowPropertyOverride, juVar != null ? juVar.R : null);
        Field optionalFieldWithExpression20 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper5, allowPropertyOverride, juVar != null ? juVar.S : null, function13, bt.H);
        Field optionalFieldWithExpression21 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "selectable", typeHelper4, allowPropertyOverride, juVar != null ? juVar.T : null, function12);
        Field optionalListField15 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, juVar != null ? juVar.U : null, syVar.f18453l1);
        TypeHelper typeHelper8 = bt.f16975u;
        Field field8 = juVar != null ? juVar.V : null;
        mg mgVar = mg.f17856o;
        Field optionalFieldWithExpression22 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "strike", typeHelper8, allowPropertyOverride, field8, mgVar);
        Field fieldWithExpression = JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text", typeHelper7, allowPropertyOverride, juVar != null ? juVar.W : null);
        Field optionalFieldWithExpression23 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text_alignment_horizontal", bt.f16976v, allowPropertyOverride, juVar != null ? juVar.X : null, v0Var);
        Field optionalFieldWithExpression24 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text_alignment_vertical", bt.f16977w, allowPropertyOverride, juVar != null ? juVar.Y : null, v0Var2);
        Field optionalFieldWithExpression25 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "text_color", typeHelper6, allowPropertyOverride, juVar != null ? juVar.Z : null, function14);
        Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "text_gradient", allowPropertyOverride, juVar != null ? juVar.f17508a0 : null, syVar.W7);
        Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "text_shadow", allowPropertyOverride, juVar != null ? juVar.f17510b0 : null, syVar.I6);
        Field optionalFieldWithExpression26 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "tighten_width", typeHelper4, allowPropertyOverride, juVar != null ? juVar.f17512c0 : null, function12);
        Field optionalListField16 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, juVar != null ? juVar.f17514d0 : null, syVar.P8);
        Field optionalField14 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, juVar != null ? juVar.f17516e0 : null, syVar.S8);
        Field optionalField15 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, juVar != null ? juVar.f17518f0 : null, syVar.V1);
        Field optionalField16 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, juVar != null ? juVar.f17520g0 : null, syVar.A1);
        Field optionalField17 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, juVar != null ? juVar.h0 : null, syVar.A1);
        Field field9 = juVar != null ? juVar.f17522i0 : null;
        kv kvVar = kv.f17646g;
        xs xsVar = bt.I;
        Intrinsics.c(xsVar, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
        return new ju(optionalField, optionalField2, optionalField3, optionalListField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField2, optionalFieldWithExpression4, optionalListField3, optionalField4, optionalFieldWithExpression5, optionalFieldWithExpression6, optionalListField4, optionalListField5, optionalField5, optionalListField6, optionalField6, optionalFieldWithExpression7, optionalFieldWithExpression8, optionalFieldWithExpression9, optionalFieldWithExpression10, optionalFieldWithExpression11, optionalFieldWithExpression12, optionalFieldWithExpression13, optionalFieldWithExpression14, optionalListField7, optionalField7, optionalListField8, optionalListField9, optionalField8, optionalListField10, optionalField9, optionalFieldWithExpression15, optionalFieldWithExpression16, optionalListField11, optionalField10, optionalFieldWithExpression17, optionalFieldWithExpression18, optionalField11, optionalListField12, optionalListField13, optionalListField14, optionalFieldWithExpression19, optionalFieldWithExpression20, optionalFieldWithExpression21, optionalListField15, optionalFieldWithExpression22, fieldWithExpression, optionalFieldWithExpression23, optionalFieldWithExpression24, optionalFieldWithExpression25, optionalField12, optionalField13, optionalFieldWithExpression26, optionalListField16, optionalField14, optionalField15, optionalField16, optionalField17, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field9, kvVar, xsVar), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "truncate", bt.f16978x, allowPropertyOverride, juVar != null ? juVar.f17524j0 : null, kr.f17619n), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "underline", bt.f16979y, allowPropertyOverride, juVar != null ? juVar.f17526k0 : null, mgVar), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, juVar != null ? juVar.f17528l0 : null, syVar.V8), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, juVar != null ? juVar.f17530m0 : null, syVar.f18352b9), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, ViewHierarchyNode.JsonKeys.VISIBILITY, bt.f16980z, allowPropertyOverride, juVar != null ? juVar.f17532n0 : null, kv.f17653o), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, juVar != null ? juVar.o0 : null, syVar.f18481n9), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, juVar != null ? juVar.f17535p0 : null, syVar.f18481n9), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, juVar != null ? juVar.f17537q0 : null, syVar.U6));
    }
}
