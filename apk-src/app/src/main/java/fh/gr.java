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
public final class gr implements TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17307a;

    public gr(sy syVar) {
        this.f17307a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final pr deserialize(ParsingContext parsingContext, pr prVar, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        Field field = prVar != null ? prVar.f18107a : null;
        sy syVar = this.f17307a;
        Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, field, syVar.I);
        Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", ir.f17419k, allowPropertyOverride, prVar != null ? prVar.f18108b : null, v0.f18733v);
        Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", ir.f17420l, allowPropertyOverride, prVar != null ? prVar.f18109c : null, v0.f18734w);
        Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, ViewHierarchyNode.JsonKeys.ALPHA, TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, prVar != null ? prVar.f18110d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, ir.f17422n);
        Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, prVar != null ? prVar.f18111e : null, syVar.f18544u1);
        Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, A2.f22054g, allowPropertyOverride, prVar != null ? prVar.f18112f : null, syVar.G1);
        Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "border", allowPropertyOverride, prVar != null ? prVar.f18113g : null, syVar.M1);
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        Field field2 = prVar != null ? prVar.f18114h : null;
        Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
        Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper, allowPropertyOverride, field2, function1, ir.f17423o);
        Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, prVar != null ? prVar.i : null, syVar.P2);
        TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
        Field field3 = prVar != null ? prVar.f18115j : null;
        Function1<Object, Boolean> function12 = ParsingConvertersKt.ANY_TO_BOOLEAN;
        Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "dynamic_height", typeHelper2, allowPropertyOverride, field3, function12);
        Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, prVar != null ? prVar.f18116k : null, syVar.f18346b3);
        Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, prVar != null ? prVar.f18117l : null, syVar.f18594z3);
        Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, prVar != null ? prVar.f18118m : null, syVar.I3);
        Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "has_separator", typeHelper2, allowPropertyOverride, prVar != null ? prVar.f18119n : null, function12);
        Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, prVar != null ? prVar.f18120o : null, syVar.U6);
        Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, prVar != null ? prVar.f18121p : null);
        Field field4 = prVar != null ? prVar.f18122q : null;
        ij.p pVar = syVar.T7;
        ep epVar = ir.f17424p;
        Intrinsics.c(epVar, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
        Field listField = JsonFieldParser.readListField(parsingContextRestrictPropertyOverride, jSONObject, "items", allowPropertyOverride, field4, pVar, epVar);
        Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, prVar != null ? prVar.f18123r : null, syVar.K4);
        Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, prVar != null ? prVar.f18124s : null, syVar.Y2);
        Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, prVar != null ? prVar.f18125t : null, syVar.Y2);
        Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "restrict_parent_scroll", typeHelper2, allowPropertyOverride, prVar != null ? prVar.f18126u : null, function12);
        Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, prVar != null ? prVar.f18127v : null);
        Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper, allowPropertyOverride, prVar != null ? prVar.f18128w : null, function1, ir.f17425q);
        Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, prVar != null ? prVar.f18129x : null, syVar.f18453l1);
        Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "selected_tab", typeHelper, allowPropertyOverride, prVar != null ? prVar.f18130y : null, function1, ir.f17426r);
        Field optionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "separator_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, prVar != null ? prVar.f18131z : null, ParsingConvertersKt.STRING_TO_COLOR_INT);
        Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "separator_paddings", allowPropertyOverride, prVar != null ? prVar.A : null, syVar.Y2);
        Field optionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "switch_tabs_by_content_swipe_enabled", typeHelper2, allowPropertyOverride, prVar != null ? prVar.B : null, function12);
        Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "tab_title_delimiter", allowPropertyOverride, prVar != null ? prVar.C : null, syVar.Q7);
        Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "tab_title_style", allowPropertyOverride, prVar != null ? prVar.D : null, syVar.N7);
        Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "title_paddings", allowPropertyOverride, prVar != null ? prVar.E : null, syVar.Y2);
        Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, prVar != null ? prVar.F : null, syVar.P8);
        Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, prVar != null ? prVar.G : null, syVar.S8);
        Field optionalField14 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, prVar != null ? prVar.H : null, syVar.V1);
        Field optionalField15 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, prVar != null ? prVar.I : null, syVar.A1);
        Field optionalField16 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, prVar != null ? prVar.J : null, syVar.A1);
        Field field5 = prVar != null ? prVar.K : null;
        kv kvVar = kv.f17646g;
        ep epVar2 = ir.f17427s;
        Intrinsics.c(epVar2, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
        return new pr(optionalField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalFieldWithExpression3, optionalListField, optionalListField2, optionalField2, optionalFieldWithExpression4, optionalListField3, optionalFieldWithExpression5, optionalListField4, optionalField3, optionalListField5, optionalFieldWithExpression6, optionalField4, optionalField5, listField, optionalField6, optionalField7, optionalField8, optionalFieldWithExpression7, optionalFieldWithExpression8, optionalFieldWithExpression9, optionalListField6, optionalFieldWithExpression10, optionalFieldWithExpression11, optionalField9, optionalFieldWithExpression12, optionalField10, optionalField11, optionalField12, optionalListField7, optionalField13, optionalField14, optionalField15, optionalField16, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field5, kvVar, epVar2), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, prVar != null ? prVar.L : null, syVar.V8), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, prVar != null ? prVar.M : null, syVar.f18352b9), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, ViewHierarchyNode.JsonKeys.VISIBILITY, ir.f17421m, allowPropertyOverride, prVar != null ? prVar.N : null, kv.f17653o), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, prVar != null ? prVar.O : null, syVar.f18481n9), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, prVar != null ? prVar.P : null, syVar.f18481n9), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, prVar != null ? prVar.Q : null, syVar.U6));
    }
}
